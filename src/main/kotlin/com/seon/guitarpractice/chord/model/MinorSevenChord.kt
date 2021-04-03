package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.MinorSeven

data class MinorSevenChord(val root: Note) : Chord(root) {
    override val type: ChordType = MinorSeven
    override val intervals: List<Interval> = listOf(ROOT, MINOR_THIRD, FIFTH, FLAT_SEVENTH)
}
