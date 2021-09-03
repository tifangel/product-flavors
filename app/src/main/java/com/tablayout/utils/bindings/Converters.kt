package com.tablayout.utils.bindings

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.GenericTransitionOptions
import com.tablayout.R
import com.tablayout.utils.glide.GlideApp

@BindingAdapter("setImageUrl")
fun AppCompatImageView.setImageUrl(imageUrl: String?) {
    GlideApp.with(this)
        .load(imageUrl)
        .placeholder(R.drawable.placeholder_image)
        .error(R.drawable.placeholder_image)
        .transition(GenericTransitionOptions.with(R.anim.fade_in))
        .into(this)
}