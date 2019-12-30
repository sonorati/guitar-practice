package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DorianScaleTest {

    @Test
    fun `should get notes and chords for Dorian mode`() {
        val dorian = DorianScale(G)

        assertThat(dorian.notes()).isEqualTo(listOf(G, A, BFlat, C, D, E, F))

    }
}