package com.seon.guitarpractice

import com.seon.guitarpractice.Note.A
import com.seon.guitarpractice.Note.AFlat
import com.seon.guitarpractice.scale.HarmonicMinorScale
import com.seon.guitarpractice.scale.MajorScale
import com.seon.guitarpractice.scale.MinorScale


// reference: https://feelyoursound.com/scale-chords/c-locrian/
fun main() {

    val scale = MajorScale(AFlat)
    println("--------Major-------------")
    println(scale.scaleChords())
    println("relative minor: ${scale.relativeMinor().name()}")
    println("dominant: ${scale.dominant().name()}")
    println("--------Minor-------------")
    println(MinorScale(Note.E).scaleChords())
    println("-------Minor---------------")
    println(MinorScale(Note.D).scaleChords())
    println("--------Harmonic Minor---------------")
    println(HarmonicMinorScale(Note.E).scaleChords())

//    val progressions = minorScaleChordProgressions.random()
//
//    println(progressions.toString())
//    println(getIntervals(randomNote(), progressions))
}
