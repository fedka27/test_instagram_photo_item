package com.github.fedka27.instagramphotoitem

import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


fun ViewGroup.getLayoutView(@LayoutRes resLayout: Int): View {
    return LayoutInflater.from(this.context).inflate(resLayout, this, false)
}

fun Context.getLayoutView(parent: ViewGroup?, @LayoutRes resLayout: Int): View {
    return LayoutInflater.from(this).inflate(resLayout, parent, false)
}