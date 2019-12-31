package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.chord.model.MinorChord
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinorChordTest {

    @Test
    fun `should get A Minor by name and A C E interval`() {
        val aMinor = MinorChord(A)
        assertThat(aMinor.name()).isEqualTo("Am")
        assertThat(aMinor.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
        assertThat(aMinor.notes()).isEqualTo(listOf(A, C, E))
    }

    @Test
    fun `should get D#m`() {
        val dSharpMinor = MinorChord(DSharp)
        assertThat(dSharpMinor.name()).isEqualTo("D#m")
        assertThat(dSharpMinor.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
        assertThat(dSharpMinor.notes()).isEqualTo(listOf(DSharp, FSharp, ASharp))
    }

    @Test
    fun `should get C#m`() {
        val cSharpMinor = MinorChord(CSharp)
        assertThat(cSharpMinor.name()).isEqualTo("C#m")
        assertThat(cSharpMinor.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
        assertThat(cSharpMinor.notes()).isEqualTo(listOf(CSharp, E, GSharp))
    }

    @Test
    fun `should get E#m`() {
        val eSharpMinor = MinorChord(ESharp)
        assertThat(eSharpMinor.name()).isEqualTo("E#m")
        assertThat(eSharpMinor.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
        assertThat(eSharpMinor.notes()).isEqualTo(listOf(ESharp, GSharp, BSharp))
    }

}