package com.unsplash.unsplash.presenters;

import com.unsplash.unsplash.apis.UnsplashSearchInterface;
import com.unsplash.unsplash.models.PhotoResponseObject;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SearchResultPresenter implements SearchResultContract.Presenter {

    private Retrofit retrofit;
    private SearchResultContract.View mView;

    @Inject
    public SearchResultPresenter(Retrofit retrofit, SearchResultContract.View mView) {
        this.retrofit = retrofit;
        this.mView = mView;
    }
    @Override
    public void getSearchResultsForQuery() {
        retrofit.create(UnsplashSearchInterface.class).getPhotos().enqueue(new Callback<List<PhotoResponseObject>>() {
            @Override
            public void onResponse(Call<List<PhotoResponseObject>> call, Response<List<PhotoResponseObject>> response) {
                System.out.println();
                mView.showUpdatedResults(response.body());
                mView.hideProgressBar();

            }

            @Override
            public void onFailure(Call<List<PhotoResponseObject>> call, Throwable t) {
                System.out.println();
            }
        });

    }

}
