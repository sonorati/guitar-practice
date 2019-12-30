package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhrygianScaleTest {

    @Test
    fun `should get notes and chords for phrygian mode`() {
        val phrygian = PhrygianScale(G)

        assertThat(phrygian.notes).isEqualTo(listOf(G, AFlat, BFlat, C, D, EFlat, F))

    }
}