package com.seon.guitarpractice.chord.service

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.chord.model.DiminishedChord
import com.seon.guitarpractice.chord.model.MajorChord
import com.seon.guitarpractice.chord.model.MinorChord
import com.seon.guitarpractice.chord.model.Chord

class ChordService {

    fun chordFinder(root: Note, third: Note, fifth: Note): Chord {
        val allChord = listOf(MajorChord(root), MinorChord(root), DiminishedChord(root))
        return allChord.first { chord ->
            chord.notes().containsAll(listOf(root, third, fifth))
        }
    }
}
