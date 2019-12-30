package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinorPentatonicScaleTest {

    @Test
    fun `should get notes and chords for minor pentatonic mode`() {
        val pentatonic = MinorPentatonicScale(C)
        assertThat(pentatonic.notes()).isEqualTo(listOf(C, EFlat, F, G, BFlat))

    }
}