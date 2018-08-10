package com.example.u356971.unitedinflightcatering;

import java.util.ArrayList;
import java.util.List;
public class DataHolder {

    private List<ShoppingCartEntry> myItems = new ArrayList<>();

    public List<ShoppingCartEntry> getMyItems()
    {
        return myItems;
    }

    public void addItem(ShoppingCartEntry item)
    {
        myItems.add(item);
    }

    private static final DataHolder holder = new DataHolder();
    public static DataHolder getInstance() {return holder;}
}
