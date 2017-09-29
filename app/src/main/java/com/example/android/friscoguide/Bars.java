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

public class Bars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);

        ImageView back = (ImageView) findViewById(R.id.button_back);

        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(Bars.this, MainActivity.class);
                startActivity(backIntent);
            }
        });

        ImageView attractions = (ImageView) findViewById(R.id.button_attractions);

        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(Bars.this, Attractions.class);
                startActivity(attractionsIntent);
            }
        });

        ImageView parks = (ImageView) findViewById(R.id.button_parks);

        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(Bars.this, Parks.class);
                startActivity(parksIntent);
            }
        });

        ImageView restaurants = (ImageView) findViewById(R.id.button_food);

        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(Bars.this, Restaurants.class);
                startActivity(restaurantsIntent);
            }
        });

        ArrayList<Element> elements = new ArrayList<Element>();
        elements.add(new Element(getString(R.string.frisco_rail_yard), getString(R.string.rail_yard_address), R.drawable.frisco_rail_yard));
        elements.add(new Element(getString(R.string.british_lion), getString(R.string.british_lion_address), R.drawable.british_lion_pub));
        elements.add(new Element(getString(R.string.restaurant_drafthouse), getString(R.string.restaurant_drafthouse_address), R.drawable.th_street_restaurant));
        elements.add(new Element(getString(R.string.nerdvana), getString(R.string.nerdvana_address), R.drawable.nerdvana_spirits));
        elements.add(new Element(getString(R.string.trufire_bar), getString(R.string.trufire_bar_address), R.drawable.trufire_kitchen_bar));
        elements.add(new Element(getString(R.string.frisco_bar), getString(R.string.frisco_bar_address), R.drawable.the_frisco_bar));
        elements.add(new Element(getString(R.string.stans_main_st), getString(R.string.stans_main_st_address), R.drawable.stans_main_street));
        elements.add(new Element(getString(R.string.roots_bar), getString(R.string.roots_bar_address), R.drawable.the_roots_bar));
        elements.add(new Element(getString(R.string.wild_pitch), getString(R.string.wild_pitch_address), R.drawable.wild_pitch_sports_bar));
        elements.add(new Element(getString(R.string.green_gator), getString(R.string.green_gator_address), R.drawable.the_green_gator));

        ElementAdapt adapter = new ElementAdapt(this, elements);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
