package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Dominant

data class DominantChord(val root: Note) : Chord(root) {
    override val type: Type = Dominant
    override val intervals: List<Interval> = listOf(ROOT, THIRD, FIFTH, MINOR_SEVENTH)
}
