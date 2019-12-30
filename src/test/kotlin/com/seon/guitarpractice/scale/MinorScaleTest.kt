package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.chord.DiminishedChord
import com.seon.guitarpractice.chord.MajorChord
import com.seon.guitarpractice.chord.MinorChord
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinorScaleTest {

    @Test
    fun `should get C minor chords`() {
        val cMinorScale = MinorScale(C)
        assertThat(cMinorScale.chords())
                .isEqualTo(listOf(
                        MinorChord(C),
                        DiminishedChord(D),
                        MajorChord(EFlat),
                        MinorChord(F),
                        MinorChord(G),
                        MajorChord(AFlat),
                        MajorChord(BFlat)
                )
                )
        assertThat(cMinorScale.notes).isEqualTo(listOf(C, D, EFlat, F, G, AFlat, BFlat))
    }
}
