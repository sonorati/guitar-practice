package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.*

data class MinorScale(val key: Note, val type: ChordType = Minor) : Scale(key) {

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(Note.ESharp, Note.CSharp, Note.BSharp) -> ScaleTemplate.notesWithSharpsAlt
        in listOf(Note.A, Note.E, Note.B, Note.FSharp, Note.ASharp, Note.CSharp, Note.DSharp, Note.GSharp) -> ScaleTemplate.notesWithSharps
        else -> ScaleTemplate.notesWithFlats
    }

    override val interval = listOf(
            Interval(ROOT, Minor),
            Interval(SECOND, Diminished),
            Interval(MINOR_THIRD, Major),
            Interval(FOURTH, Minor),
            Interval(FIFTH, Minor),
            Interval(FLAT_SIXTH, Major),
            Interval(FLAT_SEVENTH, Major)
    )
}