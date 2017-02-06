package com.example.ola.dryclean.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.ola.dryclean.R;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class SplashActivity extends AppCompatActivity  {
    private static final String TAG = "SplashActivity";
    private static int SPLASH_TIME_OUT = 3000;

    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        initRealm();
        realm = Realm.getDefaultInstance();

        // if found net
        //if(net found){
        //  getSetting();
        // }else{
        //  Intent i = new Intent(SplashActivity.this, MainActivity.class);
        // startActivity(i);
        // }

//        getSetting();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startApplication();

                // close this activity
            }
            }, SPLASH_TIME_OUT);

    }


//        startApplication();


    public void initRealm() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();

        Realm.setDefaultConfiguration(config);
    }

    private void startApplication() {
        Intent mainActivityIntent = new Intent(this, MainActivity.class);
        startActivity(mainActivityIntent);
        finish();

    }

//    private void getSetting() {
//        Connection.getInstance().get(1, this, GET_SETTING, this, true);
//    }

//    private void getSettingfdsfasdf() {
//        Connection.getInstance().get(2, this, GET_LUNDRY_INFO, this, false);
//    }


//    @Override
//    public void onRequestFinished(int requestId, RequestStatus requestStatus, int requestCode, String response) {
//        Log.d(TAG, "onRequestFinished");
//        switch (requestStatus) {
//            case NO_INTERNET:
//                //toast no connection
//                Toast.makeText(this, "NO_INTERNET", Toast.LENGTH_SHORT);
//
//                break;
//            case NO_CONNECTION:
//                //toast no connection
//                Toast.makeText(this, "NO_CONNECTION", Toast.LENGTH_SHORT);
//
//                break;
//            case FAILED:
//                //toast no connection
//                Toast.makeText(this, "FAILED", Toast.LENGTH_SHORT);
//
//                break;
//            case SUCCEED:
//                if (requestCode == 200) {
//                    switch (requestId) {
//                        case 1:
//                            final Setting setting = (Setting) Connection.getInstance().parseJsonToObject(response, Setting.class);
//                            Log.d("succ", setting.getResult().getSuccess() + "");
//                            if (setting.getResult().getSuccess() == 1) {
//                                if (setting.getResult().getData() != null) {
//                                    if (setting.getResult().getData().getSettings() != null) {
//                                        Log.d("title arabic", setting.getResult().getData().getSettings().getSiteNameAr());
//                                        // sava this data bs b3deen n4ob 3awzha f eeh
//                                        Intent i = new Intent(SplashActivity.this, MainActivity.class);
//                                        startActivity(i);
//                                    }
//                                }
//                            }
//
//                            break;
////                        case 2: // to test two service in one activity
////                            final Setting setting = (Setting) Connection.getInstance().parseJsonToObject(response, Setting.class);
////                            Log.d("succ", setting.getResult().getSuccess() + "");
////                            if (setting.getResult().getSuccess() == 1) {
////                                if (setting.getResult().getData() != null) {
////                                    if (setting.getResult().getData().getSettings() != null) {
////                                        Log.d("title arabic", setting.getResult().getData().getSettings().getSiteNameAr());
////                                        // sava this data bs b3deen n4ob 3awzha f eeh
////                                        Intent i = new Intent(SplashActivity.this, MainActivity.class);
////                                        startActivity(i);
////                                    }
////                                }
////                            }
//
////                            break;
//                    }
//                }
//        }
//
//
//    }
}
