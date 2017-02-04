package com.example.ola.dryclean.Classes;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.ola.dryclean.Activites.MainActivity;

/**
 * Created by Aylar-HP on 28/09/2015.
 */
public class MyLocListener implements LocationListener, View.OnClickListener {

    MainActivity mainActivity;
    Context context;

    @Override
    public void onLocationChanged(Location location)
    {
        final ToneGenerator tg = new ToneGenerator(AudioManager.STREAM_NOTIFICATION, 100);
        tg.startTone(ToneGenerator.TONE_PROP_BEEP);
        if(location != null)
        {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            Log.d("Latitude :", "" + location.getAccuracy());
        Log.d("Latitude :", "" + location.getLatitude());
            Log.d("Latitude :", "" + location.getLongitude());
            String message = String.format(
                    "New Location \n Longitude: %1$s \n Latitude: %2$s",
                    location.getLongitude(), location.getLatitude());
        }
    }

    @Override
    public void onProviderEnabled(String provider) {
    }

    @Override
    public void onProviderDisabled(String provider) {
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }



    @Override
    public void onClick(View view) {
        this.context = view.getContext();
        this.mainActivity = ((MainActivity) context);

        // disable the START button, enable the STOP button
//        mainActivity.locButn.setEnabled(true);

        // start listening to location updates
//        mainActivity.locationHelper.getLocation(mainActivity, mainActivity.locationResult);

    }
}
