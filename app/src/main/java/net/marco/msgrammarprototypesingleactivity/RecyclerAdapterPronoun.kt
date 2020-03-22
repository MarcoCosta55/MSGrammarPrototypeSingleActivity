package net.marco.msgrammarprototypesingleactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterPronoun(listener: CardClick) : RecyclerView.Adapter<RecyclerAdapterPronoun.ViewHolder>() {

    private var cClick = listener

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView = itemView.findViewById(R.id.imageP)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {

        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout_pronoun, viewGroup, false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val cardData = CardData()

        viewHolder.itemImage.setImageResource(cardData.imagesP[i])
        val imageItem = viewHolder.itemImage
        imageItem.setOnClickListener {
            cClick.onClickPronoun(i)
        }
    }

    override fun getItemCount(): Int {
        val cardData = CardData()
        return cardData.imagesP.size
    }



}
