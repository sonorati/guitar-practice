package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.Minor

data class MinorChord(val root: Note) : Chord(root) {
    override val type: ChordType = Minor
    override val intervals: List<Interval> = listOf(ROOT, MINOR_THIRD, FIFTH)
}
