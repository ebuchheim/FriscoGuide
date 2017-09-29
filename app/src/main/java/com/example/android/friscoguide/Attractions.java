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

public class Attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        ImageView back = (ImageView) findViewById(R.id.button_back);

        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(Attractions.this, MainActivity.class);
                startActivity(backIntent);
            }
        });

        ImageView bars = (ImageView) findViewById(R.id.button_bars);

        bars.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent barsIntent = new Intent(Attractions.this, Bars.class);
                startActivity(barsIntent);
            }
        });

        ImageView parks = (ImageView) findViewById(R.id.button_parks);

        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(Attractions.this, Parks.class);
                startActivity(parksIntent);
            }
        });

        ImageView restaurants = (ImageView) findViewById(R.id.button_food);

        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(Attractions.this, Restaurants.class);
                startActivity(restaurantsIntent);
            }
        });


        // Create a list of words
        ArrayList<Element> elements = new ArrayList<Element>();

        elements.add(new Element(getString(R.string.cowboys), getString(R.string.cowboys_address)));
        elements.add(new Element(getString(R.string.ballpark), getString(R.string.ballpark_address)));
        elements.add(new Element(getString(R.string.railroad_museum), getString(R.string.railroad_museum_address)));
        elements.add(new Element(getString(R.string.cinemark), getString(R.string.cinemark_address)));
        elements.add(new Element(getString(R.string.dave_busters), getString(R.string.dave_busters_address)));
        elements.add(new Element(getString(R.string.videogame_museum), getString(R.string.videogame_museum_address)));
        elements.add(new Element(getString(R.string.main_event), getString(R.string.main_event_address)));
        elements.add(new Element(getString(R.string.heritage_museum), getString(R.string.heritage_museum_address)));
        elements.add(new Element(getString(R.string.raceway), getString(R.string.raceway_address)));
        elements.add(new Element(getString(R.string.discovery_center), getString(R.string.discovery_center_address)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ElementAdapt adapter = new ElementAdapt(this, elements);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
