package com.seon.guitarpractice.exercise

import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Progression
import com.seon.guitarpractice.progression.majorScaleChordProgressions
import com.seon.guitarpractice.progression.minorScaleChordProgressions
import com.seon.guitarpractice.scale.*

private fun runExercise(title: String, rule: String) {
    println(title)
    repeat((1..10).count()) {
        println("${it + 1}. $rule")
        Thread.sleep(2000)
    }
}

fun getNSimpleNotes(n : Int = 3): List<Note> {
    return (1..n).map {
        simpleNotes()
    }
}

val triads = listOf(ChordType.Major, ChordType.Major, ChordType.Minor).random()
val threeNotesPerStringPosition = listOf(1, 2, 3, 4, 5, 6, 7).random()
val scales = listOf("major", "major", "minor pentatonic").random()
val seventh = listOf("7", "maj7", "m7", "m7b5").random()
val triadsStrings = listOf("4", "3").random()
val string = listOf("6", "5", "4", "3").random()
val mixolydianScale = MixolydianScale(randomNote())
val scaleService = ScaleService()
val scalePositions = listOf("1", "2", "3", "4", "5", "all").random()

fun randomNote() = listOf(A, ASharp, B, C, CSharp, D, DSharp, E, F, FSharp, G, GSharp).random()

fun simpleNotes() = listOf(A, B, C, D, E, F, G).random()

fun randomExercises() {
    runExercise("Find notes in the fretboard", "${simpleNotes()}")
    runExercise("From first string find notes in the fretboard", "${simpleNotes()}")
        runExercise("Play major triad", "${simpleNotes()} major, string ${listOf(1, 2, 3).random()}")
    runExercise("Play minor triad", "${simpleNotes()} major, string ${listOf(1, 2, 3).random()}")
}

val progressionExercises = listOf(
//            "Progression with borrowed chords (https://www.youtube.com/watch?v=7IdttvJSedg)",
//            "Progression with 7 (https://www.youtube.com/watch?v=3JizNRwHYNY)",
//            "Progression with secondary dominants (https://www.youtube.com/watch?v=py4HaueW50Q)",
//            "Progression with Motifs and Chords (https://www.youtube.com/watch?v=z3Dy6Mnp5Og&t=332s)",
        "Minor Plagal Cadence, Note ${randomNote().tabName}",
        "Plagal Cadence, Note ${randomNote().tabName}",
        "Perfect Cadence, Note: ${randomNote().tabName}",
        """${majorScaleChordProgressions.random()} progression from string: $triadsStrings
   ${getIntervals(randomNote(), majorScaleChordProgressions.random())}""".trim(),
        """ $minorScaleChordProgressions  progression from string:  $triadsStrings
    ${getIntervals(randomNote(), minorScaleChordProgressions.random())}""".trimIndent()
)

fun generateTask(): String {

    //1. arpeggios
    //2. riffs & lead
    //3. chord progression
    //4. technique
    //5. find notes and chords
    //6. scales
    //7. modes with backing track
    //8. licks

    val exercises = findNotesAndChordExercises

    return exercises.random()
}

fun getIntervals(key: Note, progressions: List<Progression>): String {
    val chordInterval = scaleService.getChordInterval(key, progressions)
    return chordInterval.map { it.name() }.toString()
}

fun processScales(key: Note, scales: List<Scale> = allModes(key)) {
    scales.forEach { scale ->
        println("Chords: ${scale.scaleChords()} ${scale.javaClass.simpleName}")
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

val findNotesAndChordExercises = listOf(
        "Intervals, name distance and note from $string string, Note ${randomNote().tabName}",
        "Chord construction: ${randomNote().tabName}$seventh from $string string",
        "Find notes in the fretboard: ${randomNote().tabName}",
        "$triads triads from ${triadsStrings}th string, Note: ${randomNote().tabName} find 3rd and 5th note"
)

val modesExercise = listOf(
        ""
)
val scaleExercises = listOf(
        "${randomNote().name} mixolydian chords: ${mixolydianScale.scaleChords()}",
        "$triads scale in ${randomNote().tabName}, position: $scalePositions",
        "Major scale 3 notes per string position: $threeNotesPerStringPosition",
        "Minor pentatonic scale in ${randomNote().tabName}, position: $scalePositions"
)


val arpeggiosExercises = listOf(
        "Maj7 arpeggios note: G, Bb (backing track https://signalsmusicstudio.com/new-lesson-series-awesome-arpeggios-and-practice-track)"
)

val riffAndLeadExercises = listOf(
        "riff and lead Harmonic Minor (https://www.youtube.com/watch?v=2kSq9GtZu_k)",
        "Metallica riff (https://www.youtube.com/watch?v=UuqvZDDm_bk)"
)

val techniqueExercises = listOf(
        "legato",
        "sweeping arpeggios"
)

