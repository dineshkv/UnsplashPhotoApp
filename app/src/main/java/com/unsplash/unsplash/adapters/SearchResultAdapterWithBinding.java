package com.unsplash.unsplash.adapters;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unsplash.unsplash.BR;
import com.unsplash.unsplash.R;
import com.unsplash.unsplash.models.Photo;
import com.unsplash.unsplash.models.PhotoResponseObj;

import java.util.List;

/**
 * A custom adapter to use with the RecyclerView widget.
 */
public class SearchResultAdapterWithBinding extends RecyclerView.Adapter<SearchResultAdapterWithBinding.BindingHolder> {
    private List<PhotoResponseObj> photos;

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public BindingHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }

    public SearchResultAdapterWithBinding(List<PhotoResponseObj> recyclerUsers) {
        this.photos = recyclerUsers;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int type) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_item_layout, parent, false);
        BindingHolder holder = new BindingHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        final PhotoResponseObj photoResponseObj = photos.get(position);
        holder.getBinding().setVariable(BR.photoResponseObj, photoResponseObj);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return photos.size();
    }
}