package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Minor

data class PhrygianScale(val key: Note,
                         val type: Type = Minor,
                         val interval: List<Int> = listOf(0, 1, 3, 5, 7, 8, 10))
    : Scale(key, type, interval) {
    override fun scaleChords(): List<Type> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}