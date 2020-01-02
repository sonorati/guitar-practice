package com.seon.guitarpractice.chord.service

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.chord.model.*

class ChordService {

    fun chordFinder(root: Note, third: Note, fifth: Note): Chord {
        val allChord = listOf(MajorChord(root), MinorChord(root), AugmentedChord(root))
        return generateChord(allChord, listOf(root, third, fifth))
    }

    fun chordFinder(root: Note, third: Note, fifth: Note, seventh: Note): Chord {
        val allChord = listOf(MajorSevenChord(root), MinorSevenChord(root), DiminishedChord(root))
        return generateChord(allChord, listOf(root, third, fifth, seventh))
    }

    private fun generateChord(allChord: List<Chord>, list: List<Note>): Chord {
        return allChord.first { chord ->
            chord.notes().containsAll(list)
        }
    }
}
