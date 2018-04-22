package com.github.fedka27.instagramphotoitem

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.github.fedka27.instagramphotoitem.model.Publication
import kotlinx.android.synthetic.main.activity_main.*

class
MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = PublicationsAdapter(this)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapter

        adapter.addPublication(getPublication1())
        adapter.addPublication(getPublication2())
    }

    private fun getPublication1(): Publication {
        return Publication(
                "Fedya",
                null,
                arrayListOf(R.drawable.image1, R.drawable.image2),
                3,
                "Wow")
    }

    private fun getPublication2(): Publication {
        return Publication(
                "Fedya 2",
                "Russia, Kaliningrad",
                arrayListOf(R.drawable.image3, R.drawable.image2, R.drawable.image1),
                13,
                "Wow!!!")
    }
}
