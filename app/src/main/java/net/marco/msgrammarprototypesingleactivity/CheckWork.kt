package net.marco.msgrammarprototypesingleactivity

import android.content.Context
import android.media.MediaPlayer
import android.widget.Toast

class CheckWork {

    val SYMBOL_PRONOUN_RESET = "PPP"
    val SYMBOL_VERB_RESET = "VV"
    val SYMBOL_NOUN_RESET = "NNN"
    val SYMBOL_ADJECTIVE_RESET = "AA"

    var symbolPronoun = SYMBOL_PRONOUN_RESET
    var symbolVerb = SYMBOL_VERB_RESET
    var symbolNoun = SYMBOL_NOUN_RESET
    var symbolAdjective = SYMBOL_ADJECTIVE_RESET

    private lateinit var mediaPlayer: MediaPlayer


    fun checkVerb(context: Context) {


        if (symbolPronoun[0] == symbolVerb[0] && symbolPronoun[1] == symbolVerb[1]) {
            if (symbolNoun[1] == symbolAdjective[0] && (symbolNoun[2] == symbolAdjective[1] || symbolAdjective[1] == 'X')) {
                mediaPlayer = MediaPlayer.create(context, R.raw.correct)
                mediaPlayer.start()
                Toast.makeText(context, "YOUR WHOLE SENTENCE IS CORRECT!!!", Toast.LENGTH_LONG)
                    .show()
            } else {
                mediaPlayer = MediaPlayer.create(context, R.raw.error_a2)
                mediaPlayer.start()
                Toast.makeText(context, "Check your Adjective", Toast.LENGTH_LONG).show()
            }
        } else {
            mediaPlayer = MediaPlayer.create(context, R.raw.error_2)
            mediaPlayer.start()
            Toast.makeText(context, "Check your verb", Toast.LENGTH_LONG).show()
        }
    }

}