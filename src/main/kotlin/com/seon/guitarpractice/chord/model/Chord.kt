package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.*
import com.seon.guitarpractice.scale.MajorScale
import com.seon.guitarpractice.scale.MinorScale
import com.seon.guitarpractice.scale.ScaleTemplate
import com.seon.guitarpractice.scale.ScaleTemplate.chordTypes
import com.seon.guitarpractice.scale.ScaleTemplate.notesInKey

abstract class Chord(private val root: Note) {

    abstract val intervals: List<Interval>
    abstract val type: ChordType

    fun name() = "${root.tabName}${type.tabName}"

    fun notes(): List<Note> {
        val allNotes = chordTypes(root, type)
        val notes = notesInKey(root, allNotes)
        return intervals.map { notes[it.position] }
    }

//    private fun chordTypes(root: Note, chordType: ChordType): List<Note> {
//        return when (chordType) {
//            in listOf(Major, Augmented, Dominant, MajorSeven) -> MajorScale(root).scaleNotes()
//            in listOf(Minor, Diminished, MinorSeven) -> MinorScale(root).scaleNotes()
//            else -> ScaleTemplate.notesWithSharps
//        }
//    }

}
