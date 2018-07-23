package com.example.u356971.unitedinflightcatering;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import java.util.List;


public class BeverageAdapter extends RecyclerView.Adapter<BeverageAdapter.ViewHolder> {

    private List<MyList> list;
    private Context mCtx;

    public BeverageAdapter(List<MyList> list, Context mCtx) {
        this.list = list;
        this.mCtx = mCtx;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_item, parent, false);
        return new ViewHolder(v);
    }



    @Override
    public void onBindViewHolder(BeverageAdapter.ViewHolder holder, int position) {
        MyList myList = list.get(position);
        holder.textViewHead.setText(myList.getHead());
        holder.textViewDesc.setText(myList.getDesc());
        holder.orderNow.setTag(myList.getTag());
        holder.orderNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch((String)view.getTag())
                {
                    case "breakfastSandwich":
                        Intent intent = new Intent(mCtx, deepDishOrderNow.class);
                        mCtx.startActivity(intent);

                }

            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewHead;
        public TextView textViewDesc;
        public Button orderNow;
        public TextView buttonViewOption;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDesc);
            orderNow = (Button) itemView.findViewById(R.id.orderNow);
        }
    }
}
