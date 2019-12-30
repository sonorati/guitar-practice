package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Dominant

data class DominantChord(private val root: Note,
                         val type: Type = Dominant,
                         val intervals: List<Interval> = listOf(ROOT, THIRD, FIFTH, MINOR_SEVENTH))
    : Chord(root, type, intervals)
