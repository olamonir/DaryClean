package com.example.ola.dryclean.Activites;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ola.dryclean.Fragments.DryInfoFragment;
import com.example.ola.dryclean.Fragments.ReviewsFragment;
import com.example.ola.dryclean.Objects.LundryData;
import com.example.ola.dryclean.R;
import com.networkconnectinlib.webservice.Connection;
import com.networkconnectinlib.webservice.RequestStatus;
import com.networkconnectinlib.webservice.ResponseHandler;

import static com.example.ola.dryclean.Classes.Constants.GET_LUNDRY_INFO;

public class DryDetailsActivity extends AppCompatActivity implements ResponseHandler {
    public static final String ARG_POST_ID = "ARG_POST_ID";
    private static final String TAG = "DryDetailsActivity";

    TabHost tabHost;
    FragmentTabHost mTabHost ;
    Typeface diwanMuna;
    Typeface geDinarTwoLight ;

    TextView lundryName;
    TextView lundryHint;
    TextView deliveryTime;
    TextView deliverymoney;
    TextView leastdeliverymoney;



    TextView deliveryTimeStatic;
    TextView deliverymoneyStatic;
    TextView leastdeliverymoneyStatic;
    public static  int x ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry_details);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        tabHost =(TabHost) findViewById(R.id.tabhost) ;
        mTabHost = (FragmentTabHost)findViewById(R.id.mTabHost);
        mTabHost.setup(this, getSupportFragmentManager(),android.R.id.tabcontent);
        mTabHost.addTab(mTabHost.newTabSpec("تقييم العملاء").setIndicator("تقييم العملاء" ), ReviewsFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec("قائمة الغسيل").setIndicator("قائمة الغسيل"), ReviewsFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec("معلومات المصبغه").setIndicator("معلومات المصبغه"), DryInfoFragment.class,null);

        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String arg0) {
                for (int i = 0; i < mTabHost.getTabWidget().getChildCount(); i++) {
                    mTabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#E6E7E8")); // unselected
                }
                mTabHost.getTabWidget().getChildAt(mTabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#F1F2F2")); // selected
            }
        });

        diwanMuna = Typeface.createFromAsset(getAssets(), "fonts/DiwanMuna.ttf");
        geDinarTwoLight = Typeface.createFromAsset(getAssets(), "fonts/ge-dtwol.otf");

        lundryName =(TextView) findViewById(R.id.dry_name);

        lundryHint = (TextView) findViewById(R.id.hint);
        deliveryTime = (TextView) findViewById(R.id.delivery_time);
        deliverymoney = (TextView) findViewById(R.id.deliverym);
        leastdeliverymoney = (TextView) findViewById(R.id.least_order);

        deliveryTimeStatic = (TextView) findViewById(R.id.deliveryTimeStaticm);
        deliverymoneyStatic = (TextView) findViewById(R.id.deliverymoneyStaticm);
        leastdeliverymoneyStatic = (TextView) findViewById(R.id.leastdeliverymoneyStaticm);

//        lundryName.setTypeface(geDinarTwoLight, Typeface.BOLD);
//        deliveryTimeStatic.setTypeface(diwanMuna, Typeface.BOLD);
        deliverymoneyStatic.setTypeface(diwanMuna, Typeface.BOLD);
        leastdeliverymoneyStatic.setTypeface(diwanMuna, Typeface.BOLD);


        if (getIntent().hasExtra(DryDetailsActivity.ARG_POST_ID)) {
            x = getIntent().getIntExtra(DryDetailsActivity.ARG_POST_ID , 1);
            Log.d("x=", String.valueOf(GET_LUNDRY_INFO  + x));
        }

        getData();


//        ftabHost.getTabWidget().setDividerDrawable(R.color.white);

//        //tab1
//        TabHost.TabSpec tab1 =tabHost.newTabSpec("قائمة الغسيل");
//        tab1.setContent(new Intent(this , ReviewsFragment.class));
//        tab1.setIndicator("قائمة الغسيل");
////        //tab2
//        TabHost.TabSpec tab2 =tabHost.newTabSpec("تقييم العملاء");
//       tab1.setContent(new Intent(this , ReviewsFragment.class));
//        tab2.setIndicator("قائمة الغسيل");
////        //tab2
//        TabHost.TabSpec tab3 =tabHost.newTabSpec("معلومات المصبغه");
//        tab1.setContent(new Intent(this , DryInfoFragment.class));
//        tab3.setIndicator("قائمة الغسيل");
//        tabHost.addTab(tab1);
//        tabHost.addTab(tab2);
//        tabHost.addTab(tab3);


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
                            final LundryData lundryData = (LundryData) Connection.getInstance().parseJsonToObject(response, LundryData.class);
//                            Log.d("succ",lundryData.getResult().getSuccess()+"");
                            if(lundryData.getResult().getSuccess()==1){
                                if(lundryData.getResult().getData()!=null){
//                                    if (lundryData.getResult().getData().size()>0) {

                                        lundryName.setText(lundryData.getResult().getData().getTitleAr());
                                        lundryHint.setText(lundryData.getResult().getData().getDetailsAr());
                                        deliveryTime.setText(String.valueOf(lundryData.getResult().getData().getDelivery_time()));
                                        deliverymoney.setText(String.valueOf(lundryData.getResult().getData().getDelivery_cost()));
                                        leastdeliverymoney.setText(String.valueOf(lundryData.getResult().getData().getMinimum_charges()));


                                    lundryName.setTypeface(geDinarTwoLight);
                                        lundryHint.setTypeface(diwanMuna);


//                                    }

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

        Connection.getInstance().get(1,this,GET_LUNDRY_INFO  + x , this , true);
    }
}
