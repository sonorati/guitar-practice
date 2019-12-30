package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Major

data class LydianScale(val key: Note,
                       val type: Type = Major,
                       val interval: List<Int> = listOf(0, 2, 4, 6, 7, 9, 11))
    : Scale(key, type, interval)