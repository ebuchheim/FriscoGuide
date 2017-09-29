package com.example.android.friscoguide;

import android.media.Image;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

/**
 * Created by Emma Buchheim on 9/4/2017.
 */

public class Element {

    private String gAttractionName;

    private String gAddress;

    private int gImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Element(String attractionName, String address) {
        gAttractionName = attractionName;
        gAddress = address;
    }

    public Element(String attractionName, String address, int imageResourceID) {
        gAttractionName = attractionName;
        gAddress = address;
        gImageResourceID = imageResourceID;
    }

    public String getAttractionName() {
        return gAttractionName;
    }

    public String getAddress() {
        return gAddress;
    }

    public int getImageResourceID() {
        return gImageResourceID;
    }

    public boolean hasImage() {
        return gImageResourceID != NO_IMAGE_PROVIDED;
    }

}