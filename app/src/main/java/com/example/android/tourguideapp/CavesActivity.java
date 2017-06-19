package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Anita on 13/06/2017.
 */

public class CavesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //The array list is created with the values of each item

        final ArrayList<Curiosities> curiosity = new ArrayList<Curiosities>();

        curiosity.add(new Curiosities(getString(R.string.cave1), getString(R.string.detail_cave1), (R.drawable.cave_1)));
        curiosity.add(new Curiosities(getString(R.string.cave2), getString(R.string.detail_cave2), (R.drawable.cave_2)));
        curiosity.add(new Curiosities(getString(R.string.cave3), getString(R.string.detail_cave3), (R.drawable.cave_3)));
        curiosity.add(new Curiosities(getString(R.string.cave4), getString(R.string.detail_cave4), (R.drawable.cave_4)));
        curiosity.add(new Curiosities(getString(R.string.cave5), getString(R.string.detail_cave5), (R.drawable.cave_5)));

        //An adapter is created to make an intermerdiary between the listView and the object
        CuriositiesAdapter adapter = new CuriositiesAdapter(this, curiosity);
        ListView listView = (ListView) findViewById(R.id.list);//Call to ListView

        listView.setAdapter(adapter);//Fill the listView with the content of the adapter

    }
}