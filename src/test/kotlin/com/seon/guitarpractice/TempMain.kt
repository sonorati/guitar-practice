package com.seon.guitarpractice

import com.seon.guitarpractice.scale.MajorScale
import com.seon.guitarpractice.scale.MinorScale

fun main() {
//    repeat((1..10).count()) {
//        println("${it + 1}. ${randomTask()}")
//    }

    val scale = MajorScale(Note.D)
    println("${scale.key} ${scale.type} scale")
    scale.chords().forEachIndexed { index, chord ->
        println("${index +1} ${chord.name()}")
    }
}

fun randomTask(): String {
    val triads = listOf("Major", "Major", "Minor").random()
    val scales = listOf("major", "major", "minor pentatonic").random()
    val notes = listOf("A", "B", "C", "D", "E", "F", "G").random()
    val seventh = listOf("7", "maj7", "m7", "m7b5").random()
    val triadsStrings = listOf("4", "3").random()
    val string = listOf("6", "5", "4", "3").random()
    val minorScaleChordProgressions = listOf(
            "i-VI-III-VII",
            "i-VI-VII-v(m7)",
            "i-VII-VI-v"
    ).random()
    val majorScaleChordProgressions = listOf(
            "I-vi-IV-V",
            "I-V-vi-iii-IV-iii-IV-V",
            "I-iii-vi-IV",
            "I-iii-I-iii (sad)",
            "I-V-iii-VI",
            "I-V-vi-IV (Melodic - cheesy)",
            "I maj7-iim7-iiim7-ii m7",
            "I-IV-vi-V",
            "IV-V-I").random()
    val scalePositions = listOf("1", "2", "3", "4", "5", "all").random()
    val exercises = listOf(
            "Major scale in $notes, position: $scalePositions",
//            "$scales scale in $notes, position: $scalePositions",
            "Find notes in the fretboard: $notes",
            "$triads triads from ${triadsStrings}th string,  Note: $notes",
//            "$triads arpeggios note: $notes, position: $scalePositions",
            "Intervals, name distance and note from $string string, Note $notes",
            "$majorScaleChordProgressions progression in $notes from $string string",
            "Chord construction: $notes$seventh from $string string",
            "Minor Plagal Cadence from $string string,  Note: $notes",
            "Plagal Cadence from $string string, Note: $notes",
            "Perfect Cadence from $string string, Note: $notes"
    )

    return exercises.random()
}


