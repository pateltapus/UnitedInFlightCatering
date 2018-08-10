package com.example.u356971.unitedinflightcatering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Beverages extends AppCompatActivity {

    //recyclerview objects
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    //model object for our list data
    private List<MyList> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);

        recyclerView = (RecyclerView) findViewById(R.id.beverageView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        //loading list view item with this function
        loadRecyclerViewItem();
    }

    private void loadRecyclerViewItem() {
        MyList complimentaryDrinks = new MyList("Complimentary Beverages", "", "complimentaryDrinks", R.drawable.drinks);
        list.add(complimentaryDrinks);

        MyList wine = new MyList("House red and white wine", "", "wine", R.drawable.wine);
        list.add(wine);

        MyList beer = new MyList("Beers", "", "beer", R.drawable.beer);
        list.add(beer);

        MyList spirits = new MyList("Spirits", "", "spirits", R.drawable.spirits);
        list.add(spirits);

        adapter = new BeverageAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }

    public void showCart(View view)
    {
        Intent intent = new Intent(this, shoppingCart.class);
        startActivity(intent);
    }
}
