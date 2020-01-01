package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Progression
import com.seon.guitarpractice.Progression.*
import com.seon.guitarpractice.chord.model.Chord

class ScaleService {

    fun getChordInterval(key: Note, progressions: List<Progression>): List<Chord> {
        val scale = if (progressions.contains(i)) {
            MinorScale(key)
        } else MajorScale(key)

        val chords = scale.chords()

        return progressions.map { progression -> chords[progression.position] }
    }
}