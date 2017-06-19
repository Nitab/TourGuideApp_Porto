package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Anita on 13/06/2017.
 */

public class GastronomyActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //The array list is created with the values of each item

        final ArrayList<Curiosities> curiosity = new ArrayList<Curiosities>();

        curiosity.add(new Curiosities(getString(R.string.gastronomy_1), getString(R.string.detail_gastronomy1), (R.drawable.gastronomy_1)));
        curiosity.add(new Curiosities(getString(R.string.gastronomy_2), getString(R.string.detail_gastronomy2), (R.drawable.gastronomy_2)));
        curiosity.add(new Curiosities(getString(R.string.gastronomy_3), getString(R.string.detail_gastronomy3), (R.drawable.gastronomy_3)));
        curiosity.add(new Curiosities(getString(R.string.gastronomy_4), getString(R.string.detail_gastronomy4), (R.drawable.gastronomy_4)));
        curiosity.add(new Curiosities(getString(R.string.gastronomy_5), getString(R.string.detail_gastronomy5), (R.drawable.gastronomy_5)));
        curiosity.add(new Curiosities(getString(R.string.gastronomy_6), getString(R.string.detail_gastronomy6), (R.drawable.gastronomy_6)));
        curiosity.add(new Curiosities(getString(R.string.gastronomy_7), getString(R.string.detail_gastronomy7), (R.drawable.gastronomy_7)));
        curiosity.add(new Curiosities(getString(R.string.gastronomy_8), getString(R.string.detail_gastronomy8), (R.drawable.gastronomy_8)));

        //An adapter is created to make an intermerdiary between the listView and the object
        CuriositiesAdapter adapter = new CuriositiesAdapter(this, curiosity);
        ListView listView = (ListView) findViewById(R.id.list);//Call to ListView

        listView.setAdapter(adapter);//Fill the listView with the content of the adapter


    }
}