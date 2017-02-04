package com.example.ola.dryclean.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.ola.dryclean.Objects.Reviews;
import com.example.ola.dryclean.R;

import java.util.List;

/**
 * Created by ola on 1/22/2017.
 */

public class ReviewsRecyclerViewAdapter extends RecyclerView.Adapter<ReviewsRecyclerViewAdapter.MyViewHolder>  {

    private static final String TAG = "ReviewsRecyclerViewAdapter";

    private Typeface diwanMuna;
    private Typeface geDinarTwoLight;

    private final Context context;
    private List<Reviews.ResultEntity.DataEntityMainClass.DataEntity> data;


    public ReviewsRecyclerViewAdapter(Context context, List<Reviews.ResultEntity.DataEntityMainClass.DataEntity> list) {
        this.context = context;
        this.data=list ;
        this.diwanMuna = Typeface.createFromAsset(this.context.getAssets(), "fonts/DiwanMuna.ttf");
        this.geDinarTwoLight = Typeface.createFromAsset(this.context.getAssets(), "fonts/ge-dtwol.otf");

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.reviews_item, parent, false);

        return new ReviewsRecyclerViewAdapter.MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.personName.setTypeface(diwanMuna);
        holder.customerTxt.setTypeface(geDinarTwoLight);

        holder.personName.setText(String.valueOf(data.get(position).getUser().getUsername()));
        holder.ratingBar.setRating(data.get(position).getRate());

        holder.customerTxt.setText(String.valueOf(data.get(position).getComment()));



    }

//    private RatingBar.OnRatingBarChangeListener onRatingChangedListener(final int position) {
//        return new RatingBar.OnRatingBarChangeListener() {
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
////                DryListActivity item = getItem(position);
////                assert item != null;
////                item.setRatingStar(v);
////                Log.i("Adapter", "star: " + v);
//            }
//        };
//    }


    @Override
    public int getItemCount() {return data.size();}




    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView personName, customerTxt;
        public RatingBar ratingBar ;

        public MyViewHolder(View view) {
            super(view);
            personName = (TextView) view.findViewById(R.id.person_name);
            customerTxt = (TextView) view.findViewById(R.id.customertxt);
            ratingBar = (RatingBar) view.findViewById(R.id.myRatingBar);
        }
    }
}
