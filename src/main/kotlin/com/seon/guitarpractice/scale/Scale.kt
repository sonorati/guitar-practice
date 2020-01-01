package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*
import com.seon.guitarpractice.chord.model.*
import com.seon.guitarpractice.scale.ScaleTemplate.notesInKey

abstract class Scale(private val key: Note, private val type: Type) {

    abstract val interval: List<Interval>

    abstract fun scaleNotes(): List<Note>

    fun extendedChords(): List<Chord> = TODO()

    fun chords(): List<Chord> {
        val notes = notes()
        return interval.mapIndexed { index, interval ->
            when (interval.chordType) {
                Major -> MajorChord(notes[index])
                Minor -> MinorChord(notes[index])
                Augmented -> AugmentedChord(notes[index])
                Diminished -> DiminishedChord(notes[index])
                Dominant -> DominantChord(notes[index])
                MajorSeven -> MajorSevenChord(notes[index])
                MinorSeven -> MinorSevenChord(notes[index])
            }
        }
    }

//    fun chords2(): List<Chord> {
//        val notes = notes()
//        return interval2.mapIndexed { index, interval -> interval.chord(notes[index]) }
//    }

    fun isChordInScale(chord: Chord) = chords().contains(chord)

    fun dominant() = DominantChord(notes()[4])

    fun relativeMinor() = chords()[5]

    fun notes(): List<Note> {
        val allNotes = scaleNotes()
        val notes = notesInKey(key, allNotes)
        return interval.map { notes[it.position.position] }
    }
}