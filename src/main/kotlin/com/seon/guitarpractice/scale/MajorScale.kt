package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*
import com.seon.guitarpractice.chord.model.*
import java.util.*

data class MajorScale(val key: Note, val type: Type = Major) : Scale(key, type) {

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(GFlat, CFlat, FFlat) -> ScaleTemplate.allNotesWithFlatsAlt
        in listOf(CSharp, BSharp) -> ScaleTemplate.allNotesWithSharpsAlt
        in listOf(C, G, D, A, E, B, FSharp, DSharp, ASharp, GSharp) -> ScaleTemplate.allNotesWithSharps
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

    val interval2 = listOf(
            Interval2(ROOT, { MajorChord(it) }, { Optional.of(MajorSevenChord(it)) }),
            Interval2(SECOND, { MinorChord(it) }, { Optional.of(MinorSevenChord(it)) }),
            Interval2(THIRD, { MinorChord(it) }, { Optional.of(MinorSevenChord(it)) }),
            Interval2(FOURTH, { MajorChord(it) }, { Optional.of(MajorSevenChord(it)) }),
            Interval2(FIFTH, { MajorChord(it) }, { Optional.of(DominantChord(it)) }),
            Interval2(NATURAL_SIXTH, { MinorChord(it) }, { Optional.of(MinorSevenChord(it)) }),
            Interval2(SEVENTH, { DiminishedChord(it) }, { Optional.of(DiminishedChord(it)) })
    )
}