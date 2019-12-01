package com.example.webscrapingtest;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("ballpen", 10.00));
        items.add(new Item("ballpen2", 10.00));
        items.add(new Item("ballpen3", 10.00));
        items.add(new Item("ballpen4", 10.00));
        items.add(new Item("ballpen5", 10.00));
        items.add(new Item("ballpen6", 10.00));
        items.add(new Item("ballpen7", 10.00));
        items.add(new Item("ballpen8", 10.00));
        items.add(new Item("ballpen9", 10.00));
        items.add(new Item("ballpen10", 10.00));

        ItemsAdapter adapter = new ItemsAdapter(this, R.layout.wishlist_items, items);
        ListView listView = (ListView) findViewById(R.id.listViewItems);
        listView.setAdapter(adapter);
    }
}