package com.example.ola.dryclean.Activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.ola.dryclean.Adapters.PlacesAdapter;
import com.example.ola.dryclean.Objects.Setting;
import com.example.ola.dryclean.R;
import com.networkconnectinlib.webservice.Connection;
import com.networkconnectinlib.webservice.RequestStatus;
import com.networkconnectinlib.webservice.ResponseHandler;

import static com.example.ola.dryclean.Classes.Constants.GET_SETTING;

public class PlacesActivity extends AppCompatActivity implements ResponseHandler{
    private static final String TAG = "PlacesActivity";
    RecyclerView recyclerView;
     PlacesAdapter myAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);




        getData();

    }
    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    public void onRequestFinished(int requestId, RequestStatus requestStatus, int requestCode, String response) {
        Log.d(TAG, "PlacesActivity");

        switch (requestStatus) {
            case NO_INTERNET:
                //toast no connection
//                Toast.makeText(this ,"NO_INTERNET" ,Toast.LENGTH_SHORT).show();

                break;
            case NO_CONNECTION:
                //toast no connection
//                Toast.makeText(this ,"NO_CONNECTION" ,Toast.LENGTH_SHORT).show();

                break;
            case FAILED:
                //toast no connection
//                Toast.makeText(this ,"FAILED" ,Toast.LENGTH_SHORT).show();

                break;
            case SUCCEED:
                if (requestCode == 200) {
                    switch (requestId) {
                        case 1:

                          final   Setting setting = (Setting) Connection.getInstance().parseJsonToObject(response, Setting.class);
                            Log.d("succ",setting.getResult().getSuccess()+"");
                            if(setting.getResult().getSuccess()==1){
                                if(setting.getResult().getData()!=null){
                                    if (setting.getResult().getData().getProvinces().size()>0){
                                        myAdapter = new PlacesAdapter(this, setting.getResult().getData().getProvinces());
                                        recyclerView =(RecyclerView) findViewById(R.id.places_recycler);
                                        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
                                        recyclerView.setAdapter(myAdapter);
                                        recyclerView.setLayoutManager(layoutManager);
//                                        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
//                                        recyclerView.setLayoutManager(mLayoutManager);
                                        recyclerView.setItemAnimator(new DefaultItemAnimator());



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

        Connection.getInstance().get(1,this,GET_SETTING , this , true);
    }

}
