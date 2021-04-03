package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.Major

data class MajorChord(val root: Note) : Chord(root) {
    override val intervals = listOf(ROOT, THIRD, FIFTH)
    override val type: ChordType = Major
}
