package com.unsplash.unsplash.models;


import com.google.gson.annotations.SerializedName;
import com.unsplash.unsplash.models.Photo;

public class PhotoResponseObj {

    @SerializedName("urls")
    private Photo photo;

    private User user;


    public User getUser() {
        return user;
    }

    public Photo getPhoto() {
        return photo;
    }
}
