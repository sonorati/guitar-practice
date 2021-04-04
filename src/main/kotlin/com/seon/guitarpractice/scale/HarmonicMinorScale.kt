package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.*
import com.seon.guitarpractice.Note.*

data class HarmonicMinorScale(val key: Note, val type: ChordType = Minor) : Scale(key) {

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(ESharp, CSharp, BSharp) -> ScaleTemplate.notesWithSharpsAlt
        in listOf(A, E, B, FSharp, ASharp, CSharp, DSharp, GSharp) -> ScaleTemplate.notesWithSharps
        else -> ScaleTemplate.notesWithFlats
    }

    override val interval = listOf(
            Interval(ROOT, Minor),
            Interval(SECOND, Diminished),
            Interval(MINOR_THIRD, Augmented),
            Interval(FOURTH, Minor),
            Interval(FIFTH, Major),
            Interval(FLAT_SIXTH, Major),
            Interval(SEVENTH, Diminished)
    )
}