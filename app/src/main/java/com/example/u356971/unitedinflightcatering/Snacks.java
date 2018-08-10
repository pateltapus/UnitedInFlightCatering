package com.example.u356971.unitedinflightcatering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Snacks extends AppCompatActivity {

    //recyclerview objects
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    //model object for our list data
    private List<MyList> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

        recyclerView = (RecyclerView) findViewById(R.id.Snacks);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        //loading list view item with this function
        loadRecyclerViewItem();
    }

    private void loadRecyclerViewItem() {
        MyList jerky = new MyList("Think Jerky®", "Sweet Chipotle Grass-Fed Beef Jerky", "jerky", R.drawable.jerky);
        list.add(jerky);

        MyList nuts = new MyList("Nuts.com CB&J® mix", "Butter toffee cashews, roasted salted cashews, dried strawberries, raisins, sliced cranberries", "cb&j_mix", R.drawable.nuts);
        list.add(nuts);

        MyList chips = new MyList("Lillie's Q", "Sea Salt & Black Pepper Kettle Chips", "chips", R.drawable.chips);
        list.add(chips);

        MyList gummyBears = new MyList("Haribo®", "Gold-Bears® Gummi Candy", "gummybears", R.drawable.gummybears);
        list.add(gummyBears);

        MyList pringles = new MyList("Pringles®", "Original Potato Crisps", "pringles", R.drawable.pringles);
        list.add(pringles);

        MyList hummus = new MyList("Hummus and crispbreads\n", "Dipin™ classic hummus with Primizie® Simply Salted thick cut crispbreads", "hummus", R.drawable.hummusandcrisps);
        list.add(hummus);

        MyList mandm = new MyList("M&M'S®", "Milk Chocolate Candies", "m&m", R.drawable.mandm);
        list.add(mandm);

        MyList cheeseandcrackers = new MyList("Cheese and crackers snackbox", "Bagel chips, roasted poblano cheddar dip, chocolate square, Everything Parmcrisps™, cheddar cheese, white cheddar cheese", "cheeseandcrackers", R.drawable.cheeseandcrackers);
        list.add(cheeseandcrackers);

        adapter = new snackAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }

    public void showCart(View view)
    {
        Intent intent = new Intent(this, shoppingCart.class);
        startActivity(intent);
    }
}
