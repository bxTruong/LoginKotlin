package com.truongbx.loginkotlin

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadImage")
fun bindingLoadImage(imageView: ImageView, imageUri: Int) {
    Glide.with(imageView.context).load(imageUri).into(imageView)
}

