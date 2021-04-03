package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.Major
import com.seon.guitarpractice.ChordType.Minor

data class MinorPentatonicScale(val key: Note, val type: ChordType = Minor) : Scale(key) {

    override val interval = listOf(
            Interval(ROOT, Minor),
            Interval(MINOR_THIRD, Major),
            Interval(FOURTH, Minor),
            Interval(FIFTH, Minor),
            Interval(FLAT_SEVENTH, Major)
    )

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(ESharp, CSharp, BSharp) -> ScaleTemplate.notesWithSharpsAlt
        in listOf(A, E, B, FSharp, ASharp, CSharp, DSharp, GSharp) -> ScaleTemplate.notesWithSharps
        else -> ScaleTemplate.notesWithFlats
    }

}