package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Minor

data class MinorChord(val root: Note) : Chord(root) {
    override val type: Type = Minor
    override val intervals: List<Interval> = listOf(ROOT, MINOR_THIRD, FIFTH)
}
