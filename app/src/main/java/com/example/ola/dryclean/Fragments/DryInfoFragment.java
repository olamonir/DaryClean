package com.example.ola.dryclean.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ola.dryclean.Activites.DryDetailsActivity;
import com.example.ola.dryclean.Objects.LundryData;
import com.example.ola.dryclean.R;
import com.networkconnectinlib.webservice.Connection;
import com.networkconnectinlib.webservice.RequestStatus;
import com.networkconnectinlib.webservice.ResponseHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static com.example.ola.dryclean.Classes.Constants.GET_LUNDRY_INFO;


/**
 * A simple {@link Fragment} subclass.
 */
public class DryInfoFragment extends Fragment implements ResponseHandler {
    private static final String TAG = "DryInfoFragment";
    TextView provinces;
    TextView manteqa;
    TextView qat3a;
    TextView status;
    TextView servicetype;
    TextView workinghours;
    TextView delivery;
    TextView least;
    TextView deliverycost;
    TextView payment;


    TextView provincesStatic;
    TextView manteqaStatic;
    TextView qat3aStatic;
    TextView statusStatic;
    TextView servicetypeStatic;
    TextView workinghoursStatic;
    TextView deliveryStatic;
    TextView leastStatic;
    TextView deliverycostStatic;
    TextView paymentStatic;

    ImageButton butshare;
    LundryData lundryData;

    public DryInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dry_info, container, false);
         provinces = (TextView) rootView.findViewById(R.id.provinces);
         manteqa = (TextView) rootView.findViewById(R.id.manteqa);
         qat3a = (TextView) rootView.findViewById(R.id.qat3a);
         status = (TextView) rootView.findViewById(R.id.status);
         servicetype = (TextView) rootView.findViewById(R.id.servicetype);
         workinghours = (TextView) rootView.findViewById(R.id.workinghours);
         delivery = (TextView) rootView.findViewById(R.id.delivery);
         least = (TextView) rootView.findViewById(R.id.least);
         deliverycost = (TextView) rootView.findViewById(R.id.deliverycost);
//         payment = (TextView) rootView.findViewById(R.id.payment);



        provincesStatic = (TextView) rootView.findViewById(R.id.provincesstatic);
        manteqaStatic = (TextView) rootView.findViewById(R.id.manteqastatic);
        qat3aStatic = (TextView) rootView.findViewById(R.id.qat3astatic);
        statusStatic = (TextView) rootView.findViewById(R.id.statusstatic);
        servicetypeStatic = (TextView) rootView.findViewById(R.id.servicetypestatic);
        workinghoursStatic = (TextView) rootView.findViewById(R.id.workinghoursstatic);
        deliveryStatic = (TextView) rootView.findViewById(R.id.deliverystatic);
        leastStatic = (TextView) rootView.findViewById(R.id.leaststatic);
        deliverycostStatic = (TextView) rootView.findViewById(R.id.deliverycoststatic);
//        paymentStatic = (TextView) rootView.findViewById(R.id.paymentstatic);


        butshare = (ImageButton) rootView.findViewById(R.id.share);


                getData();
        return rootView ;

    }







    @Override
    public void onRequestFinished(int requestId, RequestStatus requestStatus, int requestCode, String response) {
        Log.d(TAG, "DryInfoFragment");

        switch (requestStatus) {
            case NO_INTERNET:
                //toast no connection
                Toast.makeText(getContext() ,"NO_INTERNET" ,Toast.LENGTH_SHORT).show();

                break;
            case NO_CONNECTION:
                //toast no connection
                Toast.makeText(getContext() ,"NO_CONNECTION" ,Toast.LENGTH_SHORT).show();

                break;
            case FAILED:
                //toast no connection
                Toast.makeText(getContext() ,"FAILED" ,Toast.LENGTH_SHORT).show();

                break;
            case SUCCEED:
                if (requestCode == 200) {
                    switch (requestId) {
                        case 1:

                          final   LundryData lundryData = (LundryData) Connection.getInstance().parseJsonToObject(response, LundryData.class);
//                            Log.d("succ",reviews.getResult().getSuccess()+"");
                            if(lundryData.getResult().getSuccess()==1){
                                if(lundryData.getResult().getData()!=null){
                                    provinces.setText(String.valueOf(lundryData.getResult().getData().getProvince_id()));
                                    manteqa.setText(String.valueOf(lundryData.getResult().getData().getArea_id()));
                                    qat3a.setText(String.valueOf(lundryData.getResult().getData().getBlock()));
                                    status.setText(lundryData.getResult().getData().getStatus_ar());
                                    if (lundryData.getResult().getData().getServices().size()>0) {
                                    servicetype.setText(lundryData.getResult().getData().getServices().get(0).getTitleAr() + " , " +lundryData.getResult().getData().getServices().get(1).getTitleAr() + " , " + lundryData.getResult().getData().getServices().get(2).getTitleAr() );
                                    }
//                                    String fromTime = lundryData.getResult().getData().getOpen_at();
//                                    String toTime = lundryData.getResult().getData().getClose_at();
                                    SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm");
                                    SimpleDateFormat date12Format = new SimpleDateFormat("hh صباحا");
                                    SimpleDateFormat date12Format2 = new SimpleDateFormat("hh مساءا");
                                    try {
                                        String fromTime = date12Format.format(date24Format.parse(lundryData.getResult().getData().getOpen_at()));
                                        String toTime =  date12Format2.format(date24Format.parse(lundryData.getResult().getData().getClose_at()));
                                        workinghours.setText(  fromTime + "  -  " + toTime );

                                    } catch (ParseException e) {
                                        e.printStackTrace();
                                    }


                                    delivery.setText(String.valueOf( lundryData.getResult().getData().getDelivery_cost()));
                                    deliverycost.setText(String.valueOf(lundryData.getResult().getData().getDelivery_cost()));
                                    least.setText(String.valueOf( lundryData.getResult().getData().getMinimum_charges()));
//                                    payment.setText(lundryData.getResult().getData());



                                    butshare.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent share = new Intent(android.content.Intent.ACTION_SEND);
                                            share.setType("text/plain");
                                            share.putExtra(Intent.EXTRA_SUBJECT, lundryData.getResult().getData().getTitleAr());
                                            share.putExtra(Intent.EXTRA_TEXT, lundryData.getResult().getData().getLink());

                                            startActivity(Intent.createChooser(share, "انشر بواسطة"));
                                        }
                                    });
                                }
                            }
                            //convert  15:30 to  3:30pm
//                            public static String convertTo12Hour(String time) {
//                            SimpleDateFormat sdf = new SimpleDateFormat("k:mm");
//                            SimpleDateFormat output = new SimpleDateFormat("hh:mma", Locale.ENGLISH);
//                            Date d = null;
//                            try {
//                                d = sdf.parse(time);
//                            } catch (ParseException e) {
//                                e.printStackTrace();
//                            }
//                            String formattedTime = output.format(d);
//                            return formattedTime;
//                        }
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
        Connection.getInstance().get(1,getActivity(),GET_LUNDRY_INFO + DryDetailsActivity.x, this , true);
    }

}
