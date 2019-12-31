package com.seon.guitarpractice

fun main() {
    repeat((1..10).count()) {
        println("${it + 1}. ${randomTask()}")
    }
}

fun randomTask(): String {
    val triads = listOf("major", "major", "minor", "diminished", "augmented").random()
    val scales = listOf("major", "major", "minor pentatonic").random()
    val notes = listOf("A", "B", "C", "D", "E", "F", "G").random()
    val scalePositions = listOf("1", "2", "3", "4", "5", "all").random()
    val exercises = listOf(
            "$scales scale in $notes, position: $scalePositions",
            "$scales scale in $notes, position: $scalePositions",
            "find notes in the fretboard: $notes",
            "$triads triads note: $notes from 4th string",
//            "$triads arpeggios note: $notes, position: $scalePositions",
            "chord progressions",
            "Intervals",
            "x-x-x chord progression in C",
            "chord construction: C7 from 5th (A shape) string"

    )

    return exercises.random()
}


