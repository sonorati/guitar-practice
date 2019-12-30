package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class PhrygianScale(val key: Note, val type: Type = Minor) : Scale(key, type) {

    //TODO: FIXME CHORDS FROM MINOR SCALE!!
    override val scaleChords: List<Type> = listOf(Minor, Diminished, Major, Minor, Minor, Major, Major)
    override val intervals: List<Int> = listOf(0, 1, 3, 5, 7, 8, 10)

}