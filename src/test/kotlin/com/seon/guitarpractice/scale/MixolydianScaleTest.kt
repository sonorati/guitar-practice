package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MixolydianScaleTest {

    @Test
    fun `should get notes and chords for C mixolydian mode`() {
        val mixolydian = MixolydianScale(C)
        assertThat(mixolydian.notes()).isEqualTo(listOf(C, D, E, F, G, A, BFlat))
    }

    @Test
    fun `should get notes and chords for mixolydian mode`() {
        val mixolydian = MixolydianScale(G)
        assertThat(mixolydian.notes()).isEqualTo(listOf(G, A, B, C, D, E, F))
    }
}