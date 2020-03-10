package net.marco.msgrammarprototypesingleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var recyclerViewPN: RecyclerView
    private lateinit var layoutManagerPN: LinearLayoutManager
    private lateinit var adapter : RecyclerPNAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManagerPN = LinearLayoutManager(this)
        recycler_pn.layoutManager = layoutManagerPN

        adapter = RecyclerPNAdapter()
        recycler_pn.adapter = adapter


    }
}
