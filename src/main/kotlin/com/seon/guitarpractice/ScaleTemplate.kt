package com.seon.guitarpractice

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type.*

object ScaleTemplate {

    private val majorScaleInterval = listOf(0, 2, 4, 5, 7, 9, 11)
    private val minorScaleInterval = listOf(0, 2, 3, 5, 7, 8, 10)
    private val majorScaleChords = listOf(Major, Minor, Minor, Major, Major, Minor, Diminished)
    private val minorScaleChords = listOf(Minor, Diminished, Major, Minor, Minor, Major, Major)

    private val allNotesWithSharps = listOf(A, ASharp, B, C, CSharp, D, DSharp, E, F, FSharp, G, GSharp, A,
            ASharp, B, C, CSharp, D, DSharp, E, F, FSharp, G)
    private val allNotesWithSharpsAlt = listOf(A, ASharp, B, BSharp, CSharp, D, DSharp, E, ESharp, FSharp, G, GSharp, A,
            ASharp, B, BSharp, CSharp, D, DSharp, E, ESharp, FSharp, G)
    private val allNotesWithFlats = listOf(A, BFlat, B, C, DFlat, D, EFlat, E, F, GFlat, G, AFlat, A,
            BFlat, B, C, DFlat, D, EFlat, E, F, GFlat, G)
    private val allNotesWithFlatsAlt = listOf(A, BFlat, CFlat, C, DFlat, D, EFlat, FFlat, F, GFlat, G, AFlat, A,
            BFlat, CFlat, C, DFlat, D, EFlat, FFlat, F, GFlat, G)


    fun notesInKey(key: Note, type: Type): List<Note> {
        val allNotes = notesForScale(key, type)
        val numberOfNotes = 12
        val startFromKey = allNotes.indexOf(key)
        return allNotes.subList(startFromKey, startFromKey + numberOfNotes)
    }

    fun getScaleInterval(type: Type): List<Int> {
        return when (type) {
            Major -> majorScaleInterval
            Minor -> minorScaleInterval
            Augmented -> TODO()
            Diminished -> TODO()
        }
    }

    private fun notesForScale(key: Note, type: Type = Major): List<Note> {
        return when (type) {
            in listOf(Major, Diminished, Augmented) -> {
                when (key) {
                    in listOf(GFlat, CFlat) -> allNotesWithFlatsAlt
                    CSharp -> allNotesWithSharpsAlt
                    in listOf(C, G, D, A, E, B, FSharp) -> allNotesWithSharps
                    else -> allNotesWithFlats
                }
            }
            Minor -> {
                when (key) {
                    in listOf(A, E, B, FSharp, CSharp, GSharp) -> allNotesWithSharps
                    else -> allNotesWithFlats
                }
            }
            else -> TODO()
        }
    }

    fun getScaleChords(type: Type): List<Type> {
        return when (type) {
            Major -> majorScaleChords
            Minor -> minorScaleChords
            Augmented -> TODO()
            Diminished -> TODO()
        }
    }


}