package com.unsplash.unsplash.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.unsplash.unsplash.R;
import com.unsplash.unsplash.models.PhotoResponseObj;

import java.util.List;

/**
 * A custom adapter to use with the RecyclerView widget.
 */
public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.ViewHolder> {

    private List<PhotoResponseObj> mPhotoResponseObjs;
    private Context mcContext;

    public SearchResultAdapter(Context context,List<PhotoResponseObj> mPhotoResponseObjs) {
        this.mPhotoResponseObjs = mPhotoResponseObjs;
        this.mcContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_item_layout, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder itemViewHolder, int position) {
        Glide
                .with(mcContext)
                .load(mPhotoResponseObjs.get(position).getPhoto().getSmallImage())
                .centerCrop()
                .crossFade()
                .into(itemViewHolder.photoImageView);

    }

    @Override
    public int getItemCount() {

        return mPhotoResponseObjs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView photoImageView;
        public ViewHolder(View itemView) {
            super(itemView);
            photoImageView = (ImageView) itemView.findViewById(R.id.photo_imageview);
        }
    }
}
