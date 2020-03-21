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

    private val SYMBOL_P_RESET = "PPP"
    private val SYMBOL_V_RESET = "VV"
    private val SYMBOL_N_RESET = "NNN"
    private val SYMBOL_A_RESET = "AA"

    private var symbolP = SYMBOL_P_RESET
    private var symbolV = SYMBOL_V_RESET
    private var symbolN = SYMBOL_N_RESET
    private var symbolA = SYMBOL_A_RESET

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

    }

    override fun onClickP(i: Int) {
        pronoun.setImageResource(CardData.imagesP[i])
        symbolP = CardData.symbolsP[i]
    }

    override fun onClickV(i: Int) {
        verb.setImageResource(CardData.imagesV[i])
        symbolV = CardData.symbolsV[i]
    }

    override fun onClickN(i: Int) {
        noun.setImageResource(CardData.imagesN[i])
        symbolN = CardData.symbolsN[i]
    }

    override fun onClickA(i: Int) {
        adjective.setImageResource(CardData.imagesA[i])
        symbolA = CardData.symbolsA[i]
    }

    private fun checkWork(){
        if (symbolP[0] == symbolV[0] && symbolP[1] == symbolV[1]){
            if(symbolN[1] == symbolA[0] && (symbolN[2] == symbolA[1] || symbolA[1] == 'X')){
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
