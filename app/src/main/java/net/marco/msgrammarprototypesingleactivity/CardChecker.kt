/**
 * Copyright 2020 Marco Costa
 */
package net.marco.msgrammarprototypesingleactivity

import android.content.Context
import android.media.MediaPlayer
import android.widget.Toast

class CardChecker(private val context: Context) {

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
    private val errorAudioVerb2 = R.raw.error_v2
    private val errorAudioVerb3 = R.raw.error_v3
    private val errorAudioAdjective2 = R.raw.error_a2
    private val errorAudioAdjective3 = R.raw.error_a3

    private val correctMessage = "Your sentence is correct!"
    private val errorMessage = "Check your sentence"

    private var sentenceAudio = intArrayOf(0,0,0,0)

    var isSentenceCorrect = false

    private var errorCount = 0

    private fun checkVerb(): Boolean {
        return symbolPronoun[0] == symbolVerb[0] && symbolPronoun[1] == symbolVerb[1]
    }

    private fun checkAdjective(): Boolean{
        return symbolNoun[1] == symbolAdjective[0] && (symbolNoun[2] == symbolAdjective[1] || symbolAdjective[1] == 'X')
    }

    fun checkSentence() {
        val isVerbCorrect = checkVerb()
        val isAdjectiveCorrect = checkAdjective()

        if(isVerbCorrect && isAdjectiveCorrect){
            isSentenceCorrect = true
            errorCount = 0
            playMessage(correctAudio, correctMessage)
        }

        if(!isVerbCorrect && !isAdjectiveCorrect){
            isSentenceCorrect = false
            errorCount++
            when(errorCount){
                1 -> playMessage(errorAudio1, errorMessage)
                2 -> playMessage(errorAudio2, errorMessage)
                else -> playMessage(errorAudio3, errorMessage)
            }
        }

        if(!isVerbCorrect && isAdjectiveCorrect){
            isSentenceCorrect = false
            errorCount++
            when(errorCount){
                1 -> playMessage(errorAudio1, errorMessage)
                2 -> playMessage(errorAudioVerb2, errorMessage)
                else -> playMessage(errorAudioVerb3, errorMessage)
            }
        }

        if(isVerbCorrect && !isAdjectiveCorrect){
            isSentenceCorrect = false
            errorCount++
            when(errorCount){
                1 -> playMessage(errorAudio1, errorMessage)
                2 -> playMessage(errorAudioAdjective2, errorMessage)
                else -> playMessage(errorAudioAdjective3, errorMessage)
            }
        }
    }

    fun playSentence(){
        if(isSentenceCorrect){
            var mp1 = MediaPlayer.create(context, sentenceAudio[0])
            var mp2 = MediaPlayer.create(context, sentenceAudio[1])
            var mp3 = MediaPlayer.create(context, sentenceAudio[2])
            var mp4 = MediaPlayer.create(context, sentenceAudio[3])
            mp1.start()
            mp1.setOnCompletionListener{
                mp2.start()
                mp2.setOnCompletionListener {
                    mp3.start()
                    mp3.setOnCompletionListener {
                        mp4.start()
                    }
                }
            }
        }else{
            Toast.makeText(context, "Check your work first please.", Toast.LENGTH_LONG).show()
        }
    }

    private fun playMessage(audio: Int, message: String){
        val mediaPlayer = MediaPlayer.create(context, audio)
        mediaPlayer.start()
        mediaPlayer.setOnCompletionListener{

        }
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    /**
     * All the functions below are just simple setters and getters
     */
    fun resetPronoun() {
        symbolPronoun = SYMBOL_PRONOUN_RESET
        isSentenceCorrect = false
    }

    fun resetVerb(){
        symbolVerb = SYMBOL_VERB_RESET
        isSentenceCorrect = false
    }

    fun resetNoun(){
        symbolNoun = SYMBOL_NOUN_RESET
        isSentenceCorrect = false
    }

    fun resetAdjective(){
        symbolAdjective = SYMBOL_ADJECTIVE_RESET
        isSentenceCorrect = false
    }

    fun setPronoun(i: Int){
        val cardData = CardData()
        symbolPronoun = cardData.symbolsP[i]
        sentenceAudio[0] = cardData.vocalsP[i]
        isSentenceCorrect = false
    }

    fun setVerb(i: Int){
        val cardData = CardData()
        symbolVerb = cardData.symbolsV[i]
        sentenceAudio[1] = cardData.vocalsV[i]
        isSentenceCorrect = false
    }

    fun setNoun(i: Int){
        val cardData = CardData()
        symbolNoun = cardData.symbolsN[i]
        sentenceAudio[2] = cardData.vocalsN[i]
        isSentenceCorrect = false
    }

    fun setAdjective(i: Int){
        val cardData = CardData()
        symbolAdjective = cardData.symbolsA[i]
        sentenceAudio[3] = cardData.vocalsA[i]
        isSentenceCorrect = false
    }
}