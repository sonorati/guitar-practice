package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class DominantChord(val root: Note) : Chord(root) {
    override val type: Type = Dominant
    override val intervals: List<Interval> = listOf(ROOT, THIRD, FIFTH, FLAT_SEVENTH)
}
