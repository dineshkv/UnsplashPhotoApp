package com.unsplash.unsplash.models;


import com.google.gson.annotations.SerializedName;
import com.unsplash.unsplash.models.Photo;

public class PhotoResponseObject {

    @SerializedName("urls")
    private Photo photo;


    public Photo getPhoto() {
        return photo;
    }
}
