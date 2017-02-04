package com.example.ola.dryclean.Activites;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.ola.dryclean.Classes.MyLocListener;
import com.example.ola.dryclean.Fragments.FavFragment;
import com.example.ola.dryclean.Fragments.LastOrderFragment;
import com.example.ola.dryclean.Fragments.MainFragment;
import com.example.ola.dryclean.Fragments.MyAccountFragment;
import com.example.ola.dryclean.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener  {

    private static final String TAG = "MainActivity";

//    Button locButn;
//    Typeface diwanMuna;
//    TextView textView;
//    TextView loctxt;
//    Button menubutn;
    Button logbutn;
    FragmentManager fragmentManager = getFragmentManager();
    MyLocListener loc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        diwanMuna = Typeface.createFromAsset(getAssets(), "fonts/DiwanMuna.ttf");

//        textView = (TextView) findViewById(R.id.text1);
//        textView.setTypeface(diwanMuna, Typeface.BOLD);
//        loctxt = (TextView) findViewById(R.id.location_butn);
//        loctxt.setTypeface(diwanMuna, Typeface.BOLD);
//        menubutn = (Button) findViewById(R.id.menu_btn);
//        menubutn.setTypeface(diwanMuna, Typeface.BOLD);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
        toggle.syncState();



        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(this);
        }
        MainFragment mainFragment =new MainFragment();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.flContent);
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.flContent , mainFragment).commit();
        }


//        locButn = (Button) findViewById(R.id.location_butn);

//        locButn.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                new LocationTool(getBaseContext()).getNewLocation(new LocationTool.LocationListener() {
//                    @Override
//                    public void gotLocation(Location location) {
//                        double latitude = location.getLatitude();
//                        double longitude = location.getLongitude();
//                        Log.d("Latitude", String.valueOf((location.getLatitude())));
//                        Log.d("Longitude", String.valueOf(location.getLongitude()));
//                        Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
//
//                    }
//                });
//            }
//        });


//
//        menubutn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent in = new Intent(getApplication(), DryListActivity.class);
//                startActivity(in);
//            }
//        });


    }
// mack  new fragment
    // then  replace  all frament
    //and macke itfirest frament in drawer
    // main frame emptry and me replace it with first fragment
    // then on back pressed
    // malke4 d3oa main layout
     // 23mly new fragent with new layout as same as  new layout

    @Override
    public void onBackPressed() {
        // get fragment active now  then back to main fragment
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.flContent);
        if (drawer.isDrawerOpen(Gravity.RIGHT)) {
            drawer.closeDrawer(Gravity.RIGHT);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        MyAccountFragment myAccountFragment;
        LastOrderFragment lastOrderFragment;
        FavFragment favFragment;
        MainFragment mainFragment;


        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.main){
                        mainFragment = new MainFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.flContent, mainFragment).commit();
        }
        if (id == R.id.nav_profile) {
            myAccountFragment = new MyAccountFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.flContent, myAccountFragment).commit();
            //this add and comit where replace??
        } else if (id == R.id.nav_fav) {
            favFragment = new FavFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.flContent, favFragment).commit();

//        } else if (id == R.id.nav_lastorder) {
//            lastOrderFragment = new LastOrderFragment();
//            getSupportFragmentManager().beginTransaction().replace(R.id.flContent, lastOrderFragment).commit();


        } else if (id == R.id.nav_share) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
