package com.seon.guitarpractice

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Progression.*
import com.seon.guitarpractice.Type.Major
import com.seon.guitarpractice.Type.Minor
import com.seon.guitarpractice.scale.*

// reference: https://feelyoursound.com/scale-chords/c-locrian/
fun main() {
//    repeat((1..10).count()) {
//        println("${it + 1}. ${generateTask()}")
//    }
    processScales(C)
}

val triads = listOf(Major, Major, Minor).random()
val threeNotesPerStringPosition = listOf(1, 2, 3, 4, 5, 6, 7).random()
val scales = listOf("major", "major", "minor pentatonic").random()
val notes = listOf(A, ASharp, B, C, CSharp, D, DSharp, E, F, FSharp, G, GSharp).random()
val seventh = listOf("7", "maj7", "m7", "m7b5").random()
val triadsStrings = listOf("4", "3").random()
val string = listOf("6", "5", "4", "3").random()
val mixolydianScale = MixolydianScale(notes)
val scaleService = ScaleService()
val scalePositions = listOf("1", "2", "3", "4", "5", "all").random()

val minorScaleChordProgressions = listOf(
        listOf(i, VI, III, VII),
        listOf(i, VI, VII, v),
        listOf(i, VI, II, VII),
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

fun generateTask(): String {

    //1. arpeggios
    //2. riffs & lead
    //3. chord progression
    //4. technique
    //5. find notes and chords
    //6. scales
    //7. modes with backing track

    val exercises = listOf("")

    return exercises.random()
}

val arpeggiosExercises = listOf(
        "$triads arpeggios note: $notes, position: $scalePositions"
)

val riffAndLeadExercises = listOf(
        "riff and lead Harmonic Minor (https://www.youtube.com/watch?v=2kSq9GtZu_k)",
        "Metallica riff (https://www.youtube.com/watch?v=UuqvZDDm_bk)"
)

val progressionExercises = listOf(
//            "Progression with borrowed chords (https://www.youtube.com/watch?v=7IdttvJSedg)",
//            "Progression with 7 (https://www.youtube.com/watch?v=3JizNRwHYNY)",
//            "Progression with secondary dominants (https://www.youtube.com/watch?v=py4HaueW50Q)",
//            "Progression with Motifs and Chords (https://www.youtube.com/watch?v=z3Dy6Mnp5Og&t=332s)",
        "Minor Plagal Cadence, Note ${notes.tabName}",
        "Plagal Cadence, Note ${notes.tabName}",
        "Perfect Cadence, Note: ${notes.tabName}",
        """$majorScaleChordProgressions progression from string: $triadsStrings
   ${getIntervals(notes, majorScaleChordProgressions)}""".trim(),
        """ $minorScaleChordProgressions  progression from string:  $triadsStrings
    ${getIntervals(notes, minorScaleChordProgressions)}""".trimIndent()
)

val techniqueExercises = listOf(
        "legato",
        "sweeping arpeggios"
)

val findNotesAndChordExercises = listOf(
        "Intervals, name distance and note from $string string, Note ${notes.tabName}",
        "Chord construction: ${notes.tabName}$seventh from $string string",
        "Find notes in the fretboard: ${notes.tabName}",
        "$triads triads from ${triadsStrings}th string, Note: ${notes.tabName} find 3rd and 5th note"
)

val modesExercise = listOf(
        ""
)
val scaleExercises = listOf(
        "${notes.name} mixolydian chords: ${scaleChords(mixolydianScale)}",
        "$triads scale in ${notes.tabName}, position: $scalePositions",
        "Major scale 3 notes per string position: $threeNotesPerStringPosition",
        "Minor pentatonic scale in ${notes.tabName}, position: $scalePositions"
)

fun getIntervals(key: Note, progressions: List<Progression>): String {
    return scaleService.getChordInterval(key, progressions).map { it.name() }.toString()
}

fun processScales(key: Note) {
    allModes(key).forEach { scale ->
        println("Chords: ${scaleChords(scale)} ${scale.javaClass.simpleName}")
    }
}

fun allModes(key: Note): List<Scale> {
    return listOf(
            MajorScale(key),
            DorianScale(key),
            PhrygianScale(key),
            LydianScale(key),
            MixolydianScale(key),
            MinorScale(key),
            LocrianScale(key)
    )
}

fun scaleChords(mixolydianScale: Scale): String {
    return mixolydianScale.chords().fold("|") { acc, chord -> "$acc ${chord.name()} | " }
}