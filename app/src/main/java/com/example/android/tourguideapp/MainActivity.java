package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txvRestaurant = (TextView) findViewById(R.id.txvRestaurants);
        TextView txvMonuments = (TextView) findViewById(R.id.txvMonuments);
        TextView txvCaves = (TextView) findViewById(R.id.txvCaves);
        TextView txvGastronomy = (TextView) findViewById(R.id.txvGastronomy);

        txvRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(i);
            }
        });

        txvMonuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MonumentsActivity.class);
                startActivity(i);
            }
        });

        txvCaves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CavesActivity.class);
                startActivity(i);
            }

        });
        txvGastronomy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GastronomyActivity.class);
                startActivity(i);
            }
        });

    }
}
