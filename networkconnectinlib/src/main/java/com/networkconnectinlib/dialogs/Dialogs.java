package com.networkconnectinlib.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.Window;

import com.networkconnectinlib.R;


/**
 * Created by sara.elsegeny on 11/17/2015.
 */
public class Dialogs {

    public  Dialog showDialog(Context context) {
        // Create custom dialog object
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
//        dialog.getWindow().setBackgroundDrawableResource();
        // Include dialog.xml file
        dialog.setContentView(R.layout.dialog_loading);
        // Set dialog title
//        dialog.setTitle("Custom Dialog");

        // set values for custom dialog components - text, image and button
//        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
//        text.setText("Custom dialog Android example.");

        dialog.setCancelable(false);
        dialog.show();
        return dialog;

    }


}
