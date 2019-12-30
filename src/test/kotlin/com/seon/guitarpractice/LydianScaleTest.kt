package com.seon.guitarpractice

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.scale.LydianScale
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LydianScaleTest {

    @Test
    fun `should get notes and chords for lydian mode`() {
        val lydian = LydianScale(G)

        assertThat(lydian.notes).isEqualTo(listOf(G, A, B, CSharp, D, E, FSharp))

    }
}