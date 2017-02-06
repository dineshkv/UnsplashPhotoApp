package com.unsplash.unsplash.Binding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class CustomBindingAdapter {
   @BindingAdapter("bind:imageUrl")
   public static void loadImage(ImageView imageView, String url) {
      Glide
              .with(imageView.getContext())
              .load(url)
              .centerCrop()
              .crossFade()
              .into(imageView);   }
} 