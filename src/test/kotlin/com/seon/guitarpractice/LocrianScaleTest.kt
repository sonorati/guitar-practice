package com.seon.guitarpractice

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.scale.LocrianScale
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LocrianScaleTest {

    @Test
    fun `should get notes and chords for locrian mode`() {
        val locrian = LocrianScale(G)

        assertThat(locrian.notes).isEqualTo(listOf(G, AFlat, BFlat, C, DFlat, EFlat, F))

    }
}