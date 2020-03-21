package net.marco.msgrammarprototypesingleactivity

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

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

    private val SYMBOL_PRONOUN_RESET = "PPP"
    private val SYMBOL_VERB_RESET = "VV"
    private val SYMBOL_NOUN_RESET = "NNN"
    private val SYMBOL_ADJECTIVE_RESET = "AA"

    private var symbolPronoun = SYMBOL_PRONOUN_RESET
    private var symbolVerb = SYMBOL_VERB_RESET
    private var symbolNoun = SYMBOL_NOUN_RESET
    private var symbolAdjective = SYMBOL_ADJECTIVE_RESET

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        pronoun = findViewById(R.id.imageViewPronoun)
        verb = findViewById(R.id.imageViewVerb)
        noun = findViewById(R.id.imageViewNoun)
        adjective = findViewById(R.id.imageViewAdjective)

        checkWorkButton.setOnClickListener {
            checkWork()
        }

        imageViewPronoun.setOnClickListener{
            pronoun.setImageResource(R.drawable.outline_pronoun)
            symbolPronoun = SYMBOL_PRONOUN_RESET
        }

        imageViewVerb.setOnClickListener{
            verb.setImageResource(R.drawable.outline_verb1)
            symbolVerb = SYMBOL_VERB_RESET
        }

        imageViewNoun.setOnClickListener{
            noun.setImageResource(R.drawable.outline_noun1)
            symbolNoun = SYMBOL_NOUN_RESET
        }

        imageViewAdjective.setOnClickListener{
            adjective.setImageResource(R.drawable.outline_adjective1)
            symbolAdjective = SYMBOL_ADJECTIVE_RESET
        }

    }

    override fun onClickP(i: Int) {
        pronoun.setImageResource(CardData.imagesP[i])
        symbolPronoun = CardData.symbolsP[i]
    }

    override fun onClickV(i: Int) {
        verb.setImageResource(CardData.imagesV[i])
        symbolVerb = CardData.symbolsV[i]
    }

    override fun onClickN(i: Int) {
        noun.setImageResource(CardData.imagesN[i])
        symbolNoun = CardData.symbolsN[i]
    }

    override fun onClickA(i: Int) {
        adjective.setImageResource(CardData.imagesA[i])
        symbolAdjective = CardData.symbolsA[i]
    }

    private fun checkWork(){
        if (symbolPronoun[0] == symbolVerb[0] && symbolPronoun[1] == symbolVerb[1]){
            if(symbolNoun[1] == symbolAdjective[0] && (symbolNoun[2] == symbolAdjective[1] || symbolAdjective[1] == 'X')){
                mediaPlayer = MediaPlayer.create(this, R.raw.correct)
                mediaPlayer.start()
                Toast.makeText(this, "YOUR WHOLE SENTENCE IS CORRECT!!!", Toast.LENGTH_LONG).show()
            }else{
                mediaPlayer = MediaPlayer.create(this, R.raw.error_a2)
                mediaPlayer.start()
                Toast.makeText(this, "Check your Adjective", Toast.LENGTH_LONG).show()
            }
        }else{
            mediaPlayer = MediaPlayer.create(this, R.raw.error_2)
            mediaPlayer.start()
            Toast.makeText(this, "Check your verb", Toast.LENGTH_LONG).show()
        }
    }
}
