package com.example.ola.dryclean.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ola.dryclean.R;


/**
 * A simple {@link Fragment} subclass.
 */



public class WashingMenuFragment extends android.app.Fragment {

    public WashingMenuFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_washing_menu, container, false);

    return rootView ;


    }

}
