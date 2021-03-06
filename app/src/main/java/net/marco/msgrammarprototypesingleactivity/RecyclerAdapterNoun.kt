/**
 * Copyright 2020 Marco Costa.
 */
package net.marco.msgrammarprototypesingleactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterNoun(listener: CardClick) : RecyclerView.Adapter<RecyclerAdapterNoun.ViewHolder>() {

    private var cClick = listener

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView = itemView.findViewById(R.id.imageN)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout_noun, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val cardData = CardData()
        viewHolder.itemImage.setImageResource(cardData.imagesN[i])
        val imageItem = viewHolder.itemImage
        imageItem.setOnClickListener {
            cClick.onClickNoun(i)
        }
    }


    override fun getItemCount(): Int {
        val cardData = CardData()
        return cardData.imagesN.size
    }

}