package com.github.fedka27.instagramphotoitem

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import com.github.fedka27.instagramphotoitem.model.Publication
import kotlinx.android.synthetic.main.item_instagram_publication_photo.view.*

class PublicationsAdapter(private val context: Context) : RecyclerView.Adapter<PublicationsAdapter.PublicationViewHolder>() {
    val listPublications: MutableList<Publication> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PublicationViewHolder {
        return PublicationViewHolder(LayoutInflater.from(context).inflate(R.layout.item_instagram_publication_photo, parent, false))
    }

    override fun getItemCount(): Int = listPublications.size

    override fun onBindViewHolder(holder: PublicationViewHolder?, position: Int) {
        holder?.bind(listPublications[position])
    }

    fun setData(list: List<Publication>) {
        listPublications.clear()
        listPublications.addAll(list)
        notifyDataSetChanged()
    }

    fun addPublication(publication: Publication) {
        listPublications.add(publication)
        notifyItemInserted(listPublications.size)
    }

    class PublicationViewHolder(view: View)
        : RecyclerView.ViewHolder(view) {

        private val context = itemView.context

        fun bind(publication: Publication) {

            itemView.name_text_view.text = publication.name
            itemView.location_text_view.let {
                if (publication.location == null) it.visibility = GONE
                else it.text = publication.location
            }

            itemView.photos_view_pager.adapter = ImageViewPagerAdapter(context, publication.imageResList)
            itemView.view_pager_indicators.setViewPager(itemView.photos_view_pager)

            itemView.likes_text_view.text = context.getString(R.string.publication_likes_, publication.likes)
            itemView.comment_text_view.text = publication.comment
        }
    }


}
