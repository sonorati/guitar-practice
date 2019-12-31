package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class MajorScale(val key: Note, val type: Type = Major) : Scale(key, type) {

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(Note.GFlat, Note.CFlat, Note.FFlat) -> ScaleTemplate.allNotesWithFlatsAlt
        in listOf(Note.CSharp, Note.BSharp) -> ScaleTemplate.allNotesWithSharpsAlt
        in listOf(Note.C, Note.G, Note.D, Note.A, Note.E, Note.B, Note.FSharp, Note.DSharp, Note.ASharp, Note.GSharp) -> ScaleTemplate.allNotesWithSharps
        else -> ScaleTemplate.allNotesWithFlats
    }

    override val interval = listOf(
            Interval(ROOT, Major),
            Interval(SECOND, Minor),
            Interval(THIRD, Minor),
            Interval(FOURTH, Major),
            Interval(FIFTH, Major),
            Interval(NATURAL_SIXTH, Minor),
            Interval(SEVENTH, Diminished)
    )
}