package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.C
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*

data class MixolydianScale(val key: Note, val type: Type = Major) : Scale(key, type) {

    override fun scaleNotes(): List<Note> {
        return if (key == C) {
            ScaleTemplate.allNotesWithFlats
        } else ScaleTemplate.allNotesWithSharps
    }

    override val interval = listOf(
            Interval(ROOT, Major),
            Interval(SECOND, Diminished),
            Interval(THIRD, Diminished),
            Interval(FOURTH, Major),
            Interval(FIFTH, Minor),
            Interval(NATURAL_SIXTH, Minor),
            Interval(FLAT_SEVENTH, Major)
    )
}