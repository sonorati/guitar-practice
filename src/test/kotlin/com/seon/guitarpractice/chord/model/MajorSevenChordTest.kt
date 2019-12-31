package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MajorSevenChordTest {

    @Test
    fun `should get Cmaj7 chord`() {
        val chord = MajorSevenChord(C)

        assertThat(chord.name()).isEqualTo("Cmaj7")
        assertThat(chord.notes()).isEqualTo(listOf(C, E, G, B))
    }
}