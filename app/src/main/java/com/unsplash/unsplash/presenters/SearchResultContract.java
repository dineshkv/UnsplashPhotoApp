package com.unsplash.unsplash.presenters;

import com.unsplash.unsplash.models.PhotoResponseObj;

import java.util.List;

public interface SearchResultContract {


    interface View{
        void showUpdatedResults(List<PhotoResponseObj> photoResponseObjs);
        void hideProgressBar();
    }

    interface Presenter {
        void getSearchResultsForQuery();
    }
}
