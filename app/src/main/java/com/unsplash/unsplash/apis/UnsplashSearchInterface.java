package com.unsplash.unsplash.apis;

import com.unsplash.unsplash.models.PhotoResponseObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UnsplashSearchInterface {

    @GET("/photos/?client_id=13316a315d5720efa8b4312da0e1315a9b308a4eb2ee232c500eb76b14492cac")
    Call<List<PhotoResponseObject>> getPhotos();
}
