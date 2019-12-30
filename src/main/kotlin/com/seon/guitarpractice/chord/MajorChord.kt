package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.ROOT
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Major

data class MajorChord(val root: Note) : Chord(root) {
    override val intervals = listOf(ROOT, Interval.THIRD, Interval.FIFTH)
    override val type: Type = Major
}
