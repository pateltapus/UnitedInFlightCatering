package com.example.u356971.unitedinflightcatering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import java.util.List;
import java.util.ArrayList;
import android.view.View;

public class LunchAndDinner extends AppCompatActivity {

    //recyclerview objects
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    //model object for our list data
    private List<MyList> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_and_dinner);

        recyclerView = (RecyclerView) findViewById(R.id.lunchAndDinnerMenu);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        //loading list view item with this function
        loadRecyclerViewItem();
    }

    private void loadRecyclerViewItem() {
        MyList deepDish = new MyList("UNO® pepperoni deep dish pizza", "Pepperoni, mozzarella cheese, Romano cheese and tomato sauce in a deep-dish crust","deepDish", R.drawable.deepdish);
        list.add(deepDish);

        MyList cheeseBurger = new MyList("Smoked Gouda cheeseburger","Beef patty and smoked Gouda cheese on a BROOKLYN BRED® bistro bun.","cheeseBurger", R.drawable.cheeseburger);
        list.add(cheeseBurger);

        MyList chickenSandwich = new MyList("Barbecue chicken sandwich", "Pulled smoked chicken, barbecue sauce, cheddar jack cheese and a dill pickle plank on a focaccia roll", "chickenSandwich", R.drawable.chickensandwich);
        list.add(chickenSandwich);

        MyList sampler = new MyList("Mezze sampler", "Wheat berry salad with quinoa, edamame and corn, sun-dried tomato basil hummus, almonds and triangle pita pieces","sampler", R.drawable.mezzesampler);
        list.add(sampler);



        adapter = new LunchAndDinnerAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }

    public void showCart(View view)
    {
        Intent intent = new Intent(this, shoppingCart.class);
        startActivity(intent);
    }
}
