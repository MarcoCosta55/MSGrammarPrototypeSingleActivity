package net.marco.msgrammarprototypesingleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    private var layoutManager2: RecyclerView.LayoutManager? = null
    private var adapter2: RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>? = null

    private var layoutManager3: RecyclerView.LayoutManager? = null
    private var adapter3: RecyclerView.Adapter<RecyclerAdapter3.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting up recyclerView1
        layoutManager = LinearLayoutManager(this)
        recyclerView1.layoutManager = layoutManager
        adapter = RecyclerAdapter()
        recyclerView1.adapter = adapter

        // Setting up recyclerView2
        layoutManager2 = LinearLayoutManager(this)
        recyclerView2.layoutManager = layoutManager2
        adapter2 = RecyclerAdapter2()
        recyclerView2.adapter = adapter2

        // Setting up recyclerView3
        layoutManager3 = LinearLayoutManager(this)
        recyclerView3.layoutManager = layoutManager3
        adapter3 = RecyclerAdapter3()
        recyclerView3.adapter = adapter3



    }
}
