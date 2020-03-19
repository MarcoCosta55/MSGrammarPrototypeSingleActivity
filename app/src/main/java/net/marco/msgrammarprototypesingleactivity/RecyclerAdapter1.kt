package net.marco.msgrammarprototypesingleactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter1(context: Context, listener: CardClick) : RecyclerView.Adapter<RecyclerAdapter1.ViewHolder>() {

    private val context = context // may not need
    private var cClick = listener

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView = itemView.findViewById(R.id.imageP)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {

        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        viewHolder.itemImage.setImageResource(CardData.imagesP[i])
        val imageItem = viewHolder.itemImage
        imageItem.setOnClickListener {
            cClick.onClickP(i)
        }
    }

    override fun getItemCount(): Int {
        return CardData.imagesP.size
    }



}
