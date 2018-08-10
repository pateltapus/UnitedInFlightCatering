package com.example.u356971.unitedinflightcatering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Snackboxes extends AppCompatActivity {

    //recyclerview objects
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    //model object for our list data
    private List<MyList> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackboxes);

        recyclerView = (RecyclerView) findViewById(R.id.Snackboxes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        //loading list view item with this function
        loadRecyclerViewItem();
    }

    private void loadRecyclerViewItem() {
        MyList classic = new MyList("Classic Snackbox", "", "classicBox", R.drawable.classic_snackbox);
        list.add(classic);

        MyList select = new MyList("Select Snackbox", "", "selectBox", R.drawable.selectbox);
        list.add(select);

        MyList kidsBox = new MyList("Kid's Snackbox", "", "kidsBox", R.drawable.kidsbox);
        list.add(kidsBox);

        MyList tapas = new MyList("Tapas Snackbox", "", "tapasBox", R.drawable.tapasbox);
        list.add(tapas);

        adapter = new snackBoxAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }

    public void showCart(View view)
    {
        Intent intent = new Intent(this, shoppingCart.class);
        startActivity(intent);
    }
}
