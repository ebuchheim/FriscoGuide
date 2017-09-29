package com.example.android.friscoguide;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.friscoguide.Element;
import com.example.android.friscoguide.ElementAdapt;
import com.example.android.friscoguide.R;

import java.util.ArrayList;

public class Parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        ImageView back = (ImageView) findViewById(R.id.button_back);

        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(Parks.this, MainActivity.class);
                startActivity(backIntent);
            }
        });

        ImageView bars = (ImageView) findViewById(R.id.button_bars);

        bars.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent barsIntent = new Intent(Parks.this, Bars.class);
                startActivity(barsIntent);
            }
        });

        ImageView attractions = (ImageView) findViewById(R.id.button_attractions);

        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(Parks.this, Attractions.class);
                startActivity(attractionsIntent);
            }
        });

        ImageView restaurants = (ImageView) findViewById(R.id.button_food);

        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(Parks.this, Restaurants.class);
                startActivity(restaurantsIntent);
            }
        });

        ArrayList<Element> elements = new ArrayList<Element>();

        elements.add(new Element(getString(R.string.central_park), getString(R.string.central_park_address)));
        elements.add(new Element(getString(R.string.crescent_park), getString(R.string.crescent_park_address)));
        elements.add(new Element(getString(R.string.foncine_park), getString(R.string.foncine_park_address)));
        elements.add(new Element(getString(R.string.preston_north_park), getString(R.string.preston_north_address)));
        elements.add(new Element(getString(R.string.hummingbird_park), getString(R.string.hummingbird_park_address)));
        elements.add(new Element(getString(R.string.frisco_commons_park), getString(R.string.frisco_commons_address)));
        elements.add(new Element(getString(R.string.oakbrook_park), getString(R.string.oakbrook_park_address)));
        elements.add(new Element(getString(R.string.beavers_bend), getString(R.string.beavers_bend_address)));
        elements.add(new Element(getString(R.string.mourning_dove), getString(R.string.mourning_dove_address)));
        elements.add(new Element(getString(R.string.harold_bacchus), getString(R.string.harold_bacchus_address)));

        ElementAdapt adapter = new ElementAdapt(this, elements);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
