package com.example.u356971.unitedinflightcatering;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class deepDishOrderNow extends AppCompatActivity {

    int amount = 0;
    double price = 9.99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deepdish_order_now);
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
        ShoppingCartEntry addtoCart = new ShoppingCartEntry("UNO® pepperoni deep dish pizza", amount, price, R.drawable.deepdish);
        DataHolder.getInstance().addItem(addtoCart);
    }

    public void showCart(View view)
    {
        Intent intent = new Intent(this, shoppingCart.class);
        startActivity(intent);
    }
}
