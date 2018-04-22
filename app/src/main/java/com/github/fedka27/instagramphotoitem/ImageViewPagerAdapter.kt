package com.github.fedka27.instagramphotoitem

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_image.view.*

class ImageViewPagerAdapter(
        context: Context,
        val listResImage: List<Int>,
        val layoutInflater: LayoutInflater = LayoutInflater.from(context)
) : PagerAdapter() {


    override fun isViewFromObject(view: View?, `object`: Any?): Boolean = `object` is View

    override fun getCount(): Int = listResImage.size

    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        val view = layoutInflater.inflate(R.layout.item_image, container, false)

        view.image_view.setImageResource(listResImage[position])

        container?.addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        container?.removeView(`object` as View)
    }
}