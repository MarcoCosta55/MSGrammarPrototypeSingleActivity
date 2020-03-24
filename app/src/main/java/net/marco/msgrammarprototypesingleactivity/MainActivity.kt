/**
 * Copyright 2020 Marco Costa
 */

package net.marco.msgrammarprototypesingleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

/**
 * This class handles the views for the 2e board (Pronouns and Adjectives)
 */
class MainActivity : AppCompatActivity(), CardClick {

    private var layoutManagerPronoun: RecyclerView.LayoutManager? = null
    private var adapterPronoun: RecyclerView.Adapter<RecyclerAdapterPronoun.ViewHolder>? = null

    private var layoutManagerVerb: RecyclerView.LayoutManager? = null
    private var adapterVerb: RecyclerView.Adapter<RecyclerAdapterVerb.ViewHolder>? = null

    private var layoutManagerNoun: RecyclerView.LayoutManager? = null
    private var adapterNoun: RecyclerView.Adapter<RecyclerAdapterNoun.ViewHolder>? = null

    private var layoutManagerAdjective: RecyclerView.LayoutManager? = null
    private var adapterAdjective: RecyclerView.Adapter<RecyclerAdapterAdjective.ViewHolder>? = null

    private lateinit var pronoun: ImageView
    private lateinit var verb: ImageView
    private lateinit var noun: ImageView
    private lateinit var adjective: ImageView

    private var checkWork = CardChecker(this)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecyclerViews()

        pronoun = findViewById(R.id.imageViewPronoun)
        verb = findViewById(R.id.imageViewVerb)
        noun = findViewById(R.id.imageViewNoun)
        adjective = findViewById(R.id.imageViewAdjective)

        setCardResetListeners()

        checkWorkButton.setOnClickListener {
            checkWork.checkSentence()
        }

        readButton.setOnClickListener{
            checkWork.playSentence()
        }
    }

    private fun setRecyclerViews(){

        // Setting up recyclerViewPronoun
        layoutManagerPronoun = LinearLayoutManager(this)
        recyclerViewPronoun.layoutManager = layoutManagerPronoun
        adapterPronoun = RecyclerAdapterPronoun(this)
        recyclerViewPronoun.adapter = adapterPronoun

        // Setting up recyclerViewVerb
        layoutManagerVerb = LinearLayoutManager(this)
        recyclerViewVerb.layoutManager = layoutManagerVerb
        adapterVerb = RecyclerAdapterVerb(this)
        recyclerViewVerb.adapter = adapterVerb

        // Setting up recyclerViewNoun
        layoutManagerNoun = LinearLayoutManager(this)
        recyclerViewNoun.layoutManager = layoutManagerNoun
        adapterNoun = RecyclerAdapterNoun(this)
        recyclerViewNoun.adapter = adapterNoun

        // Setting up recyclerViewAdjective
        layoutManagerAdjective = LinearLayoutManager(this)
        recyclerViewAdjective.layoutManager = layoutManagerAdjective
        adapterAdjective = RecyclerAdapterAdjective(this)
        recyclerViewAdjective.adapter = adapterAdjective
    }

    private fun setCardResetListeners(){

        imageViewPronoun.setOnClickListener{
            pronoun.setImageResource(R.drawable.outline_pronoun)
            checkWork.resetPronoun()
        }

        imageViewVerb.setOnClickListener{
            verb.setImageResource(R.drawable.outline_verb)
            checkWork.resetVerb()
        }

        imageViewNoun.setOnClickListener{
            noun.setImageResource(R.drawable.outline_noun)
            checkWork.resetNoun()
        }

        imageViewAdjective.setOnClickListener{
            adjective.setImageResource(R.drawable.outline_adjective)
            checkWork.resetAdjective()
        }
    }

    /**
     * these four functions override the CardClick interface
     */
    override fun onClickPronoun(i: Int) {
        val cardData = CardData()
        pronoun.setImageResource(cardData.imagesP[i])
        checkWork.setPronoun(i)
    }

    override fun onClickVerb(i: Int) {
        val cardData = CardData()
        verb.setImageResource(cardData.imagesV[i])
        checkWork.setVerb(i)
    }

    override fun onClickNoun(i: Int) {
        val cardData = CardData()
        noun.setImageResource(cardData.imagesN[i])
        checkWork.setNoun(i)
    }

    override fun onClickAdjective(i: Int) {
        val cardData = CardData()
        adjective.setImageResource(cardData.imagesA[i])
        checkWork.setAdjective(i)
    }
}
