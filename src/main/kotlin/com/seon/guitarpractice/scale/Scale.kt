package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*
import com.seon.guitarpractice.chord.*
import com.seon.guitarpractice.scale.ScaleTemplate.notesInKey

abstract class Scale(private val key: Note, private val type: Type) {

    abstract val scaleChords: List<Type>
    abstract val  intervals: List<Int>

    fun chords() = scaleChords.mapIndexed { index, note ->
        val notes = notes()
        when (note) {
            Major -> MajorChord(notes[index])
            Minor -> MinorChord(notes[index])
            Augmented -> AugmentedChord(notes[index])
            Diminished -> DiminishedChord(notes[index])
            Dominant -> TODO()
        }
    }

    fun isChordInScale(chord: Chord) = chords().contains(chord)

    fun dominant() = DominantChord(notes()[4])

    fun relativeMinor() = chords()[5]

    fun notes(): List<Note> {
        val notes = notesInKey(key, type)
        return intervals.map { notes[it] }
    }

}