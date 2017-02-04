package com.example.ola.dryclean.Activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ola.dryclean.R;

public class LastOrdersActivity extends AppCompatActivity {
    public static final String ARG_POST_ID = "ARG_POST_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_orders);
    }
}
