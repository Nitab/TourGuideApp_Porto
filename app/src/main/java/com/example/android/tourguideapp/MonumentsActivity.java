package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Anita on 13/06/2017.
 */

public class MonumentsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //The array list is created with the values of each item

        final ArrayList<Curiosities> curiosity = new ArrayList<Curiosities>();

        curiosity.add(new Curiosities(getString(R.string.monument_1), getString(R.string.detail_monument1), (R.drawable.monument_1)));
        curiosity.add(new Curiosities(getString(R.string.monument_2), getString(R.string.detail_monument2), (R.drawable.monument_2)));
        curiosity.add(new Curiosities(getString(R.string.monument_3), getString(R.string.detail_monument3), (R.drawable.monument_3)));
        curiosity.add(new Curiosities(getString(R.string.monument_4), getString(R.string.detail_monument4), (R.drawable.monument_4)));
        curiosity.add(new Curiosities(getString(R.string.monument_5), getString(R.string.detail_monument5), (R.drawable.monument_5)));
        curiosity.add(new Curiosities(getString(R.string.monument_6), getString(R.string.detail_monument6), (R.drawable.monument_6)));
        curiosity.add(new Curiosities(getString(R.string.monument_7), getString(R.string.detail_monument7), (R.drawable.monument_7)));
        curiosity.add(new Curiosities(getString(R.string.monument_8), getString(R.string.detail_monument8), (R.drawable.monument_8)));
        curiosity.add(new Curiosities(getString(R.string.monument_9), getString(R.string.detail_monument9), (R.drawable.monument_9)));
        curiosity.add(new Curiosities(getString(R.string.monument_10), getString(R.string.detail_monument10), (R.drawable.monument_10)));

        //An adapter is created to make an intermerdiary between the listView and the object
        CuriositiesAdapter adapter = new CuriositiesAdapter(this, curiosity);
        ListView listView = (ListView) findViewById(R.id.list);//Call to ListView

        listView.setAdapter(adapter);//Fill the listView with the content of the adapter

    }
}