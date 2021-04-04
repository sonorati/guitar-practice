package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DiminishedChordTest {

    @Test
    fun `should get B diminished`() {
        val bDiminished = DiminishedChord(B)
        assertThat(bDiminished.name()).isEqualTo("Bdim")
        assertThat(bDiminished.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, MINOR_FIFTH))
        assertThat(bDiminished.notes()).isEqualTo(listOf(B, D, F))
    }

    @Test
    fun `should get A#o diminished`() {
        val aSharpDiminished = DiminishedChord(ASharp)
        assertThat(aSharpDiminished.name()).isEqualTo("A#dim")
        assertThat(aSharpDiminished.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, MINOR_FIFTH))
        assertThat(aSharpDiminished.notes()).isEqualTo(listOf(ASharp, CSharp, E))

    }

    @Test
    fun `should get D#o`() {
        val dSharpDiminished = DiminishedChord(DSharp)
        assertThat(dSharpDiminished.name()).isEqualTo("D#dim")
        assertThat(dSharpDiminished.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, MINOR_FIFTH))
        assertThat(dSharpDiminished.notes()).isEqualTo(listOf(DSharp, FSharp, A))
    }
}