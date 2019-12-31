package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Major
import com.seon.guitarpractice.Type.Minor

data class MinorPentatonicScale(val key: Note, val type: Type = Minor) : Scale(key, type) {

    override val interval = listOf(
            Interval(ROOT, Minor),
            Interval(MINOR_THIRD, Major),
            Interval(FOURTH, Minor),
            Interval(FIFTH, Minor),
            Interval(FLAT_SEVENTH, Major)
    )

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(ESharp, CSharp, BSharp) -> ScaleTemplate.allNotesWithSharpsAlt
        in listOf(A, E, B, FSharp, ASharp, CSharp, DSharp, GSharp) -> ScaleTemplate.allNotesWithSharps
        else -> ScaleTemplate.allNotesWithFlats
    }

}