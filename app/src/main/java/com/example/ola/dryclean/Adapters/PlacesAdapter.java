package com.example.ola.dryclean.Adapters;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ola.dryclean.Objects.Setting;
import com.example.ola.dryclean.R;

import java.util.List;

/**
 * Created by ola on 2/2/2017.
 */

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.MyViewHolder> implements View.OnClickListener{
    private static final String TAG = "PlacesAdapter";
    private Typeface diwanMuna;
    private Typeface geDinarTwoLight;

    private final Activity context;
    private List<Setting.ResultBean.DataBean.ProvincesBean> data;

    public PlacesAdapter(Activity context, List<Setting.ResultBean.DataBean.ProvincesBean> list) {
        this.context = context;
        this.data = list;
        this.diwanMuna = Typeface.createFromAsset(this.context.getAssets(), "fonts/DiwanMuna.ttf");
        this.geDinarTwoLight = Typeface.createFromAsset(this.context.getAssets(), "fonts/ge-dtwol.otf");

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.places, parent, false);

        itemView.setOnClickListener( this);

        return new PlacesAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        for (int i =0 ;i < data.get(position) ; i++) {
            holder.personName.setText(String.valueOf(data.get(position).getTitleAr()));
//            for (int m = 0 ; m< data.get(position).getAreas().get(position)  ; m++);
//            holder.personName.setText(data.get(position).getAreas().get(position).getTitleAr());


//        }
    }

    @Override
    public int getItemCount() {
        return  data.size();
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    @Override
    public void onClick(View view) {

    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView personName;

        public MyViewHolder(View view) {
            super(view);
            personName = (TextView) view.findViewById(R.id.areas);

        }
    }



}
