package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.ChordType.*
import com.seon.guitarpractice.chord.model.*
import com.seon.guitarpractice.scale.ScaleTemplate.notesInKey

abstract class Scale(private val key: Note) {

    abstract val interval: List<Interval>
//    abstract val interval2: List<Interval2>

    abstract fun scaleNotes(): List<Note>

    fun notes(): List<Note> {
        val allNotes = scaleNotes()
        val notes = notesInKey(key, allNotes)
        return interval.map { notes[it.position.position] }
    }

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

//    fun extendedChords(): List<Chord> = interval2.mapIndexed {
//
//    }

    fun isChordInScale(chord: Chord) = chords().contains(chord)

    fun dominant() = DominantChord(notes()[4])

    fun scaleChords(): String {
        return chords().fold("|") { acc, chord -> "$acc ${chord.name()} | " }
    }

    fun scaleIntervals(): String {
        return interval.fold("|") { acc, iv -> "$acc $iv | " }
    }
}