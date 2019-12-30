package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*
import com.seon.guitarpractice.chord.*
import com.seon.guitarpractice.scale.ScaleTemplate.notesInKey

abstract class Scale(private val key: Note,
                     private val type: Type,
                     private val intervals: List<Int>) {

    val notes = buildNotes()

    abstract fun scaleChords(): List<Type>

    fun chords() = scaleChords().mapIndexed { index, note ->
        when (note) {
            Major -> MajorChord(notes[index])
            Minor -> MinorChord(notes[index])
            Augmented -> AugmentedChord(notes[index])
            Diminished -> DiminishedChord(notes[index])
            Dominant -> TODO()
        }
    }

    fun isChordInScale(chord: Chord) = chords().contains(chord)

    fun dominant() = DominantChord(notes[4])

    fun relativeMinor() = chords()[5]

    private fun buildNotes(): List<Note> {
        val notes = notesInKey(key, type)
        return intervals.map { notes[it] }
    }

}