package com.unsplash.unsplash.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.unsplash.unsplash.components.DaggerSearchResultScreenComponent;
import com.unsplash.unsplash.R;
import com.unsplash.unsplash.adapters.SearchResultAdapter;
import com.unsplash.unsplash.presenters.SearchResultContract;
import com.unsplash.unsplash.presenters.SearchResultPresenter;
import com.unsplash.unsplash.modules.SearchResultScreenModule;
import com.unsplash.unsplash.models.PhotoResponseObject;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements SearchResultContract.View {

    @Inject
    SearchResultPresenter searchResultPresenter;
    RecyclerView searchResultRecyclerView;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchResultRecyclerView = (RecyclerView)findViewById(R.id.search_result_recylerview);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        DaggerSearchResultScreenComponent.builder().
                netComponent(((App) getApplicationContext()).
                        getmNetComponent()).searchResultScreenModule(new SearchResultScreenModule(this)).
                build().inject(this);

        searchResultPresenter.getSearchResultsForQuery();

    }

    @Override
    public void showUpdatedResults(List<PhotoResponseObject> photoResponseObjects) {
        searchResultRecyclerView.setAdapter(new SearchResultAdapter(MainActivity.this,photoResponseObjects));
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }
}
