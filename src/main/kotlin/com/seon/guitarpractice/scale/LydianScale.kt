package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.*
import com.seon.guitarpractice.scale.ScaleTemplate.notesWithFlats
import com.seon.guitarpractice.scale.ScaleTemplate.notesWithSharps

data class LydianScale(val key: Note, val type: ChordType = Major) : Scale(key) {

    override fun scaleNotes() = when (key) {
        in listOf(GFlat, CFlat, FFlat) -> ScaleTemplate.notesWithFlatsAlt
        in listOf(CSharp, BSharp) -> ScaleTemplate.notesWithSharpsAlt
        in listOf(C, G, D, A, E, B, FSharp, DSharp, ASharp, GSharp) -> notesWithSharps
        else -> notesWithFlats
    }

    override val interval = listOf(
            Interval(ROOT, Major),
            Interval(SECOND, Major),
            Interval(THIRD, Minor),
            Interval(SHARP_FOURTH, Diminished),
            Interval(FIFTH, Major),
            Interval(NATURAL_SIXTH, Minor),
            Interval(SEVENTH, Minor)
    )

}