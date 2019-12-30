package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DominantChordTest {

    @Test
    fun `should get C dominant`() {
        val bDiminished = DominantChord(C)
        assertThat(bDiminished.name()).isEqualTo("C7")
        assertThat(bDiminished.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH, MINOR_SEVENTH))
        assertThat(bDiminished.notes()).isEqualTo(listOf(C, E, G, ASharp))
    }

    @Test
    fun `should get G7`() {
        val bDiminished = DominantChord(G)
        assertThat(bDiminished.name()).isEqualTo("G7")
        assertThat(bDiminished.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH, MINOR_SEVENTH))
        assertThat(bDiminished.notes()).isEqualTo(listOf(G, B, D, F))
    }

}