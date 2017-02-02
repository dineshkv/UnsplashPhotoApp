package com.unsplash.unsplash.presenters;

import com.unsplash.unsplash.models.PhotoResponseObject;

import java.util.List;

public interface SearchResultContract {


    interface View{
        void showUpdatedResults(List<PhotoResponseObject> photoResponseObjects);
        void hideProgressBar();
    }

    interface Presenter {
        void getSearchResultsForQuery();
    }
}
