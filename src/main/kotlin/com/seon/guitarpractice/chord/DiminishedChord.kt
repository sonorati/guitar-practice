package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Diminished

data class DiminishedChord(private val root: Note,
                           val type: Type = Diminished,
                           val intervals: List<Interval> = listOf(ROOT, MINOR_THIRD, MINOR_FIFTH))
    : Chord(root, type, intervals)
