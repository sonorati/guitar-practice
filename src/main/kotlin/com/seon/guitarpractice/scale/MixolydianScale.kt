package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Major

data class MixolydianScale(val key: Note,
                           val type: Type = Major,
                           val interval: List<Int> = listOf(0, 2, 4, 5, 7, 9, 10))
    : Scale(key, type, interval) {
    override fun scaleChords(): List<Type> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}