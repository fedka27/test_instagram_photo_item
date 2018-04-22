package com.github.fedka27.instagramphotoitem.model

import android.support.annotation.DrawableRes
import java.io.Serializable

class Publication(
        @DrawableRes val imageResAvatar: Int,
        val name: String,
        val location: String?,
        val imageResList: List<Int>,
        val likes: Int,
        val comment: String?
) : Serializable