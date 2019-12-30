package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Minor

data class MinorChord(private val root: Note,
                      val type: Type = Minor,
                      val intervals: List<Interval> = listOf(ROOT, MINOR_THIRD, FIFTH))
    : Chord(root, type, intervals)
