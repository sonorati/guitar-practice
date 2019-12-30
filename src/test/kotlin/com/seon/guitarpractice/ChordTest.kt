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
        val dSharpMinor = Chord(DSharp, Minor)
        assertThat(dSharpMinor.name).isEqualTo("D#m")
        assertThat(dSharpMinor.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
        assertThat(dSharpMinor.notes).isEqualTo(listOf(DSharp, FSharp, ASharp))
    }

    @Test
    fun `should get C#m`() {
        val cSharpMinor = Chord(CSharp, Minor)
        assertThat(cSharpMinor.name).isEqualTo("C#m")
        assertThat(cSharpMinor.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
        assertThat(cSharpMinor.notes).isEqualTo(listOf(CSharp, E, GSharp))
    }

    @Test
    fun `should get C#`() {
        val cSharpMinor = Chord(CSharp, Major)
        assertThat(cSharpMinor.name).isEqualTo("C#")
        assertThat(cSharpMinor.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
        assertThat(cSharpMinor.notes).isEqualTo(listOf(CSharp, ESharp, GSharp))
    }

    @Test
    fun `should get E#m`() {
        val eSharpMinor = Chord(ESharp, Minor)
        assertThat(eSharpMinor.name).isEqualTo("E#m")
        assertThat(eSharpMinor.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
        assertThat(eSharpMinor.notes).isEqualTo(listOf(ESharp, GSharp, BSharp))
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