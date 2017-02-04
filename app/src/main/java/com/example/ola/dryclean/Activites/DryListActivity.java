package com.example.ola.dryclean.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.ola.dryclean.Adapters.RcyclerViewAdapterDryList;
import com.example.ola.dryclean.Classes.RecyclerItemClickListener;
import com.example.ola.dryclean.Objects.TestObject;
import com.example.ola.dryclean.R;
import com.networkconnectinlib.webservice.Connection;
import com.networkconnectinlib.webservice.RequestStatus;
import com.networkconnectinlib.webservice.ResponseHandler;

import java.util.List;

import static com.example.ola.dryclean.Classes.Constants.GET_DRY_LIST;

public class DryListActivity extends AppCompatActivity  implements ResponseHandler {

    private static final String TAG = "DryListActivity";

    RecyclerView recyclerView ;
//    private DryListAdapter myAdapter;
    private RcyclerViewAdapterDryList myAdapter;
    private List<TestObject> results;
    private int currentScrollState = 0;
    private boolean loadMoreFlag = true;
    private boolean isLastCellReached = false;
    private boolean isLoading = true;
    private int currentPage = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry_list);

        getData();



    }
    @Override
    protected void onStart() {
        super.onStart();

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
                             final TestObject testObject = (TestObject) Connection.getInstance().parseJsonToObject(response, TestObject.class);

                            Log.d("succ",testObject.getResult().getSuccess()+"");
                            if(testObject.getResult().getSuccess()==1){
                                if(testObject.getResult().getData()!=null){
                                    if (testObject.getResult().getData().size()>0){
                                        recyclerView =(RecyclerView) findViewById(R.id.recycler_dry_list);
                                        myAdapter= new RcyclerViewAdapterDryList(this,testObject.getResult().getData());
                                        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                                        recyclerView.setLayoutManager(mLayoutManager);
                                        recyclerView.setItemAnimator(new DefaultItemAnimator());
                                        recyclerView.setAdapter(myAdapter);
                                        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplication(), new RecyclerItemClickListener.OnItemClickListener() {

                                            @Override
                                            public void onItemClick(View view, int position) {
                                                Intent intent = new Intent(getApplication(),DryDetailsActivity.class);
                                                intent.putExtra(DryDetailsActivity.ARG_POST_ID, testObject.getResult().getData().get(position).getId());
                                                startActivity(intent);
                                            }}));

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

        Connection.getInstance().get(1,this,GET_DRY_LIST , this , true);
    }


}
