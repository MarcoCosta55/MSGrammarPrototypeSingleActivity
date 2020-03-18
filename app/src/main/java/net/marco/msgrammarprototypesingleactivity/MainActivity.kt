package net.marco.msgrammarprototypesingleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CardClick {

    private var layoutManager1: RecyclerView.LayoutManager? = null
    private var adapter1: RecyclerView.Adapter<RecyclerAdapter1.ViewHolder>? = null

    private var layoutManager2: RecyclerView.LayoutManager? = null
    private var adapter2: RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>? = null

    private var layoutManager3: RecyclerView.LayoutManager? = null
    private var adapter3: RecyclerView.Adapter<RecyclerAdapter3.ViewHolder>? = null

    private var layoutManager4: RecyclerView.LayoutManager? = null
    private var adapter4: RecyclerView.Adapter<RecyclerAdapter4.ViewHolder>? = null

    private lateinit var properNoun: ImageView
    private lateinit var verb: ImageView
    private lateinit var noun: ImageView
    private lateinit var adjective: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting up recyclerView1
        layoutManager1 = LinearLayoutManager(this)
        recyclerView1.layoutManager = layoutManager1
        adapter1 = RecyclerAdapter1(this, this)
        recyclerView1.adapter = adapter1

        // Setting up recyclerView2
        layoutManager2 = LinearLayoutManager(this)
        recyclerView2.layoutManager = layoutManager2
        adapter2 = RecyclerAdapter2(this, this)
        recyclerView2.adapter = adapter2

        // Setting up recyclerView3
        layoutManager3 = LinearLayoutManager(this)
        recyclerView3.layoutManager = layoutManager3
        adapter3 = RecyclerAdapter3(this, this)
        recyclerView3.adapter = adapter3

        // Setting up recyclerView4
        layoutManager4 = LinearLayoutManager(this)
        recyclerView4.layoutManager = layoutManager4
        adapter4 = RecyclerAdapter4(this, this)
        recyclerView4.adapter = adapter4

        properNoun = findViewById(R.id.imageViewSubject1)
        verb = findViewById(R.id.imageViewVerb)
        noun = findViewById(R.id.imageViewNoun)
        adjective = findViewById(R.id.imageViewAdjective)

    }

    override fun onClickPN(image: Int) {
        properNoun.setImageResource(image)
    }

    override fun onClickV(image: Int) {
        verb.setImageResource(image)
    }

    override fun onClickN(image: Int) {
        noun.setImageResource(image)
    }

    override fun onClickA(image: Int) {
        adjective.setImageResource(image)
    }
}
