package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Chord
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Dominant
import com.seon.guitarpractice.scale.ScaleTemplate.getScaleChords
import com.seon.guitarpractice.scale.ScaleTemplate.notesInKey

abstract class Scale(private val key: Note,
                     private val type: Type,
                     private val interval: List<Int>) {

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
        val notes = notesInKey(key, type)
        return interval.map { notes[it] }
    }
}