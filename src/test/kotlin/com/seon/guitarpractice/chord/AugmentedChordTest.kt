package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AugmentedChordTest {

    @Test
    fun `should get C Augmented`() {
        val bDiminished = AugmentedChord(C)
        assertThat(bDiminished.name()).isEqualTo("C aug")
        assertThat(bDiminished.intervals).isEqualTo(listOf(ROOT, THIRD, AUGMENTED_FIFTH))
        assertThat(bDiminished.notes()).isEqualTo(listOf(C, E, GSharp))
    }

}