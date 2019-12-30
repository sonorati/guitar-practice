package com.seon.guitarpractice

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type.*
import com.seon.guitarpractice.scale.MinorScale
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinorScaleTest {

    @Test
    fun `should get C minor chords`() {
        val cMinorScale = MinorScale(C)
        assertThat(cMinorScale.chords)
                .isEqualTo(listOf(
                        Chord(C, Minor),
                        Chord(D, Diminished),
                        Chord(EFlat, Major),
                        Chord(F, Minor),
                        Chord(G, Minor),
                        Chord(AFlat, Major),
                        Chord(BFlat, Major)
                )
                )
        assertThat(cMinorScale.notes).isEqualTo(listOf(C, D, EFlat, F, G, AFlat, BFlat))
    }
}
