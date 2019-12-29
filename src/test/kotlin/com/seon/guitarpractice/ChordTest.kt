package com.seon.guitarpractice

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChordTest {

    @Test
    fun `should get C Major by name and C E G interval`() {
        val cMajor = Chord(root = C, type = Major)

        assertThat(cMajor.name).isEqualTo("C")
        assertThat(cMajor.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
        assertThat(cMajor.intervalNotes()).isEqualTo(listOf(C, E, G))
    }

    @Test
    fun `should get Gb Major`() {
        val cMajor = Chord(root = GFlat, type = Major)

        assertThat(cMajor.name).isEqualTo("G♭")
        assertThat(cMajor.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
        assertThat(cMajor.intervalNotes()).isEqualTo(listOf(GFlat, BFlat, DFlat))
    }

    @Test
    fun `should get A Minor by name and A C E interval`() {
        val aMinor = Chord(root = A, type = Minor)
        assertThat(aMinor.name).isEqualTo("Am")
        assertThat(aMinor.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
        assertThat(aMinor.intervalNotes()).isEqualTo(listOf(A, C, E))
    }

    @Test
    fun `should get B diminished`() {
        val bDiminished = Chord(root = B, type = Diminished)
        assertThat(bDiminished.name).isEqualTo("Bo")
        assertThat(bDiminished.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, MINOR_FIFTH))
        assertThat(bDiminished.intervalNotes()).isEqualTo(listOf(B, D, F))
    }

    @Test
    fun `should get G7`() {
        val bDiminished = Chord(G, Dominant)
        assertThat(bDiminished.name).isEqualTo("G7")
        assertThat(bDiminished.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH, MINOR_SEVENTH))
        assertThat(bDiminished.intervalNotes()).isEqualTo(listOf(G, B, D, F))
    }
}