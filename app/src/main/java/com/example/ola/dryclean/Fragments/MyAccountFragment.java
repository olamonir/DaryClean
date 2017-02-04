package com.example.ola.dryclean.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ola.dryclean.Objects.UserInfo;
import com.example.ola.dryclean.R;
import com.networkconnectinlib.webservice.Connection;
import com.networkconnectinlib.webservice.RequestStatus;
import com.networkconnectinlib.webservice.ResponseHandler;

import static com.example.ola.dryclean.Classes.Constants.GET_USER_INFO;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyAccountFragment extends Fragment implements ResponseHandler {
    private static final String TAG = "MyAccountActivity";

    ImageView personImg ;
    TextView persontxt;
    TextView personNum;
    TextView personEmail;
    Button accountEdit;
    Button changeLang;
    Button signout;

    public MyAccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =inflater.inflate(R.layout.fragment_my_account, container, false);
        personImg = (ImageView)rootview. findViewById(R.id.person_img);
        persontxt = (TextView) rootview.findViewById(R.id.personName);
        personNum = (TextView) rootview.findViewById(R.id.telephoneNum);
        personEmail = (TextView) rootview.findViewById(R.id.emailtxt);
        accountEdit = (Button) rootview.findViewById(R.id.accountedit);
        changeLang = (Button) rootview.findViewById(R.id.changelang);
        signout = (Button) rootview.findViewById(R.id.signout);
        getData();

        return rootview;
    }

    @Override
    public void onRequestFinished(int requestId, RequestStatus requestStatus, int requestCode, String response) {
        Log.d(TAG, "onRequestFinished");
        switch (requestStatus) {
            case NO_INTERNET:
                //toast no connection
                Toast.makeText(getContext(), "NO_INTERNET", Toast.LENGTH_SHORT);

                break;
            case NO_CONNECTION:
                //toast no connection
                Toast.makeText(getContext(), "NO_CONNECTION", Toast.LENGTH_SHORT);

                break;
            case FAILED:
                //toast no connection
                Toast.makeText(getContext(), "FAILED", Toast.LENGTH_SHORT);

                break;
            case SUCCEED:
                if (requestCode == 200) {
                    switch (requestId) {
                        case 1:
                            final UserInfo userInfo = (UserInfo) Connection.getInstance().parseJsonToObject(response, UserInfo.class);

                            Log.d("succ", userInfo.getResult().getSuccess() + "");
                            if (userInfo.getResult().getSuccess() == 1) {
                                if (userInfo.getResult().getData() != null) {
//                                    if (userInfo.getResult().getData() > 0) {
                                    persontxt.setText(userInfo.getResult().getData().getUsername());
                                    personNum.setText(userInfo.getResult().getData().getPhone());
                                    personEmail.setText(userInfo.getResult().getData().getEmail());
//                                    }
                                }
                            }
                            break;
                    }
                }
        }

    }

    private void getData(){

        Connection.getInstance().get(1,getActivity(),GET_USER_INFO , this , true);
    }
}
