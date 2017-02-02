package com.unsplash.unsplash.models;

import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("regular")
    private String smallImage;


    public String getSmallImage() {
        return smallImage;
    }
}
