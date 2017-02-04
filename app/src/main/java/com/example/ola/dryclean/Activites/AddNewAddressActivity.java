package com.example.ola.dryclean.Activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ola.dryclean.Adapters.UserAddressesRecyclerView;
import com.example.ola.dryclean.Objects.UserInfo;
import com.example.ola.dryclean.R;
import com.networkconnectinlib.webservice.Connection;
import com.networkconnectinlib.webservice.RequestStatus;
import com.networkconnectinlib.webservice.ResponseHandler;

import java.util.List;

import static com.example.ola.dryclean.Classes.Constants.GET_USER_INFO;

public class AddNewAddressActivity extends AppCompatActivity implements ResponseHandler {
    private static final String TAG = "DryListActivity";

    RecyclerView recyclerView ;
    private UserAddressesRecyclerView myAdapter;
    TextView username ;
    private List<UserInfo> results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_address);
        getData();

    }





    @Override
    public void onRequestFinished(int requestId, RequestStatus requestStatus, int requestCode, String response) {
        Log.d(TAG, "onRequestFinished");
        switch (requestStatus) {
            case NO_INTERNET:
                //toast no connection
                Toast.makeText(this ,"NO_INTERNET" ,Toast.LENGTH_SHORT);

                break;
            case NO_CONNECTION:
                //toast no connection
                Toast.makeText(this ,"NO_CONNECTION" ,Toast.LENGTH_SHORT);

                break;
            case FAILED:
                //toast no connection
                Toast.makeText(this ,"FAILED" ,Toast.LENGTH_SHORT);

                break;
            case SUCCEED:
                if (requestCode == 200) {
                    switch (requestId) {
                        case 1:
                            final UserInfo userInfo = (UserInfo) Connection.getInstance().parseJsonToObject(response, UserInfo.class);
                            Log.d("succ",userInfo.getResult().getSuccess()+"");
                            if(userInfo.getResult().getSuccess()==1){
                                if(userInfo.getResult().getData()!=null){
                                    if (userInfo.getResult().getData().getAddresses().size()>0){
                                        recyclerView =(RecyclerView) findViewById(R.id.recycle);
                                        myAdapter= new UserAddressesRecyclerView(this,userInfo.getResult().getData().getAddresses());
                                        username = (TextView) findViewById(R.id.personNametxt) ;
                                        username .setText(userInfo.getResult().getData().getUsername());
                                        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                                        recyclerView.setLayoutManager(mLayoutManager);
                                        recyclerView.setItemAnimator(new DefaultItemAnimator());
                                        recyclerView.setAdapter(myAdapter);

                                    }
                                }
                            }
                            // mack sure data != null
                            // set adapter to list view with testObject.getResult().getData()

//                            Log.d("title",testObject.getResult().getData().get(0).getTitleAr());

                            //your object here ...

                            break;
                    }
                }
        }


    }


    private void getData(){
        Connection.getInstance().get(1,this,GET_USER_INFO , this , true);
    }

}
