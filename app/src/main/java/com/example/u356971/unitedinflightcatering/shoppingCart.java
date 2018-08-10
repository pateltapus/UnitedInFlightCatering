package com.example.u356971.unitedinflightcatering;

import android.app.Dialog;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class shoppingCart extends AppCompatActivity {

    List<ShoppingCartEntry> allItems;
    double subTotal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        allItems = DataHolder.getInstance().getMyItems();
        setTextForTest();
    }

    private void setTextForTest()
    {
        int i=1;
        for(ShoppingCartEntry item: allItems)
        {
            String itemName = "item" + i;
            int itemID = getResources().getIdentifier(itemName,"id",getPackageName());
            String costName = itemName + "Cost";
            int costID = getResources().getIdentifier(costName,"id",getPackageName());
            String itemImg = "itemImage" + i;
            int imgID = getResources().getIdentifier(itemImg,"id", getPackageName());

            TextView itemTextView = (TextView)findViewById(itemID);
            TextView costTextView = (TextView)findViewById(costID);
            ImageView itemImageView = (ImageView)findViewById(imgID);
            double totalCost = (double)item.getQuantity() * item.getPrice();
            subTotal += totalCost;
            String tCost = String.valueOf(totalCost);
            String quantity = String.valueOf(item.getQuantity());
            String price = String.valueOf(item.getPrice());
            itemTextView.setText(item.getItemName());
            costTextView.setText("$" + price + " x " + quantity);
            itemImageView.setImageResource(item.getDrawableID());
            TextView subTotalView = (TextView)findViewById(R.id.subtotal);
            subTotalView.setText("  Subtotal: " + String.valueOf(subTotal));
            i+=1;
        }
    }

    public void purchaseOrder(View view)
    {
        Dialog dialog = new Dialog(this);

        dialog.setTitle("Payment Options");
        dialog.setContentView(R.layout.paymentoptions);
        dialog.show();
    }
}
