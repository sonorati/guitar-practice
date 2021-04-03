package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.*

data class DominantChord(val root: Note) : Chord(root) {
    override val type: ChordType = Dominant
    override val intervals: List<Interval> = listOf(ROOT, THIRD, FIFTH, FLAT_SEVENTH)
}
