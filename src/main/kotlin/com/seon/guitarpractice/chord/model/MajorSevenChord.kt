package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type

class MajorSevenChord(val root: Note) : Chord(root) {
    override val intervals = listOf(ROOT, THIRD, FIFTH, SEVENTH)
    override val type: Type = Type.MajorSeven
}