package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Progression.*
import com.seon.guitarpractice.chord.model.MajorChord
import com.seon.guitarpractice.chord.model.MinorChord
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScaleServiceTest {

    private val scaleService = ScaleService()

    @Test
    fun `get interval G | D`() {
        val key = G
        val progressions = listOf(I, V)
        val chords = scaleService.getChordInterval(key, progressions)

        assertThat(chords).isEqualTo(listOf(
                MajorChord(G),
                MajorChord(D))
        )
    }

    @Test
    fun `get interval C | Bb | Ab | G `() {
        val key = C
        val progressions = listOf(i, VII, VI, V)
        val chords = scaleService.getChordInterval(key, progressions)

        assertThat(chords).isEqualTo(listOf(
                MinorChord(C),
                MajorChord(BFlat),
                MajorChord(AFlat),
                MinorChord(G))
        )
    }

    @Test
    fun `get interval D | A | Bm | F#m | G | F#m | G | A`() {
        val key = D
        val progressions = listOf(I, V, vi, iii, IV, iii, IV, v)
        val chords = scaleService.getChordInterval(key, progressions)

        assertThat(chords).isEqualTo(listOf(
                MajorChord(D),
                MajorChord(A),
                MinorChord(B),
                MinorChord(FSharp),
                MajorChord(G),
                MinorChord(FSharp),
                MajorChord(G),
                MajorChord(A)
        ))
    }
}