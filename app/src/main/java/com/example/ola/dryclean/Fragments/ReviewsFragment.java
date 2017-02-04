package com.example.ola.dryclean.Fragments;


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

import com.example.ola.dryclean.Adapters.ReviewsRecyclerViewAdapter;
import com.example.ola.dryclean.Objects.Reviews;
import com.example.ola.dryclean.R;
import com.networkconnectinlib.webservice.Connection;
import com.networkconnectinlib.webservice.RequestStatus;
import com.networkconnectinlib.webservice.ResponseHandler;

import static com.example.ola.dryclean.Classes.Constants.GET_REVIEWS_LIST;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReviewsFragment extends Fragment implements ResponseHandler {
    private static final String TAG = "ReviewsFragment";


    RecyclerView recyclerView ;
    private ReviewsRecyclerViewAdapter myAdapter;

    public ReviewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_reviews, container, false);
        recyclerView =(RecyclerView)rootView.findViewById(R.id.list_view) ;

        getData();



        return rootView ;
    }

    @Override
    public void onRequestFinished(int requestId, RequestStatus requestStatus, int requestCode, String response) {
        Log.d(TAG, "ReviewsFragment");

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

                            Reviews reviews = (Reviews) Connection.getInstance().parseJsonToObject(response, Reviews.class);
                            Log.d("succ",reviews.getResult().getSuccess()+"");
                            if(reviews.getResult().getSuccess()==1){
                                if(reviews.getResult().getData()!=null){
                                    if (reviews.getResult().getData().getData().size()>0){
                                        myAdapter= new ReviewsRecyclerViewAdapter(getContext(),reviews.getResult().getData().getData());
                                        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());

                                        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
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
        Connection.getInstance().get(1,getActivity(),GET_REVIEWS_LIST , this , true);
    }



}
