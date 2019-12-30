package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class PhrygianScale(val key: Note, val type: Type = Minor) : Scale(key, type) {

    //TODO: FIXME CHORDS FROM MINOR SCALE!!

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(Note.ESharp, Note.CSharp, Note.BSharp) -> ScaleTemplate.allNotesWithSharpsAlt
        in listOf(Note.A, Note.E, Note.B, Note.FSharp, Note.ASharp, Note.CSharp, Note.DSharp, Note.GSharp) -> ScaleTemplate.allNotesWithSharps
        else -> ScaleTemplate.allNotesWithFlats
    }

    override val interval = listOf(
            Interval(ROOT, Major),
            Interval(MINOR_SECOND, Major),
            Interval(MINOR_THIRD, Minor),
            Interval(FOURTH, Diminished),
            Interval(FIFTH, Major),
            Interval(MINOR_SIXTH, Minor),
            Interval(MINOR_SEVENTH, Minor)
    )
}