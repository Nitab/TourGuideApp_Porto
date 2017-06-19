package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Anita on 13/06/2017.
 */

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //The array list is created with the values of each item

        final ArrayList<Curiosities> curiosity = new ArrayList<Curiosities>();

        //las string se pueden llamar por int y así no hay que hacerles el getString..(Revisión)
        curiosity.add(new Curiosities(getString(R.string.restaurant_1), getString(R.string.detail_restaurant1), (R.drawable.restaurant_1)));
        curiosity.add(new Curiosities(getString(R.string.restaurant_2), getString(R.string.detail_restaurant2), (R.drawable.restaurant_2)));
        curiosity.add(new Curiosities(getString(R.string.restaurant_3), getString(R.string.detail_restaurant3), (R.drawable.restaurant_3)));
        curiosity.add(new Curiosities(getString(R.string.restaurant_4), getString(R.string.detail_restaurant4), (R.drawable.restaurant_4)));
        curiosity.add(new Curiosities(getString(R.string.restaurant_5), getString(R.string.detail_restaurant5), (R.drawable.restaurant_5)));
        curiosity.add(new Curiosities(getString(R.string.restaurant_6), getString(R.string.detail_restaurant6), (R.drawable.restaurant_6)));
        curiosity.add(new Curiosities(getString(R.string.restaurat_7), getString(R.string.detail_restaurant_7), (R.drawable.restaurant_7)));
        curiosity.add(new Curiosities(getString(R.string.restaurant_8), getString(R.string.detail_restaurant8), (R.drawable.restaurant_8)));

        //An adapter is created to make an intermerdiary between the listView and the object
        CuriositiesAdapter adapter = new CuriositiesAdapter(this, curiosity);
        ListView listView = (ListView) findViewById(R.id.list);//Call to ListView

        listView.setAdapter(adapter);//Fill the listView with the content of the adapter


    }
}