package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.*

/**
 *   Basic Observations
 *   First notice that it has a b3 (minor 3rd) so it's a minor type scale.
 *   It also has a b7 which makes it work on Min7 type chords. It's the b2 and b6 (which can be thought of as a #5) which are both very strong
 *   Key Tone = b2
 *   The b2 is the main flavour here, that interval is only found in one other mode (Locrian).
 */
data class PhrygianScale(val key: Note, val type: ChordType = Minor) : Scale(key) {

    override fun scaleNotes(): List<Note> = when (key) {
        in listOf(Note.ESharp, Note.CSharp, Note.BSharp) -> ScaleTemplate.notesWithSharpsAlt
        in listOf(Note.A, Note.E, Note.B, Note.FSharp, Note.ASharp, Note.CSharp, Note.DSharp, Note.GSharp) -> ScaleTemplate.notesWithSharps
        else -> ScaleTemplate.notesWithFlats
    }

    override val interval = listOf(
            Interval(ROOT, Minor),
            Interval(FLAT_SECOND, Major),
            Interval(MINOR_THIRD, Major),
            Interval(FOURTH, Minor),
            Interval(FIFTH, Diminished),
            Interval(FLAT_SIXTH, Major),
            Interval(FLAT_SEVENTH, Minor)
    )
}