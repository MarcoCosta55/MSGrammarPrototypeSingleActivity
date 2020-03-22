package net.marco.msgrammarprototypesingleactivity

import android.content.Context
import android.media.MediaPlayer
import android.widget.Toast

class CheckWork(context: Context) {

    private val context = context

    private val SYMBOL_PRONOUN_RESET = "PPP"
    private val SYMBOL_VERB_RESET = "VV"
    private val SYMBOL_NOUN_RESET = "NNN"
    private val SYMBOL_ADJECTIVE_RESET = "AA"

    private var symbolPronoun = SYMBOL_PRONOUN_RESET
    private var symbolVerb = SYMBOL_VERB_RESET
    private var symbolNoun = SYMBOL_NOUN_RESET
    private var symbolAdjective = SYMBOL_ADJECTIVE_RESET

    private val correctAudio = R.raw.correct
    private val errorAudio1 = R.raw.error_1
    private val errorAudio2 = R.raw.error_2
    private val errorAudio3 = R.raw.error_3
    private val errorAudioVerb2 = R.raw.error_a2
    private val errorAudioVerb3 = R.raw.error_a3
    private val errorAudioAdjective2 = R.raw.error_a2
    private val errorAudioAdjective3 = R.raw.error_a3

    private val correctMessage = "Your sentence is correct!"
    private val errorMessage = "Check your sentence"

    private var errorCount = 0

    private fun checkVerb(): Boolean {
        return symbolPronoun[0] == symbolVerb[0] && symbolPronoun[1] == symbolVerb[1]
    }

    private fun checkAdjective(): Boolean{
        return symbolNoun[1] == symbolAdjective[0] && symbolNoun[2] == symbolAdjective[1]
    }

    fun checkSentence(context: Context) {
        val isVerbCorrect = checkVerb()
        val isAdjectiveCorrect = checkAdjective()

        if(isVerbCorrect && isAdjectiveCorrect){
            errorCount = 0
            playMessage(R.raw.correct, correctMessage)
        }
    }

    /**
     * All the functions below are just simple setters and getters
     */
    fun resetPronoun() {
        symbolPronoun = SYMBOL_PRONOUN_RESET
    }

    fun resetVerb(){
        symbolVerb = SYMBOL_VERB_RESET
    }

    fun resetNoun(){
        symbolNoun = SYMBOL_NOUN_RESET
    }

    fun resetAdjective(){
        symbolAdjective = SYMBOL_ADJECTIVE_RESET
    }

    fun setPronoun(i: Int){
        symbolPronoun = CardData.symbolsP[i]
    }

    fun setVerb(i: Int){
        symbolVerb = CardData.symbolsV[i]
    }

    fun setNoun(i: Int){
        symbolNoun = CardData.symbolsN[i]
    }

    fun setAdjective(i: Int){
        symbolAdjective = CardData.symbolsA[i]
    }


    private fun playMessage(audio: Int, message: String){
        val mediaPlayer = MediaPlayer.create(context, audio)
        mediaPlayer.start()
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}

/**
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
 **/