package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.*

data class LocrianScale(val key: Note, val type: ChordType = Minor) : Scale(key) {

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(ESharp, CSharp, BSharp) -> ScaleTemplate.notesWithSharpsAlt
        in listOf(A, E, B, FSharp, ASharp, CSharp, DSharp, GSharp) -> ScaleTemplate.notesWithSharps
        else -> ScaleTemplate.notesWithFlats
    }

    override val interval = listOf(
            Interval(ROOT, Diminished),
            Interval(FLAT_SECOND, Major),
            Interval(MINOR_THIRD, Minor),
            Interval(FOURTH, Minor),
            Interval(MINOR_FIFTH, Major),
            Interval(FLAT_SIXTH, Major),
            Interval(FLAT_SEVENTH, Minor)
    )
}