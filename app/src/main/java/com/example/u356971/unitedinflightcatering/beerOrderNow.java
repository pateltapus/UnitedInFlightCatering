package com.example.u356971.unitedinflightcatering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;


public class beerOrderNow extends AppCompatActivity {

    int amount = 0;
    double price = 7.99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_order_now);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.beers_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    public void increaseInteger(View view) {
        amount = amount + 1;
        display(amount);

    }public void decreaseInteger(View view) {
        if(amount > 0)
        {
            amount = amount- 1;
        }
        display(amount);
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number);
        displayInteger.setText("" + number);
    }

    public void addToCart(View view)
    {
        ShoppingCartEntry addtoCart = new ShoppingCartEntry("Stella Artois®", amount, price, R.drawable.stella);
        DataHolder.getInstance().addItem(addtoCart);
    }

    public void showCart(View view)
    {
        Intent intent = new Intent(this, shoppingCart.class);
        startActivity(intent);
    }
}
