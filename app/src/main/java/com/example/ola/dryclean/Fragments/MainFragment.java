package com.example.ola.dryclean.Fragments;


import android.content.Intent;
import android.graphics.Typeface;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ola.dryclean.Activites.DryListActivity;
import com.example.ola.dryclean.Activites.PlacesActivity;
import com.example.ola.dryclean.Classes.LocationTool;
import com.example.ola.dryclean.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private static final String TAG = "MainFragment";

    Button locButn;
    Typeface diwanMuna;
    TextView textView;
    TextView loctxt;
    Button menubutn;
    Button logbutn;
    Button places ;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootview =inflater.inflate(R.layout.fragment_main, container, false);

//        diwanMuna = Typeface.createFromAsset(container, "fonts/DiwanMuna.ttf");

        places= (Button) rootview.findViewById(R.id.location_txt) ;
        textView = (TextView) rootview.findViewById(R.id.text1);
        textView.setTypeface(diwanMuna);
        loctxt = (TextView) rootview.findViewById(R.id.location_butn);
        loctxt.setTypeface(diwanMuna, Typeface.BOLD);
        menubutn = (Button) rootview.findViewById(R.id.menu_btn);
        menubutn.setTypeface(diwanMuna);
        locButn = (Button)rootview.findViewById(R.id.location_butn);
        locButn.setOnClickListener(new View.OnClickListener() {
//
            @Override
            public void onClick(View view) {
                new LocationTool(getContext()).getNewLocation(new LocationTool.LocationListener() {
                    @Override
                    public void gotLocation(Location location) {
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        Log.d("Latitude", String.valueOf((location.getLatitude())));
                        Log.d("Longitude", String.valueOf(location.getLongitude()));
                        Toast.makeText(getContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();

                    }
                });
            }
        });

        menubutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), DryListActivity.class);
                startActivity(in);
            }
        });

        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PlacesActivity.class);
                startActivity(intent);
            }
        });
//        logbutn=(Button)rootview.findViewById(R.id.log_btn);
//        logbutn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), LoginActivity.class);
//                startActivity(intent);
//            }
//        });
        return rootview;
    }







}
