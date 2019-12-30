package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Minor

data class LocrianScale(val key: Note, val type: Type = Minor) : Scale(key, type) {

    //TODO: FIXME CHORDS FROM MINOR SCALE!!
    override val scaleChords: List<Type> = listOf(Minor, Type.Diminished, Type.Major, Minor, Minor, Type.Major, Type.Major)
    override val intervals: List<Int> = listOf(0,1, 3, 5, 6, 8, 10)


}