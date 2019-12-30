package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class MajorScale(val key: Note, val type: Type = Major) : Scale(key, type) {

    override val scaleChords: List<Type> = listOf(Major, Minor, Minor, Major, Major, Minor, Diminished)
    override val intervals: List<Int> = listOf(0, 2, 4, 5, 7, 9, 11)
}