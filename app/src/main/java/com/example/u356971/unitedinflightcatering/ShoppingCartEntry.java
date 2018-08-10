package com.example.u356971.unitedinflightcatering;

public class ShoppingCartEntry {

    private String mItemName;
    private int mQuantity;
    private double mPrice;
    private int mDrawableID;

    public ShoppingCartEntry(String itemname, int quantity, double price, int drawableID)
    {
        mItemName = itemname;
        mQuantity = quantity;
        mPrice = price;
        mDrawableID = drawableID;
    }

    public String getItemName()
    {
        return mItemName;
    }

    public int getQuantity()
    {
        return mQuantity;
    }

    public double getPrice()
    {
        return mPrice;
    }

    public int getDrawableID()
    {
        return mDrawableID;
    }
}
