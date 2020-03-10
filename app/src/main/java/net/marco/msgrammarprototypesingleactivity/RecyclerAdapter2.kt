package net.marco.msgrammarprototypesingleactivity


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter2 : RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>() {

    private val images = intArrayOf(
        R.drawable.card_v_come,
        R.drawable.card_v_como,
        R.drawable.card_v_comes,
        R.drawable.card_v_comemos,
        R.drawable.card_v_comen,
        R.drawable.card_v_corto,
        R.drawable.card_v_cortas,
        R.drawable.card_v_corta,
        R.drawable.card_v_cortamos,
        R.drawable.card_v_cortan
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView

        init {
            itemImage = itemView.findViewById(R.id.imageV)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemImage.setImageResource(images[i])
    }


    override fun getItemCount(): Int {
        return images.size
    }

}