package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Augmented

data class AugmentedChord(val root: Note) : Chord(root) {
    override val intervals = listOf(ROOT, THIRD, AUGMENTED_FIFTH)
    override val type: Type = Augmented
}
