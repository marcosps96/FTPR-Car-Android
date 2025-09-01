package com.example.myapitest.ui

import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.example.myapitest.R

fun ImageView.loadUrl(imageUrl: String) {
    Picasso.get()
        .load(imageUrl)
        .placeholder(R.drawable.ic_downloading)
        .error(R.drawable.ic_error)
        .transform(CircleTransform())
        .into(this)
}