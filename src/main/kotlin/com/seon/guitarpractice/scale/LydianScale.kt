package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*
import com.seon.guitarpractice.scale.ScaleTemplate.allNotesWithFlats
import com.seon.guitarpractice.scale.ScaleTemplate.allNotesWithSharps

data class LydianScale(val key: Note, val type: Type = Major) : Scale(key, type) {

    override fun scaleNotes() = when (key) {
        in listOf(GFlat, CFlat, FFlat) -> ScaleTemplate.allNotesWithFlatsAlt
        in listOf(CSharp, BSharp) -> ScaleTemplate.allNotesWithSharpsAlt
        in listOf(C, G, D, A, E, B, FSharp, DSharp, ASharp, GSharp) -> allNotesWithSharps
        else -> allNotesWithFlats
    }

    override val interval = listOf(
            Interval(ROOT, Major),
            Interval(SECOND, Major),
            Interval(THIRD, Minor),
            Interval(RAISED_FOURTH, Diminished),
            Interval(FIFTH, Major),
            Interval(SIXTH, Minor),
            Interval(SEVENTH, Minor)
    )

}