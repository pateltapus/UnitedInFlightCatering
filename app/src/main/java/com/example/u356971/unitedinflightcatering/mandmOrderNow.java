package com.example.u356971.unitedinflightcatering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mandmOrderNow extends AppCompatActivity {

    int amount = 0;
    double price = 3.99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandm_order_now);
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
        ShoppingCartEntry addtoCart = new ShoppingCartEntry("M&M'S®", amount, price, R.drawable.mandm);
        DataHolder.getInstance().addItem(addtoCart);
    }

    public void showCart(View view)
    {
        Intent intent = new Intent(this, shoppingCart.class);
        startActivity(intent);
    }
}
