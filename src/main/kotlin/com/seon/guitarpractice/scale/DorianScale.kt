package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class DorianScale(val key: Note, val type: Type = Minor) : Scale(key, type) {

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(ESharp, CSharp, BSharp) -> ScaleTemplate.allNotesWithSharpsAlt
        in listOf(A, E, B, FSharp, ASharp, CSharp, DSharp, GSharp) -> ScaleTemplate.allNotesWithSharps
        else -> ScaleTemplate.allNotesWithFlats
    }

    override val interval = listOf(
            Interval(ROOT, Major),
            Interval(SECOND, Minor),
            Interval(MINOR_THIRD, Major),
            Interval(FOURTH, Major),
            Interval(FIFTH, Minor),
            Interval(NATURAL_SIXTH, Diminished),
            Interval(FLAT_SEVENTH, Major)
    )
}