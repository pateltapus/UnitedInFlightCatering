package com.example.u356971.unitedinflightcatering;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class snackAdapter extends RecyclerView.Adapter<snackAdapter.ViewHolder>{
    private List<MyList> list;
    private Context mCtx;

    public snackAdapter(List<MyList> list, Context mCtx) {
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
    public void onBindViewHolder(snackAdapter.ViewHolder holder, int position) {
        final MyList myList = list.get(position);
        holder.textViewHead.setText(myList.getHead());
        holder.textViewDesc.setText(myList.getDesc());
        holder.image.setImageResource(myList.getImage());
        holder.orderNow.setTag(myList.getTag());
        holder.orderNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tag = (String)view.getTag();
                switch((String)view.getTag())
                {
                    case "deepDish":
                        Intent intent1 = new Intent(mCtx, deepDishOrderNow.class);
                        mCtx.startActivity(intent1);
                        break;
                    case "cheeseBurger":
                        Intent intent2 = new Intent(mCtx, cheeseBurgerOrderNow.class);
                        mCtx.startActivity(intent2);
                        break;
                    case "chickenSandwich":
                        Intent intent3 = new Intent(mCtx,chickenSandwichOrderNow.class);
                        mCtx.startActivity(intent3);
                        break;
                    case "sampler":
                        Intent intent4 = new Intent(mCtx,samplerOrderNow.class);
                        mCtx.startActivity(intent4);
                        break;
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
        public ImageView image;
        public ViewHolder(View itemView) {
            super(itemView);

            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDesc);
            orderNow = (Button) itemView.findViewById(R.id.orderNow);
            image = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
