package net.marco.msgrammarprototypesingleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var imagesPN = arrayOf<Int>(
        R.drawable.card_pn_luis,
        R.drawable.card_pn_tomas,
        R.drawable.card_pn_monica,
        R.drawable.card_pn_luis_monica,
        R.drawable.card_pn_monica_rosa,
        R.drawable.card_pn_tomas_luis
    )

    lateinit var recyclerViewPN: RecyclerView
    lateinit var layoutManagerPN: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewPN = findViewById<RecyclerView>(R.id.recycler_pn)
        layoutManagerPN = LinearLayoutManager(this)
        recyclerViewPN.setHasFixedSize(true)
        recyclerViewPN.layoutManager = layoutManagerPN

    }
}
