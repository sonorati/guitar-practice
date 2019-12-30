package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.scale.ScaleTemplate.notesInKey

abstract class Chord(private val root: Note,
                     private val type: Type,
                     private val intervals: List<Interval>) {

    val name = "${root.tabName}${type.tabName}"
    val notes = intervalNotes()

    private fun intervalNotes(): List<Note> {
        val notes = notesInKey(root, type)
        return intervals.map { notes[it.position] }
    }
}
