package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class AugmentedChord(private val root: Note,
                          val type: Type = Augmented,
                          val intervals: List<Interval> = listOf(ROOT, THIRD, AUGMENTED_FIFTH))
    : Chord(root, type, intervals)
