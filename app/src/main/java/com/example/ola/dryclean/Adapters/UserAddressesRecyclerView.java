package com.example.ola.dryclean.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ola.dryclean.Activites.DryDetailsActivity;
import com.example.ola.dryclean.Objects.UserInfo;
import com.example.ola.dryclean.R;

import java.util.List;

/**
 * Created by ola on 1/28/2017.
 */

public class UserAddressesRecyclerView extends RecyclerView.Adapter<UserAddressesRecyclerView.MyViewHolder> {


    private Typeface diwanMuna ;
    private final Activity context;
    private Typeface geDinarTwoLight ;
    private List<UserInfo.ResultBean.DataBean.AddressesBean> data;

    public UserAddressesRecyclerView(Activity context, List<UserInfo.ResultBean.DataBean.AddressesBean> list){
        this.context = context;
        this.data=list ;
        this.diwanMuna = Typeface.createFromAsset(this.context.getAssets(), "fonts/DiwanMuna.ttf");
        this.geDinarTwoLight = Typeface.createFromAsset(this.context.getAssets(), "fonts/ge-dtwol.otf");

    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.add_new_add_list_item, parent, false);
        itemView.setOnClickListener(new UserAddressesRecyclerView.MyOnClickListener());

        return new UserAddressesRecyclerView.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvTitle.setText(String.valueOf(data.get(position).getAddress()));
        holder.tvTitle.setTypeface(geDinarTwoLight);

    }



    @Override
    public int getItemCount() {
        return  data.size();
    }


    class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.clickContainer:
                    Intent intent = new Intent(context , DryDetailsActivity.class);
                    context.startActivity(intent);
                    Toast.makeText(context ,"mmmmm" ,Toast.LENGTH_SHORT).show();
                    break;
//            int itemPosition = recyclerView.indexOfChild(v);
//            Log.e("Clicked and Position is ",String.valueOf(itemPosition));
            }
        }
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;


        public MyViewHolder(View view) {
            super(view);
            tvTitle = (TextView) view.findViewById(R.id.text_title);


        }
    }
}
