package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.C
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.*

data class MixolydianScale(val key: Note, val type: ChordType = Major) : Scale(key) {

    override fun scaleNotes(): List<Note> {
        return if (key == C) {
            ScaleTemplate.notesWithFlats
        } else ScaleTemplate.notesWithSharps
    }

    override val interval = listOf(
            Interval(ROOT, Major),
            Interval(SECOND, Minor),
            Interval(THIRD, Diminished),
            Interval(FOURTH, Major),
            Interval(FIFTH, Minor),
            Interval(NATURAL_SIXTH, Minor),
            Interval(FLAT_SEVENTH, Major)
    )
}