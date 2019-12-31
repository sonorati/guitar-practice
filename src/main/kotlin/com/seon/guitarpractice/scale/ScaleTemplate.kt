package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Accidental
import com.seon.guitarpractice.Accidental.*
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.*
import com.seon.guitarpractice.chord.model.*

object ScaleTemplate {

    val allNotesWithSharps = listOf(A, ASharp, B, C, CSharp, D, DSharp, E, F, FSharp, G, GSharp, A,
            ASharp, B, C, CSharp, D, DSharp, E, F, FSharp, G, GSharp)
    val allNotesWithSharpsAlt = listOf(A, ASharp, B, BSharp, CSharp, D, DSharp, E, ESharp, FSharp, G, GSharp, A,
            ASharp, B, BSharp, CSharp, D, DSharp, E, ESharp, FSharp, G)
    val allNotesWithFlats = listOf(A, BFlat, B, C, DFlat, D, EFlat, E, F, GFlat, G, AFlat, A,
            BFlat, B, C, DFlat, D, EFlat, E, F, GFlat, G)
    val allNotesWithFlatsAlt = listOf(A, BFlat, CFlat, C, DFlat, D, EFlat, FFlat, F, GFlat, G, AFlat, A,
            BFlat, CFlat, C, DFlat, D, EFlat, FFlat, F, GFlat, G)

    fun chordTypes(root: Note, type: Type): List<Note> {
        return when (type) {
            in listOf(Major, Augmented, Dominant, MajorSeven) -> MajorScale(root).scaleNotes()
            in listOf(Minor, Diminished, MinorSeven) -> MinorScale(root).scaleNotes()
            else -> allNotesWithSharps
        }
    }

    fun notesInKey(key: Note, allNotes: List<Note>): List<Note> {
        val numberOfNotes = 12
        val startFromKey = allNotes.indexOf(key)
        return allNotes.subList(startFromKey, startFromKey + numberOfNotes)
    }

    private fun notesForScale(key: Note, type: Type): List<Note> {
        return if (type == Minor) {
            when (key) {
                in listOf(ESharp, CSharp, BSharp) -> allNotesWithSharpsAlt
                in listOf(A, E, B, FSharp, ASharp, CSharp, DSharp, GSharp) -> allNotesWithSharps
                else -> allNotesWithFlats
            }
        } else {
            when (key) {
                in listOf(GFlat, CFlat, FFlat) -> allNotesWithFlatsAlt
                in listOf(CSharp, BSharp) -> allNotesWithSharpsAlt
                in listOf(C, G, D, A, E, B, FSharp, DSharp, ASharp, GSharp) -> allNotesWithSharps
                else -> allNotesWithFlats
            }
        }
    }
}