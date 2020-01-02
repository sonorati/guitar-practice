package com.seon.guitarpractice

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Progression.*
import com.seon.guitarpractice.Type.Major
import com.seon.guitarpractice.Type.Minor
import com.seon.guitarpractice.scale.MixolydianScale
import com.seon.guitarpractice.scale.ScaleService

fun main() {

    repeat((1..10).count()) {
        println("${it + 1}. ${randomTask()}")
    }
}

val scaleService = ScaleService()

fun randomTask(): String {

    val triads = listOf(Major, Major, Minor).random()
    val threeNotesPerStringPosition = listOf(1, 2, 3, 4, 5, 6, 7).random()
    val scales = listOf("major", "major", "minor pentatonic").random()
    val notes = listOf(A, ASharp, B, C, CSharp, D, DSharp, E, F, FSharp, G, GSharp).random()
    val seventh = listOf("7", "maj7", "m7", "m7b5").random()
    val triadsStrings = listOf("4", "3").random()
    val string = listOf("6", "5", "4", "3").random()
    val mixolydianScale = MixolydianScale(notes)
    val minorScaleChordProgressions = listOf(
            listOf(i, VI, III, VII),
            listOf(i, VI, VII, v),
            listOf(i, VII, VI, v)
    ).random()
    val majorScaleChordProgressions = listOf(
            listOf(I, vi, IV, V),
            listOf(I, V, vi, iii, IV, iii, IV, V),
            listOf(I, iii, vi, IV),
            listOf(I, iii, I, iii),
            listOf(I, V, iii, VI),
            listOf(I, V, vi, IV),
            listOf(I, ii, iii, ii),
            listOf(I, IV, vi, V),
            listOf(IV, V, I)
    ).random()
    val scalePositions = listOf("1", "2", "3", "4", "5", "all").random()
    val exercises = listOf(
//            "${notes.name} mixolydian chords: ${scaleChords(mixolydianScale)}",
            "$triads scale in ${notes.tabName}, position: $scalePositions",
            "Major scale 3 notes per string position: $threeNotesPerStringPosition",
            "Minor pentatonic scale in ${notes.tabName}, position: $scalePositions",
//            "$triads arpeggios note: $notes, position: $scalePositions",
            "Intervals, name distance and note from $string string, Note ${notes.tabName}",
            "$majorScaleChordProgressions progression in ${notes.tabName} from $string string",
            "Chord construction: ${notes.tabName}$seventh from $string string",
            "Minor Plagal Cadence from $string string,  Note ${notes.tabName}: ${getIntervals(notes, listOf(IV, iv, I))}",
            "Plagal Cadence from $string string, Note ${notes.tabName}: ${getIntervals(notes, listOf(IV, I))}",
            "Perfect Cadence from $string string, Note: ${notes.tabName} ${getIntervals(notes, listOf(V, I))}",
            "$majorScaleChordProgressions chord progression in ${notes.tabName}: ${getIntervals(notes, majorScaleChordProgressions)}",
            "$minorScaleChordProgressions chord progression in ${notes.tabName}: ${getIntervals(notes, minorScaleChordProgressions)}"
    )

    val triadExercises = listOf(
            "Find notes in the fretboard: ${notes.tabName}",
            "$triads triads from ${triadsStrings}th string, Note: ${notes.tabName} find 3rd and 5th note",
            """$majorScaleChordProgressions progression from string: $triadsStrings
   ${getIntervals(notes, majorScaleChordProgressions)}""".trim(),
            """ $minorScaleChordProgressions  progression from string:  $triadsStrings
    ${getIntervals(notes, minorScaleChordProgressions)}""".trimIndent()
    )

    return triadExercises.random()
}

private fun scaleChords(mixolydianScale: MixolydianScale): String {
    return mixolydianScale.chords().fold("|") { acc, chord -> "$acc ${chord.name()} | " }
}

fun getIntervals(key: Note, progressions: List<Progression>): String {
    return scaleService.getChordInterval(key, progressions).map { it.name() }.toString()
}