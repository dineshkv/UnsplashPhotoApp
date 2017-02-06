package com.unsplash.unsplash.modules;

import com.unsplash.unsplash.presenters.SearchResultContract;
import com.unsplash.unsplash.components.CustomScope;

import dagger.Module;
import dagger.Provides;
@Module
public class SearchResultScreenModule {

    private final SearchResultContract.View mView;

    public SearchResultScreenModule(SearchResultContract.View mView) {
        this.mView = mView;
    }

    @Provides

    SearchResultContract.View provideSearchResultContractView(){
        return mView;
    }
}
