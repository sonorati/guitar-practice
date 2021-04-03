package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.*
import com.seon.guitarpractice.chord.model.*
import java.util.Optional.of

data class MajorScale(val key: Note, val type: ChordType = Major) : Scale(key) {

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(GFlat, CFlat, FFlat) -> ScaleTemplate.notesWithFlatsAlt
        ASharp -> ScaleTemplate.notesWithDoubleSharps
        in listOf(CSharp, BSharp, FSharp) -> ScaleTemplate.notesWithSharpsAlt
        in listOf(C, G, D, A, E, B, DSharp, GSharp) -> ScaleTemplate.notesWithSharps
        else -> ScaleTemplate.notesWithFlats
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
            Interval2(ROOT, { MajorChord(it) }, { of(MajorSevenChord(it)) }),
            Interval2(SECOND, { MinorChord(it) }, { of(MinorSevenChord(it)) }),
            Interval2(THIRD, { MinorChord(it) }, { of(MinorSevenChord(it)) }),
            Interval2(FOURTH, { MajorChord(it) }, { of(MajorSevenChord(it)) }),
            Interval2(FIFTH, { MajorChord(it) }, { of(DominantChord(it)) }),
            Interval2(NATURAL_SIXTH, { MinorChord(it) }, { of(MinorSevenChord(it)) }),
            Interval2(SEVENTH, { DiminishedChord(it) }, { of(DiminishedChord(it)) })
    )
}