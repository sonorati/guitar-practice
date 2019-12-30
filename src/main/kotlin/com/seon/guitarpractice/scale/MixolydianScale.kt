package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class MixolydianScale(val key: Note, val type: Type = Major) : Scale(key, type) {

    //TODO: FIXME CHORDS FROM MINOR SCALE!!
    override val scaleChords: List<Type> = listOf(Minor, Diminished, Major, Minor, Minor, Major, Major)
    override val intervals: List<Int> = listOf(0, 2, 4, 5, 7, 9, 10)

}