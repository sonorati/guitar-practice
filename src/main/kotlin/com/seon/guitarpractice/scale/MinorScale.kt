package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class MinorScale(val key: Note, val type: Type = Minor) : Scale(key, type) {

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(Note.ESharp, Note.CSharp, Note.BSharp) -> ScaleTemplate.allNotesWithSharpsAlt
        in listOf(Note.A, Note.E, Note.B, Note.FSharp, Note.ASharp, Note.CSharp, Note.DSharp, Note.GSharp) -> ScaleTemplate.allNotesWithSharps
        else -> ScaleTemplate.allNotesWithFlats
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