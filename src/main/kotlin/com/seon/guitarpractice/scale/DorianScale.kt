package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class DorianScale(val key: Note,
                       val type: Type = Minor,
                       val interval: List<Int> = listOf(0, 2, 3, 5, 7, 9, 10))
    : Scale(key, type, interval) {

    override fun scaleChords(): List<Type> =
            listOf(Minor, Minor, Major, Major, Minor, Diminished, Major)
}