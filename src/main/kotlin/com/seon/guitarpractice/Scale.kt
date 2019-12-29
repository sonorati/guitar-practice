package com.seon.guitarpractice

import com.seon.guitarpractice.ScaleTemplate.getScaleChords
import com.seon.guitarpractice.ScaleTemplate.getScaleInterval
import com.seon.guitarpractice.ScaleTemplate.notesInKey
import com.seon.guitarpractice.Type.*

data class Scale(val key: Note, val type: Type) {

    val chords = buildChords()
    val notes = buildNotes()

    fun isChordInScale(chord: Chord) = chords.contains(chord)

    fun dominant() = Chord(notes[4], Dominant)

    fun relativeMinor() = chords[5]

    private fun buildChords(): List<Chord> {
        val scaleChords = getScaleChords(type)
        return buildNotes().mapIndexed { index, note -> Chord(root = note, type = scaleChords[index]) }
    }

    private fun buildNotes(): List<Note> {
        val scaleIntervals = getScaleInterval(type)
        val notes = notes()
        return scaleIntervals.map { interval -> notes[interval] }
    }

    private fun notes(): List<Note> = notesInKey(key, type)
}