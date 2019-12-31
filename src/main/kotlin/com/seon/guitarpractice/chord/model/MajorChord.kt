package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Major

data class MajorChord(val root: Note) : Chord(root) {
    override val intervals = listOf(ROOT, THIRD, FIFTH)
    override val type: Type = Major
}
