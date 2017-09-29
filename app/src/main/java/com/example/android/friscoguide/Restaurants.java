package com.example.android.friscoguide;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.android.friscoguide.Element;
import com.example.android.friscoguide.ElementAdapt;
import com.example.android.friscoguide.R;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ImageView back = (ImageView) findViewById(R.id.button_back);

        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(Restaurants.this, MainActivity.class);
                startActivity(backIntent);
            }
        });

        ImageView attractions = (ImageView) findViewById(R.id.button_attractions);

        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(Restaurants.this, Attractions.class);
                startActivity(attractionsIntent);
            }
        });

        ImageView parks = (ImageView) findViewById(R.id.button_parks);

        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(Restaurants.this, Parks.class);
                startActivity(parksIntent);
            }
        });

        ImageView bars = (ImageView) findViewById(R.id.button_bars);

        bars.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent barsIntent = new Intent(Restaurants.this, Bars.class);
                startActivity(barsIntent);
            }
        });

        ArrayList<Element> elements = new ArrayList<Element>();
        elements.add(new Element(getString(R.string.pizzeria_testa), getString(R.string.pizzeria_testa_address), R.drawable.pizzeria_testa));
        elements.add(new Element(getString(R.string.rockfish_seafood), getString(R.string.rockfish_seafood_address), R.drawable.rockfish_seafood));
        elements.add(new Element(getString(R.string.tavolo_italia), getString(R.string.tavolo_italia_address), R.drawable.tavolo));
        elements.add(new Element(getString(R.string.kotta_sushi), getString(R.string.kotta_sushi_address), R.drawable.kotta_sushi_lounge));
        elements.add(new Element(getString(R.string.perrys_steakhouse), getString(R.string.perrys_steakhouse_address), R.drawable.perrys_steakhouse));
        elements.add(new Element(getString(R.string.mashd), getString(R.string.mashd_address), R.drawable.mashd));
        elements.add(new Element(getString(R.string.la_hacienda), getString(R.string.la_hacienda_address), R.drawable.la_hacidenca_ranch));
        elements.add(new Element(getString(R.string.platia_greek), getString(R.string.platia_greek_address), R.drawable.platia_greek_kouzina));
        elements.add(new Element(getString(R.string.hutchins_bbq), getString(R.string.hutchins_bbq_address), R.drawable.hutchins_bbq));
        elements.add(new Element(getString(R.string.simply_thai), getString(R.string.simply_thai_address), R.drawable.simply_thai_bistro));

        ElementAdapt adapter = new ElementAdapt(this, elements);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
