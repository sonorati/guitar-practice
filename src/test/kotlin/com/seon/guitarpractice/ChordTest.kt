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
        assertThat(cMajor.notes).isEqualTo(listOf(C, E, G))
    }

    @Test
    fun `should get Gb Major`() {
        val cMajor = Chord(root = GFlat, type = Major)

        assertThat(cMajor.name).isEqualTo("G♭")
        assertThat(cMajor.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
        assertThat(cMajor.notes).isEqualTo(listOf(GFlat, BFlat, DFlat))
    }

    @Test
    fun `should get A Minor by name and A C E interval`() {
        val aMinor = Chord(root = A, type = Minor)
        assertThat(aMinor.name).isEqualTo("Am")
        assertThat(aMinor.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
        assertThat(aMinor.notes).isEqualTo(listOf(A, C, E))
    }

    @Test
    fun `should get B diminished`() {
        val bDiminished = Chord(root = B, type = Diminished)
        assertThat(bDiminished.name).isEqualTo("Bo")
        assertThat(bDiminished.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, MINOR_FIFTH))
        assertThat(bDiminished.notes).isEqualTo(listOf(B, D, F))
    }

    @Test
    fun `should get A#o diminished`() {
        val aSharpDiminished = Chord(root = ASharp, type = Diminished)
        assertThat(aSharpDiminished.name).isEqualTo("A#o")
        assertThat(aSharpDiminished.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, MINOR_FIFTH))
        assertThat(aSharpDiminished.notes).isEqualTo(listOf(ASharp, CSharp, E))

    }

    @Test
    fun `should get G7`() {
        val bDiminished = Chord(G, Dominant)
        assertThat(bDiminished.name).isEqualTo("G7")
        assertThat(bDiminished.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH, MINOR_SEVENTH))
        assertThat(bDiminished.notes).isEqualTo(listOf(G, B, D, F))
    }

    @Test
    fun `should get D#m`() {
        val bDiminished = Chord(DSharp, Minor)
        assertThat(bDiminished.name).isEqualTo("D#m")
        assertThat(bDiminished.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
        assertThat(bDiminished.notes).isEqualTo(listOf(DSharp, FSharp, ASharp))
    }

    @Test
    fun `should get D#o`() {
        val dSharpDiminished = Chord(DSharp, Diminished)
        assertThat(dSharpDiminished.name).isEqualTo("D#o")
        assertThat(dSharpDiminished.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, MINOR_FIFTH))
        assertThat(dSharpDiminished.notes).isEqualTo(listOf(DSharp, FSharp, A))
    }

    @Test
    fun `should get Cb`() {
        val cFlatMajor = Chord(CFlat, Major)
        assertThat(cFlatMajor.name).isEqualTo("C♭")
        assertThat(cFlatMajor.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
        assertThat(cFlatMajor.notes).isEqualTo(listOf(CFlat, EFlat, GFlat))
    }
}