package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*
import com.seon.guitarpractice.chord.*
import com.seon.guitarpractice.scale.ScaleTemplate.notesInKey

abstract class Scale(private val key: Note, private val type: Type) {

    abstract fun scaleNotes(): List<Note>

    fun chords() = interval.mapIndexed { index, note ->
        val notes = notes()
        when (note.chordType) {
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
        val allNotes = scaleNotes()
        val notes = notesInKey(key, type, allNotes)
        return interval.map { notes[it.position.position] }
    }

    abstract val interval: List<Interval>
}