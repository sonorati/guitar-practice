package com.seon.guitarpractice

import com.seon.guitarpractice.ChordTemplate.chordInterval
import com.seon.guitarpractice.ScaleTemplate.notesInKey

data class Chord(val root: Note, val type: Type) {
    val name = "${root.tabName}${type.tabName}"
    val intervals = chordInterval(type)
    val notes = intervalNotes()

    private fun intervalNotes(): List<Note> {
        val notes = notesInKey(root, type)
        return chordInterval(type).map { notes[it.position] }
    }
}
