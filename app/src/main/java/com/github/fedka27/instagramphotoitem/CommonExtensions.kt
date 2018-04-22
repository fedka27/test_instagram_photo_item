package com.github.fedka27.instagramphotoitem

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


fun ViewGroup.getLayoutView(@LayoutRes resLayout: Int): View {
    return LayoutInflater.from(this.context).inflate(resLayout, this, false)
}