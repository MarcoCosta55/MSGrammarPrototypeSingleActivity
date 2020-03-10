package net.marco.msgrammarprototypesingleactivity

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class RecyclerPNAdapter : RecyclerView.Adapter<RecyclerPNAdapter.ViewHolder>() {

    private val imagesPN = arrayOf<Int>(
        R.drawable.card_pn_luis,
        R.drawable.card_pn_tomas,
        R.drawable.card_pn_monica,
        R.drawable.card_pn_luis_monica,
        R.drawable.card_pn_monica_rosa,
        R.drawable.card_pn_tomas_luis
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView

        init {
            itemImage = itemView.findViewById(R.id.card_pn_layout)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_pn_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return imagesPN.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemImage.setImageResource(imagesPN[i])
    }
}
