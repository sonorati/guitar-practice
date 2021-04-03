package com.seon.guitarpractice

import com.seon.guitarpractice.Note.AFlat
import com.seon.guitarpractice.scale.MajorScale


// reference: https://feelyoursound.com/scale-chords/c-locrian/
fun main() {

    val scale = MajorScale(AFlat)
    println(scale.scaleChords())


//    val progressions = minorScaleChordProgressions.random()
//
//    println(progressions.toString())
//    println(getIntervals(randomNote(), progressions))
}
