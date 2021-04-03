package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.Augmented

data class AugmentedChord(val root: Note) : Chord(root) {
    override val intervals = listOf(ROOT, THIRD, AUGMENTED_FIFTH)
    override val type: ChordType = Augmented
}
