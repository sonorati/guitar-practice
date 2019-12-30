package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Major

data class LydianScale(val key: Note, val type: Type = Major) : Scale(key, type) {

    //TODO: FIXME CHORDS FROM MINOR SCALE!!
    override val scaleChords: List<Type> = listOf(Type.Minor, Type.Diminished, Type.Major, Type.Minor, Type.Minor, Type.Major, Type.Major)
    override val intervals: List<Int> = listOf(0, 2, 4, 6, 7, 9, 11)


}