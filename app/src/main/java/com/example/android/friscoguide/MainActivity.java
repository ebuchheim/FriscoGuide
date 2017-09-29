/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.friscoguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.friscoguide.R;

import java.util.ArrayList;

import static com.example.android.friscoguide.R.id.restaurants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);


// Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView bars = (TextView) findViewById(R.id.bars);

// Set a click listener on that View
        bars.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent BarsIntent = new Intent(MainActivity.this, Bars.class);
                startActivity(BarsIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView attractions = (TextView) findViewById(R.id.attractions);

// Set a click listener on that View
        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(MainActivity.this, Attractions.class);
                startActivity(attractionsIntent);
            }
        });

        // Find the View that shows the parks category
        TextView parks = (TextView) findViewById(R.id.parks);

// Set a click listener on that View
        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(MainActivity.this, Parks.class);
                startActivity(parksIntent);
            }
        });

    }



}
