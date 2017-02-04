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

import com.example.ola.dryclean.Adapters.LastOrdersRecyclerViewAdapter;
import com.example.ola.dryclean.Objects.LastOrders;
import com.example.ola.dryclean.R;
import com.networkconnectinlib.webservice.Connection;
import com.networkconnectinlib.webservice.RequestStatus;
import com.networkconnectinlib.webservice.ResponseHandler;

import static com.example.ola.dryclean.Classes.Constants.GET_LAST_ORDERS;

/**
 * A simple {@link Fragment} subclass.
 */
public class LastOrderFragment extends Fragment implements ResponseHandler {
    private static final String TAG = "LastOrderFragment";
    RecyclerView recyclerView ;
    private LastOrdersRecyclerViewAdapter myAdapter;


    public LastOrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_last_order, container, false);
        recyclerView =(RecyclerView) rootview.findViewById(R.id.last_order);


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
                            Toast.makeText(getContext(), "success", Toast.LENGTH_SHORT);

                            LastOrders lastOrders = (LastOrders) Connection.getInstance().parseJsonToObject(response, LastOrders.class);

                            Log.d("succ", lastOrders.getResult().getSuccess() + "");
                            if (lastOrders.getResult().getSuccess() == 1) {
                                if (lastOrders.getResult().getData() != null) {
                                    if (lastOrders.getResult().getData().getOrders().size() > 0) {
                                        myAdapter= new LastOrdersRecyclerViewAdapter(getContext(),  lastOrders.getResult().getData().getOrders());
                                        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
                                        recyclerView.setAdapter(myAdapter);

                                        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                                        recyclerView.setLayoutManager(mLayoutManager);
                                        recyclerView.setItemAnimator(new DefaultItemAnimator());
//                                        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
//
//                                            @Override
//                                            public void onItemClick(View view, int position) {
//                                                Intent intent = new Intent(getContext(),LastOrdersActivity.class);
//                                                intent.putExtra(LastOrdersActivity.ARG_POST_ID, lastOrders.getResult().getData().getOrders().get(position).getId());
//                                                startActivity(intent);
//                                            }}));




                                    }
                                    ///Sorry you don't have orders
                                }
                            }
                            break;
                    }
                }
        }


    }
    private void getData(){

        Connection.getInstance().get(1,getActivity(),GET_LAST_ORDERS, this , true);
    }
}
