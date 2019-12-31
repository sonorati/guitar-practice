package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.chord.model.DiminishedChord
import com.seon.guitarpractice.chord.model.MajorChord
import com.seon.guitarpractice.chord.model.MinorChord
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LocrianScaleTest {

    @Test
    fun `should get notes and chords for locrian mode`() {
        val locrian = LocrianScale(G)

        assertThat(locrian.notes()).isEqualTo(listOf(G, AFlat, BFlat, C, DFlat, EFlat, F))
        assertThat(locrian.chords()).isEqualTo(listOf(
                DiminishedChord(G),
                MajorChord(AFlat),
                MinorChord(BFlat),
                MinorChord(C),
                MajorChord(DFlat),
                MajorChord(EFlat),
                MinorChord(F)
        ))
    }
}