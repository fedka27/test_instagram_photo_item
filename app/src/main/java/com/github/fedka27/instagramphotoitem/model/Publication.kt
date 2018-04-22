package com.github.fedka27.instagramphotoitem.model

import java.io.Serializable

class Publication(
        val name: String,
        val location: String?,
        val imageResList: List<Int>,
        val likes: Int,
        val comment: String?
) : Serializable {

}