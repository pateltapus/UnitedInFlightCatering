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
        holder.image.setScaleType(ImageView.ScaleType.FIT_CENTER);
        holder.orderNow.setTag(myList.getTag());
        holder.orderNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch((String)view.getTag())
                {
                    case "jerky":
                        Intent intent1 = new Intent(mCtx, jerkyOrderNow.class);
                        mCtx.startActivity(intent1);
                        break;
                    case "cb&j_mix":
                        Intent intent2 = new Intent(mCtx, nutMixOrderNow.class);
                        mCtx.startActivity(intent2);
                        break;
                    case "chips":
                        Intent intent3 = new Intent(mCtx,chipsOrderNow.class);
                        mCtx.startActivity(intent3);
                        break;
                    case "gummybears":
                        Intent intent4 = new Intent(mCtx,gummyBearsOrderNow.class);
                        mCtx.startActivity(intent4);
                        break;
                    case "pringles":
                        Intent intent5 = new Intent(mCtx,pringlesOrderNow.class);
                        mCtx.startActivity(intent5);
                        break;
                    case "hummus":
                        Intent intent6 = new Intent(mCtx,hummusOrderNow.class);
                        mCtx.startActivity(intent6);
                        break;
                    case "m&m":
                        Intent intent7 = new Intent(mCtx,mandmOrderNow.class);
                        mCtx.startActivity(intent7);
                        break;
                    case "cheeseandcrackers":
                        Intent intent8 = new Intent(mCtx,cheeseAndCrackersOrderNow.class);
                        mCtx.startActivity(intent8);
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
