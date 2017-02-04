package com.networkconnectinlib.webservice;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.networkconnectinlib.dialogs.Dialogs;
import com.networkconnectinlib.network.NetworkStatus;
import com.networkconnectinlib.network.NetworkUtil;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.entity.InputStreamEntity;
import cz.msebera.android.httpclient.entity.mime.HttpMultipartMode;
import cz.msebera.android.httpclient.entity.mime.MultipartEntityBuilder;

/**
 *
 * Handle connection to web service and return the response.Needs to compile loopj android-async-http library and
 * google gson library in build.gradle and add INTERNET permission in the manifest.
 */
public class Connection {

    private static final String TAG = "Connection";
    private static Connection instance = null;
    private AsyncHttpClient client;
    private Gson gson;
    private int TIME_OUT = 40 * 1000;

    /**
     * A private Constructor prevents any other class from instantiating.
     */
    private Connection() {

        client = new AsyncHttpClient();
        gson = new GsonBuilder().serializeNulls().create();
    }

    /**
     * Make sure that there is only one Connection instance.
     *
     * @return Returns only one instance of Connection.
     */
    public static Connection getInstance() {

        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }

    /**
     * Perform a HTTP GET request.
     *
     * @param requestID       A unique id to simply identify request.
     * @param context         The android Context instance associated to the request.
     * @param url             The URL to send the request to.
     * @param responseHandler The response handler instance that should handle the response.
     */
    public void get(final int requestID, Context context, final String url, final ResponseHandler responseHandler, final boolean showLoadingDialog) {

        Dialog dialogLoading = null;
        if (showLoadingDialog) {
            dialogLoading = new Dialogs().showDialog(context);
        }
        NetworkStatus networkStatus = NetworkUtil.getConnectivityStatus(context);
        if (networkStatus == NetworkStatus.OFFLINE) {
            responseHandler.onRequestFinished(requestID, RequestStatus.NO_CONNECTION, 0, null);
            if (dialogLoading != null) {
                dialogLoading.dismiss();
            }
        } else if (networkStatus == NetworkStatus.WIFI_CONNECTED_WITHOUT_INTERNET) {
            responseHandler.onRequestFinished(requestID, RequestStatus.NO_INTERNET, 0, null);
            if (dialogLoading != null) {
                dialogLoading.dismiss();
            }
        } else {
            final Dialog mdialogLoading = dialogLoading;
            Log.d(TAG + " URL ", url + "");
            client.setTimeout(TIME_OUT);
//            client.setTimeout(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
            client.get(context, url, new AsyncHttpResponseHandler() {
                @Override
                public void onStart() {
                    Log.v("URL", url);
                }

                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    if (responseBody != null) {
                        String response = new String(responseBody);
                        Log.v("Response", response + "");
                        responseHandler.onRequestFinished(requestID, RequestStatus.SUCCEED, statusCode, response);
                    } else {
                        responseHandler.onRequestFinished(requestID, RequestStatus.SUCCEED, statusCode, null);
                    }
                    if (mdialogLoading != null) {
                        mdialogLoading.dismiss();
                    }

                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    if (responseBody != null) {
                        String response = new String(responseBody);
                        Log.v("Response", response + "");
                        responseHandler.onRequestFinished(requestID, RequestStatus.FAILED, statusCode, response);
                    } else {
                        responseHandler.onRequestFinished(requestID, RequestStatus.FAILED, statusCode, null);
                    }
                    if (mdialogLoading != null) {
                        mdialogLoading.dismiss();
                    }
                }
            });
        }
    }

    /**
     * Perform a HTTP POST request.
     *
     * @param requestID       A unique id to simply identify request.
     * @param context         The android Context instance associated to the request.
     * @param json            Json which will send with the request (make a JSONArray and JSONObject and use toString()).
     * @param contentType     The content type of the payload you are sending, for example application/json if sending a json payload.
     * @param url             The URL to send the request to.
     * @param responseHandler The response handler instance that should handle the response.
     */
    public void postJson(final int requestID, final Context context, final String json,
                         String contentType, final String url,
                         final ResponseHandler responseHandler, final boolean showLoadingDialog) {

        Dialog dialogLoading = null;
        if (showLoadingDialog) {
            dialogLoading = new Dialogs().showDialog(context);
        }

        NetworkStatus networkStatus = NetworkUtil.getConnectivityStatus(context);
        if (networkStatus == NetworkStatus.OFFLINE) {
            responseHandler.onRequestFinished(requestID, RequestStatus.NO_CONNECTION, 0, null);
            if (showLoadingDialog) {
                dialogLoading.dismiss();
            }
        } else if (networkStatus == NetworkStatus.WIFI_CONNECTED_WITHOUT_INTERNET) {
            responseHandler.onRequestFinished(requestID, RequestStatus.NO_INTERNET, 0, null);
            if (showLoadingDialog) {
                dialogLoading.dismiss();
            }
        } else {
            InputStream is = null;
            InputStreamEntity entity = null;
            try {
                is = new ByteArrayInputStream(json.getBytes("UTF-8"));
                entity = new InputStreamEntity(is, is.available());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            final Dialog mdialogLoading = dialogLoading;
//            client.setTimeout(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
            client.setTimeout(TIME_OUT);
            client.post(context, url, entity, contentType, new AsyncHttpResponseHandler() {

                @Override
                public void onStart() {
                    Log.v("URL", url);
                    Log.v("Request", json + "");
                }

                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    if (responseBody != null) {
                        String response = new String(responseBody);
                        Log.v("Response onSuccess", response + "");
                        responseHandler.onRequestFinished(requestID, RequestStatus.SUCCEED, statusCode, response);
                    } else {
                        responseHandler.onRequestFinished(requestID, RequestStatus.SUCCEED, statusCode, null);
                    }
                    if (mdialogLoading != null) {
                        mdialogLoading.dismiss();
                    }
                }

                @Override
                public void onFailure(int statusCode, Header[] headers,
                                      byte[] responseBody, Throwable error) {
                    if (responseBody != null) {
                        String response = new String(responseBody);
                        Log.v("Response onFailure", response + "");
                        responseHandler.onRequestFinished(requestID, RequestStatus.FAILED, statusCode, response);
                    } else {
                        responseHandler.onRequestFinished(requestID, RequestStatus.FAILED, statusCode, null);
                    }
                    if (mdialogLoading != null) {
                        mdialogLoading.dismiss();
                    }
                }
            });
        }
    }

    /**
     * Perform a HTTP POST request with parameters.
     *
     * @param requestID       A unique id to simply identify request.
     * @param context         The android Context instance associated to the request.
     * @param params          Additional POST parameters or files to send with the request.
     * @param url             The URL to send the request to.
     * @param responseHandler The response handler instance that should handle the response.
     */
    public void postParams(final int requestID, Context context, final RequestParams params,
                           final String url, final ResponseHandler responseHandler) {

        NetworkStatus networkStatus = NetworkUtil.getConnectivityStatus(context);
        if (networkStatus == NetworkStatus.OFFLINE)
            responseHandler.onRequestFinished(requestID, RequestStatus.NO_CONNECTION, 0, null);
        if (networkStatus == NetworkStatus.WIFI_CONNECTED_WITHOUT_INTERNET)
            responseHandler.onRequestFinished(requestID, RequestStatus.NO_INTERNET, 0, null);
        // else
        client.setTimeout(TIME_OUT);
//        client.setTimeout(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
        client.post(context, url, params, new AsyncHttpResponseHandler() {

            @Override
            public void onStart() {
                Log.v("URL", url);
                Log.v("Request", params.toString() + "");
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (responseBody != null) {
                    String response = new String(responseBody);
                    Log.v("Response", response + "");
                    responseHandler.onRequestFinished(requestID, RequestStatus.SUCCEED, statusCode, response);
                } else {
                    responseHandler.onRequestFinished(requestID, RequestStatus.SUCCEED, statusCode, null);
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                if (responseBody != null) {
                    String response = new String(responseBody);
                    Log.v("Response", response + "");
                    responseHandler.onRequestFinished(requestID, RequestStatus.FAILED, statusCode, response);
                } else {
                    responseHandler.onRequestFinished(requestID, RequestStatus.FAILED, statusCode, null);
                }
            }
        });
    }

    /**
     * Cancels all pending (or potentially active) requests. Used in the onDestroy method
     * of your android activity to destroy all requests which are no longer required.
     *
     * @param mayInterruptIfRunning specifies if active requests should be cancelled along with pending requests.
     */
    public void cancelAllRequests(boolean mayInterruptIfRunning) {
        client.cancelAllRequests(mayInterruptIfRunning);
    }

    /**
     * This method deserialize the specified Json into an object of the specified class.
     *
     * @param response   The string from which the object is to be deserialized.
     * @param modelClass The model class.
     * @return An object from the json and returns null if json is null.
     */
    public Object parseJsonToObject(String response, Class<?> modelClass) {

        try {
            return gson.fromJson(response, modelClass);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * This method serializes the specified object into its equivalent Json representation.
     *
     * @param object The object which Json will represent.
     * @return Json representation of src.
     */
    public String parseObjectToJson(Object object) {

        return gson.toJson(object);
    }

    /**
     * Perform a HTTP POST request.
     *
     * @param requestID       A unique id to simply identify request.
     * @param context         The android Context instance associated to the request.
     * @param file            Json which will send with the request (make a JSONArray and JSONObject and use toString()).
     * @param contentType     The content type of the payload you are sending, for example application/json if sending a json payload.
     * @param url             The URL to send the request to.
     * @param responseHandler The response handler instance that should handle the response.
     */
    public void postJsonRecord(final int requestID, final Context context, final String file,
                               String contentType, final String url,
                               final ResponseHandler responseHandler, final boolean showLoadingDialog) {

        Dialog dialogLoading = null;
        if (showLoadingDialog) {
            dialogLoading = new Dialogs().showDialog(context);
        }

        NetworkStatus networkStatus = NetworkUtil.getConnectivityStatus(context);
        if (networkStatus == NetworkStatus.OFFLINE) {
            responseHandler.onRequestFinished(requestID, RequestStatus.NO_CONNECTION, 0, null);
            if (showLoadingDialog) {
                dialogLoading.dismiss();
            }
        } else if (networkStatus == NetworkStatus.WIFI_CONNECTED_WITHOUT_INTERNET) {
            responseHandler.onRequestFinished(requestID, RequestStatus.NO_INTERNET, 0, null);
            if (showLoadingDialog) {
                dialogLoading.dismiss();
            }
        } else {
            InputStream is = null;
//            InputStreamEntity entity = null;
            MultipartEntityBuilder entityBuilder = null;
            HttpEntity entitys;
            HttpPost post = new HttpPost("http://www.ya-doc.com/api/upload/post");
            try {
                /*
                 InputStreamEntity reqEntity = new InputStreamEntity(
            new FileInputStream(file), -1);
                 */
//                is = new ByteArrayInputStream(json.getBytes("UTF-8"));
                File filee = new File(file);
                entityBuilder = MultipartEntityBuilder.create();
                entityBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
                entityBuilder.addBinaryBody("uploadfile", filee);
//                is = new ByteArrayInputStream(filee);
//                entity = new InputStreamEntity(is, is.available());
//                entity = new InputStreamEntity(new FileInputStream(file), -1);
            } catch (Exception e) {
                e.printStackTrace();
            }
//            catch (Exception e) {
//                e.printStackTrace();
//            }

            final Dialog mdialogLoading = dialogLoading;
//            client.setTimeout(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
            client.setTimeout(TIME_OUT);
            entitys = entityBuilder.build();
//            post.setEntity(entitys);
            client.post(context, url, entitys, contentType, new AsyncHttpResponseHandler() {

                @Override
                public void onStart() {
                    Log.v("URL", url);
                    Log.v("Request", file + "");
                }

                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    if (responseBody != null) {
                        String response = new String(responseBody);
                        Log.v("Response", response + "");
                        responseHandler.onRequestFinished(requestID, RequestStatus.SUCCEED, statusCode, response);
                    } else {
                        responseHandler.onRequestFinished(requestID, RequestStatus.SUCCEED, statusCode, null);
                    }
                    if (mdialogLoading != null) {
                        mdialogLoading.dismiss();
                    }
                }

                @Override
                public void onFailure(int statusCode, Header[] headers,
                                      byte[] responseBody, Throwable error) {
                    if (responseBody != null) {
                        String response = new String(responseBody);
                        Log.v("Response", response + "");
                        responseHandler.onRequestFinished(requestID, RequestStatus.FAILED, statusCode, response);
                    } else {
                        responseHandler.onRequestFinished(requestID, RequestStatus.FAILED, statusCode, null);
                    }
                    if (mdialogLoading != null) {
                        mdialogLoading.dismiss();
                    }
                }
            });
        }
    }

    public AsyncHttpClient getClient() {
        if (client != null)
            return client;
        else
            throw new NullPointerException("You must initialize Connection class first");
    }
}