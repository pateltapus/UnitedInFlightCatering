package com.example.u356971.unitedinflightcatering;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //recyclerview objects
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    //model object for our list data
    private List<MyList> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_homepage);

        //initializing views

        LinearLayout LunchAndDinner = (LinearLayout) findViewById(R.id.lunchAndDinner);
        LunchAndDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LunchAndDinner.class);
                startActivity(intent);
            }


        });

        LinearLayout Beverages = (LinearLayout) findViewById(R.id.beverages);
        Beverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Beverages.class);
                startActivity(intent);
            }


        });

        LinearLayout Snacks = (LinearLayout) findViewById(R.id.snacks);
        Snacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Snacks.class);
                startActivity(intent);
            }


        });

        LinearLayout snackBoxes = (LinearLayout) findViewById(R.id.snackboxes);
        snackBoxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Snackboxes.class);
                startActivity(intent);
            }


        });

    }
}
