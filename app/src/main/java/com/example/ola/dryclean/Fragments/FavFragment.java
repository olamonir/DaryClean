package com.example.ola.dryclean.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ola.dryclean.Activites.DryDetailsActivity;
import com.example.ola.dryclean.Adapters.FavAdapter;
import com.example.ola.dryclean.Classes.RecyclerItemClickListener;
import com.example.ola.dryclean.Objects.UserInfo;
import com.example.ola.dryclean.R;
import com.networkconnectinlib.webservice.Connection;
import com.networkconnectinlib.webservice.RequestStatus;
import com.networkconnectinlib.webservice.ResponseHandler;

import java.util.List;

import static com.example.ola.dryclean.Classes.Constants.GET_USER_INFO;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavFragment extends Fragment implements ResponseHandler {
    private static final String TAG = "FavFragment";
    RecyclerView recyclerView ;
    private FavAdapter myAdapter;

    public FavFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_fav, container, false);
        recyclerView =(RecyclerView)rootView.findViewById(R.id.fav_recycler);

        getData();
        return rootView ;

    }








    @Override
    public void onRequestFinished(int requestId, RequestStatus requestStatus, int requestCode, String response) {
        Log.d(TAG, "onRequestFinished");
        switch (requestStatus) {
            case NO_INTERNET:
                //toast no connection
                Toast.makeText(getContext() ,"NO_INTERNET" ,Toast.LENGTH_SHORT);

                break;
            case NO_CONNECTION:
                //toast no connection
                Toast.makeText(getContext() ,"NO_CONNECTION" ,Toast.LENGTH_SHORT);

                break;
            case FAILED:
                //toast no connection
                Toast.makeText(getContext() ,"FAILED" ,Toast.LENGTH_SHORT);

                break;
            case SUCCEED:
                if (requestCode == 200) {
                    switch (requestId) {
                        case 1:
                            final UserInfo userInfo = (UserInfo) Connection.getInstance().parseJsonToObject(response, UserInfo.class);

                            Log.d("succ",userInfo.getResult().getSuccess()+"");
                            if(userInfo.getResult().getSuccess()==1){
                                if(userInfo.getResult().getData()!=null){
                                    if (userInfo.getResult().getData().getMy_favs().size()>0){
                                        myAdapter= new FavAdapter(getContext(), (List<UserInfo.ResultBean.DataBean.MyFavsBean>) userInfo.getResult().getData().getMy_favs());
                                        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
                                        recyclerView.setLayoutManager(mLayoutManager);
                                        recyclerView.setItemAnimator(new DefaultItemAnimator());

                                        recyclerView.setAdapter(myAdapter);
                                        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {

                                            @Override
                                            public void onItemClick(View view, int position) {
                                                Intent intent = new Intent(getContext(),DryDetailsActivity.class);
                                                intent.putExtra(DryDetailsActivity.ARG_POST_ID, userInfo.getResult().getData().getMy_favs().get(position).getId());
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

        Connection.getInstance().get(1,getContext(),GET_USER_INFO , this , true);
    }
}
