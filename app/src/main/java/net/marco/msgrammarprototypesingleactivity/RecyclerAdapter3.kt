package net.marco.msgrammarprototypesingleactivity


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter3 : RecyclerView.Adapter<RecyclerAdapter3.ViewHolder>() {

    private val images = intArrayOf(
        R.drawable.card_n_durazno,
        R.drawable.card_n_ensalada,
        R.drawable.card_n_fresas,
        R.drawable.card_n_mango,
        R.drawable.card_n_manzana,
        R.drawable.card_n_naranja,
        R.drawable.card_n_pan,
        R.drawable.card_n_pera,
        R.drawable.card_n_pollo,
        R.drawable.card_n_uvas
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView

        init {
            itemImage = itemView.findViewById(R.id.imageN)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout3, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemImage.setImageResource(images[i])
    }


    override fun getItemCount(): Int {
        return images.size
    }

}