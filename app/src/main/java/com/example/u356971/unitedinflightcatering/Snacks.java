package com.example.u356971.unitedinflightcatering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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
        MyList deepDish = new MyList("UNO® pepperoni deep dish pizza", "Pepperoni, mozzarella cheese, Romano cheese and tomato sauce in a deep-dish crust","deepDish", R.drawable.deepdish);
        list.add(deepDish);

        MyList cheeseBurger = new MyList("Smoked Gouda cheeseburger","Beef patty and smoked Gouda cheese on a BROOKLYN BRED® bistro bun. Served with Sir Kensingtons ketchup, mustard and chipotle mayonnaise on the side","cheeseBurger", R.drawable.cheeseburger);
        list.add(cheeseBurger);

        MyList chickenSandwich = new MyList("Barbecue chicken sandwich", "Pulled smoked chicken, barbecue sauce, cheddar jack cheese and a dill pickle plank on a focaccia roll", "chickenSandwich", R.drawable.chickensandwich);
        list.add(chickenSandwich);

        MyList sampler = new MyList("Mezze sampler", "Wheat berry salad with quinoa, edamame and corn, sun-dried tomato basil hummus, almonds and triangle pita pieces","sampler", R.drawable.mezzesampler);
        list.add(sampler);



        adapter = new LunchAndDinnerAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }
}
