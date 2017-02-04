package com.example.ola.dryclean.Adapters;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ola.dryclean.Objects.TestObject;
import com.example.ola.dryclean.R;

import java.util.List;

/**
 * Created by ola on 1/21/2017.
 */

public class RcyclerViewAdapterDryList extends RecyclerView.Adapter<RcyclerViewAdapterDryList.MyViewHolder> implements View.OnClickListener {
    private static final String TAG = "DryListAdapter";
    //    private RealmResults<LundryData> results;
    private Typeface diwanMuna ;
    private final Activity context;
//    private OnItemClickListener mOnItemClickListener;

    private Typeface geDinarTwoLight ;
    private List<TestObject.ResultBean.DataBean> data;
//    private OnItemClickListener mOnItemClickListener;

    public RcyclerViewAdapterDryList(Activity context, List<TestObject.ResultBean.DataBean> list){
        this.context = context;
        this.data=list ;
//        this.mOnItemClickListener = listener;
        this.diwanMuna = Typeface.createFromAsset(this.context.getAssets(), "fonts/DiwanMuna.ttf");
        this.geDinarTwoLight = Typeface.createFromAsset(this.context.getAssets(), "fonts/ge-dtwol.otf");

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_item, parent, false);
        itemView.setOnClickListener( this);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        holder.delivertm.setTypeface(geDinarTwoLight, Typeface.BOLD);
//        holder.delivermoney.setTypeface(geDinarTwoLight, Typeface.BOLD);
//        holder.least.setTypeface(geDinarTwoLight, Typeface.BOLD);

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
        holder.ratingBar.setOnRatingBarChangeListener(onRatingChangedListener(position));



    }
    private RatingBar.OnRatingBarChangeListener onRatingChangedListener(final int position) {
        return new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
//                DryListActivity item = getItem(position);
//                assert item != null;
//                item.setRatingStar(v);
//                Log.i("Adapter", "star: " + v);
            }
        };
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    @Override
    public void onClick(View view) {

    }


//    public interface OnItemClickListener {
//        void onItemClick(View view, int position);
//    }
//    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
//        this.mOnItemClickListener = onItemClickListener;
//    }



//    class MyOnClickListener implements OnItemClickListener {
//
//        @Override
//        public void onItemClick(View view, int position) {
//            switch (view.getId()) {
//                case R.id.clickContainer:
//                    Intent intent = new Intent(context, DryDetailsActivity.class);
//                    intent.putExtra(DryDetailsActivity.ARG_POST_ID, String.valueOf(data.get((Integer) view.getTag()).getId()));
//                    context.startActivity(intent);
//                    Toast.makeText(context, "mmmmm", Toast.LENGTH_SHORT).show();
//                    break;
//
//            }
//        }
//    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle, status, delivertm ,delivermoney ,least,leastorder,moneydeliver,timedeliver;
        public ImageView newsImage ;
        public RatingBar ratingBar ;
        public RelativeLayout container ;

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
//            container =(RelativeLayout) view.findViewById(R.id.clickContainer);
//            view.setOnClickListener(this);

        }

//        @Override
//        public void onClick(View view) {
//            int position = getAdapterPosition();
//            mOnItemClickListener.onItemClick(view ,this.getLayoutPosition());
//            switch (view.getId()) {
//                case R.id.clickContainer:
//                    Intent intent = new Intent(context, DryDetailsActivity.class);
//                    intent.putExtra(DryDetailsActivity.ARG_POST_ID, String.valueOf(data.get(position).getId()));
//                    context.startActivity(intent);
//                    Toast.makeText(context, "mmmmm", Toast.LENGTH_SHORT).show();
//                    break;
//
//            }
//        }
    }




}
