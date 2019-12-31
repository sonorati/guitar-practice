package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinorSevenChordTest {

    @Test
    fun `should get Cm7 chord`() {
        val chord = MinorSevenChord(C)

        assertThat(chord.name()).isEqualTo("Cm7")
        assertThat(chord.notes()).isEqualTo(listOf(C, EFlat, G, BFlat))
    }
}