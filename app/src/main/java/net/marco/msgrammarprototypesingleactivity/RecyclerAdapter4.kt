package net.marco.msgrammarprototypesingleactivity


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter4(context: Context) : RecyclerView.Adapter<RecyclerAdapter4.ViewHolder>() {

    private val context = context

    private val images = intArrayOf(
        R.drawable.card_a_fria,
        R.drawable.card_a_frias,
        R.drawable.card_a_frio,
        R.drawable.card_a_frios,
        R.drawable.card_a_grande,
        R.drawable.card_a_grandes,
        R.drawable.card_a_limpia,
        R.drawable.card_a_limpias,
        R.drawable.card_a_limpio,
        R.drawable.card_a_limpios,
        R.drawable.card_a_pequena,
        R.drawable.card_a_pequenas,
        R.drawable.card_a_pequeno,
        R.drawable.card_a_pequenos,
        R.drawable.card_a_roja,
        R.drawable.card_a_rojas,
        R.drawable.card_a_rojo,
        R.drawable.card_a_rojos,
        R.drawable.card_a_sucia,
        R.drawable.card_a_sucias,
        R.drawable.card_a_sucio,
        R.drawable.card_a_sucios,
        R.drawable.card_a_verde,
        R.drawable.card_a_verdes
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView

        init {
            itemImage = itemView.findViewById(R.id.imageA)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout4, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemImage.setImageResource(images[i])
    }


    override fun getItemCount(): Int {
        return images.size
    }

}