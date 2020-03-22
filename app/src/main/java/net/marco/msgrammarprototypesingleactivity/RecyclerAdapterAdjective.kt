package net.marco.msgrammarprototypesingleactivity


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterAdjective(listener: CardClick) : RecyclerView.Adapter<RecyclerAdapterAdjective.ViewHolder>() {

    private var cClick = listener
    private var cardData = CardData()


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView = itemView.findViewById(R.id.imageA)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout_adjective, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemImage.setImageResource(cardData.imagesA[i])
        val imageItem = viewHolder.itemImage
        imageItem.setOnClickListener {
            cClick.onClickAdjective(i)
        }
    }


    override fun getItemCount(): Int {
        return cardData.imagesA.size
    }

}