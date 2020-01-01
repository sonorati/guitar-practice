package com.seon.guitarpractice

fun main() {
    repeat((1..10).count()) {
        println("${it + 1}. ${randomTask()}")
    }
}

fun randomTask(): String {
    val triads = listOf("major", "major", "minor", "augmented").random()
    val scales = listOf("major", "major", "minor pentatonic").random()
    val notes = listOf("A", "B", "C", "D", "E", "F", "G").random()
    val seventh = listOf("7", "maj7", "m7", "m7b5").random()
    val triadsStrings = listOf("4", 3).random()
    val string = listOf("6", "5").random()
    val scalePositions = listOf("1", "2", "3", "4", "5", "all").random()
    val exercises = listOf(
            "major scale in $notes, position: $scalePositions",
//            "$scales scale in $notes, position: $scalePositions",
            "find notes in the fretboard: $notes",
            "$triads triads from ${triadsStrings}th note: $notes string",
//            "$triads arpeggios note: $notes, position: $scalePositions",
            "Intervals from $string string note $notes",
//            "x-x-x chord progression in $notes from $string string",
            "chord construction: $notes $seventh from ${string}th string"

    )

    return exercises.random()
}


