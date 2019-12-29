package com.seon.guitarpractice

import com.seon.guitarpractice.Interval.*

object ChordTemplate {
    private val majorChordInterval = listOf(ROOT, THIRD, FIFTH)
    private val minorChordInterval = listOf(ROOT, MINOR_THIRD, FIFTH)
    private val diminishedChordInterval = listOf(ROOT, MINOR_THIRD, MINOR_FIFTH)

    fun chordInterval(type: Type): List<Interval> = when (type) {
        Type.Major -> majorChordInterval
        Type.Minor -> minorChordInterval
        Type.Augmented -> TODO()
        Type.Diminished -> diminishedChordInterval
    }

}