package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.scale.ScaleTemplate.allNotesWithSharps
import com.seon.guitarpractice.scale.ScaleTemplate.chordTypes
import com.seon.guitarpractice.scale.ScaleTemplate.notesInKey

abstract class Chord(private val root: Note) {

    abstract val intervals: List<Interval>
    abstract val type: Type

    fun name() = "${root.tabName}${type.tabName}"

    fun notes(): List<Note> {
        val allNotes = chordTypes(root, type)
        val notes = notesInKey(root, allNotes)
        return intervals.map { notes[it.position] }
    }

}
