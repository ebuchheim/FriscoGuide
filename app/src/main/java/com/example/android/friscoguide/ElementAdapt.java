package com.example.android.friscoguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.friscoguide.R;

import java.util.ArrayList;

/**
 * Created by Emma Buchheim on 9/5/2017.
 */

public class ElementAdapt extends ArrayAdapter<Element> {

    private static final String LOG_TAG = ElementAdapt.class.getSimpleName();

    public ElementAdapt(Activity context, ArrayList<Element> elements) {
        super(context, android.R.layout.simple_list_item_1, elements);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Element currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);

        nameTextView.setText(currentWord.getAttractionName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);

        addressTextView.setText(currentWord.getAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {

            imageView.setImageResource(currentWord.getImageResourceID());

            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        return listItemView;
    }
}