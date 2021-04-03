package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.ChordType
import com.seon.guitarpractice.ChordType.*

object ScaleTemplate {

    val notesWithSharps = listOf(A, ASharp, B, C, CSharp, D, DSharp, E, F, FSharp, G, GSharp, A,
            ASharp, B, C, CSharp, D, DSharp, E, F, FSharp, G, GSharp)
    val notesWithDoubleSharps = listOf(ASharp, B, BSharp, CSharp, CSharpSharp, DSharp, E, ESharp, FSharp,
            FSharpSharp, GSharp, GSharpSharp, A,
            ASharp, B, C, CSharp, D, DSharp, E, F, FSharp, G, GSharp)
    val notesWithSharpsAlt = listOf(A, ASharp, B, BSharp, CSharp, D, DSharp, E, ESharp, FSharp, G, GSharp, A,
            ASharp, B, BSharp, CSharp, D, DSharp, E, ESharp, FSharp, G)
    val notesWithFlats = listOf(A, BFlat, B, C, DFlat, D, EFlat, E, F, GFlat, G, AFlat, A,
            BFlat, B, C, DFlat, D, EFlat, E, F, GFlat, G)
    val notesWithFlatsAlt = listOf(A, BFlat, CFlat, C, DFlat, D, EFlat, FFlat, F, GFlat, G, AFlat, A,
            BFlat, CFlat, C, DFlat, D, EFlat, FFlat, F, GFlat, G)

    fun chordTypes(root: Note, chordType: ChordType): List<Note> {
        return when (chordType) {
            in listOf(Major, Augmented, Dominant, MajorSeven) -> MajorScale(root).scaleNotes()
            in listOf(Minor, Diminished, MinorSeven) -> MinorScale(root).scaleNotes()
            else -> notesWithSharps
        }
    }

    fun notesInKey(key: Note, allNotes: List<Note>): List<Note> {
        val numberOfNotes = 12
        val startFromKey = allNotes.indexOf(key)
        return allNotes.subList(startFromKey, startFromKey + numberOfNotes)
    }
}