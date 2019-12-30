package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Major

data class MajorScale(val key: Note,
                      val type: Type = Major,
                      val interval: List<Int> = listOf(0, 2, 4, 5, 7, 9, 11))
    : Scale(key, type, interval) {

    override fun scaleChords(): List<Type> =
        listOf(Major, Type.Minor, Type.Minor, Major, Major, Type.Minor, Type.Diminished)
}