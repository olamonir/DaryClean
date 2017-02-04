package com.example.ola.dryclean.Activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

public class MyAccountActivity extends AppCompatActivity  implements ResponseHandler {
    private static final String TAG = "MyAccountActivity";


    ImageView personImg ;
    TextView persontxt;
    TextView personNum;
    TextView personEmail;
    Button accountEdit;
    Button changeLang;
    Button signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
        personImg = (ImageView) findViewById(R.id.person_img);
        persontxt = (TextView) findViewById(R.id.personNametxt);
        personNum = (TextView) findViewById(R.id.telephoneNum);
        personEmail = (TextView) findViewById(R.id.emailtxt);
        accountEdit = (Button) findViewById(R.id.accountedit);
        changeLang = (Button) findViewById(R.id.changelang);
        signout = (Button) findViewById(R.id.signout);
        getData();

    }

    @Override
    public void onRequestFinished(int requestId, RequestStatus requestStatus, int requestCode, String response) {
        Log.d(TAG, "onRequestFinished");
        switch (requestStatus) {
            case NO_INTERNET:
                //toast no connection
                Toast.makeText(this, "NO_INTERNET", Toast.LENGTH_SHORT);

                break;
            case NO_CONNECTION:
                //toast no connection
                Toast.makeText(this, "NO_CONNECTION", Toast.LENGTH_SHORT);

                break;
            case FAILED:
                //toast no connection
                Toast.makeText(this, "FAILED", Toast.LENGTH_SHORT);

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
                                    persontxt.setText(userInfo.getResult().getData().getName());
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

        Connection.getInstance().get(1,this,GET_USER_INFO , this , true);
    }
}
