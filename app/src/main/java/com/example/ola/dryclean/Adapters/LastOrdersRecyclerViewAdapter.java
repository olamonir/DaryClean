package com.example.ola.dryclean.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ola.dryclean.Objects.LastOrders;
import com.example.ola.dryclean.R;

import java.util.List;

/**
 * Created by ola on 1/29/2017.
 */



public class LastOrdersRecyclerViewAdapter extends RecyclerView.Adapter<LastOrdersRecyclerViewAdapter.MyViewHolder> {
    private static final String TAG = "LastOrdersRecyclerViewAdapter";

    private Typeface diwanMuna;
    private Typeface geDinarTwoLight;

    private final Context context;
    private List<LastOrders.ResultBean.DataBean.OrdersBean> data;

    public LastOrdersRecyclerViewAdapter(Context context, List<LastOrders.ResultBean.DataBean.OrdersBean> list) {
        this.context = context;
        this.data=list ;
        this.diwanMuna = Typeface.createFromAsset(this.context.getAssets(), "fonts/DiwanMuna.ttf");
        this.geDinarTwoLight = Typeface.createFromAsset(this.context.getAssets(), "fonts/ge-dtwol.otf");
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.last_orders_items, parent, false);

        return new LastOrdersRecyclerViewAdapter.MyViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.lunderyName.setTypeface(diwanMuna);
        holder.statusOrder.setTypeface(geDinarTwoLight);
        holder.day.setTypeface(geDinarTwoLight);
        holder.dinar.setTypeface(geDinarTwoLight);

        holder.lunderyName.setText(String.valueOf(data.get(position).getShop().getTitleAr()));
        holder.day.setText(String.valueOf(data.get(position).getCreated_at()));
//        holder.date.setText(String.valueOf(data.get(position).getResult().getData().));
        holder.statusOrder.setText(String.valueOf(data.get(position).getStatus()));
        holder.ordercost.setText(String.valueOf(data.get(position).getTotal()));


    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView lunderyName, statusOrder ,day ,date ,ordercost ,dinar;

        public MyViewHolder(View view) {
            super(view);
            lunderyName = (TextView) view.findViewById(R.id.text_name);
            statusOrder = (TextView) view.findViewById(R.id.text_status);
            day = (TextView) view.findViewById(R.id.day);
            date = (TextView) view.findViewById(R.id.date);
            ordercost = (TextView) view.findViewById(R.id.ordercost);
            dinar = (TextView) view.findViewById(R.id.dinar);
        }
    }
}
