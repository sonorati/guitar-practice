package com.seon.guitarpractice

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Type.*

object ChordTemplate {
    private val majorChordInterval = listOf(ROOT, THIRD, FIFTH)
    private val minorChordInterval = listOf(ROOT, MINOR_THIRD, FIFTH)
    private val dominantChordInterval = listOf(ROOT, THIRD, FIFTH, MINOR_SEVENTH)
    private val diminishedChordInterval = listOf(ROOT, MINOR_THIRD, MINOR_FIFTH)

    fun chordInterval(type: Type): List<Interval> = when (type) {
        Major -> majorChordInterval
        Minor -> minorChordInterval
        Dominant -> dominantChordInterval
        Diminished -> diminishedChordInterval
        Augmented -> TODO()
    }

}