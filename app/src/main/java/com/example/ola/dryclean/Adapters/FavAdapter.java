package com.example.ola.dryclean.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ola.dryclean.Objects.UserInfo;
import com.example.ola.dryclean.R;

import java.util.List;

/**
 * Created by ola on 1/31/2017.
 */

public class FavAdapter extends RecyclerView.Adapter<FavAdapter.MyViewHolder> implements View.OnClickListener{
    private static final String TAG = "FavAdapter";
    private Typeface diwanMuna ;
    private final Context context;
    private List<UserInfo.ResultBean.DataBean.MyFavsBean> data;
    private Typeface geDinarTwoLight ;


    public FavAdapter(Context context, List<UserInfo.ResultBean.DataBean.MyFavsBean> list) {
        this.context = context;
        this.data=list ;
//        this.mOnItemClickListener = listener;
        this.diwanMuna = Typeface.createFromAsset(this.context.getAssets(), "fonts/DiwanMuna.ttf");
        this.geDinarTwoLight = Typeface.createFromAsset(this.context.getAssets(), "fonts/ge-dtwol.otf");    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fav_item, parent, false);
        itemView.setOnClickListener( this);
        return new FavAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvTitle.setText(String.valueOf(data.get(position).getTitleAr()));
        holder.tvTitle.setTypeface(geDinarTwoLight);

        holder.status.setText(String.valueOf(data.get(position).getStatusAr()));
        holder.status.setTypeface(diwanMuna);

        holder.leastorder.setTypeface(diwanMuna);
        holder.moneydeliver.setTypeface(diwanMuna);
        holder.timedeliver.setTypeface(diwanMuna);

        holder.delivertm.setText(String.valueOf(data.get(position).getDelivery_time()));
        holder.delivermoney.setText(String.valueOf( data.get(position).getDelivery_cost()));
        holder.least.setText(String.valueOf(data.get(position).getMinimum_charges()));
        holder.ratingBar.setRating(Float.parseFloat(data.get(position).getAvg_rating().get(position).getAggregate()));


    }

    @Override
    public int getItemCount() {
        return data.size();    }

    @Override
    public void onClick(View view) {

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle, status, delivertm, delivermoney, least, leastorder, moneydeliver, timedeliver;
        public ImageView newsImage;
        public RatingBar ratingBar;
        public RelativeLayout container;

        public MyViewHolder(View view) {
            super(view);
            tvTitle = (TextView) view.findViewById(R.id.text_title);
            status = (TextView) view.findViewById(R.id.text_title1);
            delivertm = (TextView) view.findViewById(R.id.delivery_time);
            delivermoney = (TextView) view.findViewById(R.id.delivertime);
            least = (TextView) view.findViewById(R.id.leastmoneyorder);
            newsImage = (ImageView) view.findViewById(R.id.news_image);
            ratingBar = (RatingBar) view.findViewById(R.id.myRatingBar);
            leastorder = (TextView) view.findViewById(R.id.leastorder);
            moneydeliver = (TextView) view.findViewById(R.id.moneydeliver);
            timedeliver = (TextView) view.findViewById(R.id.timedeliver);
//            container = (RelativeLayout) view.findViewById(R.id.clickContainer);
//            view.setOnClickListener(this);

        }
    }

}
