package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.chord.model.DiminishedChord
import com.seon.guitarpractice.chord.model.MajorChord
import com.seon.guitarpractice.chord.model.MinorChord
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
        assertThat(cMinorScale.notes()).isEqualTo(listOf(C, D, EFlat, F, G, AFlat, BFlat))
    }

    @Test
    fun `should get E minor notes and chords`() {
        val eMinor = MinorScale(E)
        assertThat(eMinor.chords())
                .isEqualTo(listOf(
                        MinorChord(E),
                        DiminishedChord(FSharp),
                        MajorChord(G),
                        MinorChord(A),
                        MinorChord(B),
                        MajorChord(C),
                        MajorChord(D)
                )
                )
        assertThat(eMinor.notes()).isEqualTo(listOf(E, FSharp, G, A, B, C, D))
    }
}
