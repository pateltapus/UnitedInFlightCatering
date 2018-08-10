package com.example.u356971.unitedinflightcatering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class complimentaryDrinksMoreInfo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complimentary_drinks_more_info);
    }

    public void showCart(View view)
    {
        Intent intent = new Intent(this, shoppingCart.class);
        startActivity(intent);
    }
}
