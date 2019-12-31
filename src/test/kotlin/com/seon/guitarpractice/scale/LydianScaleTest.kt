package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.chord.model.DiminishedChord
import com.seon.guitarpractice.chord.model.MajorChord
import com.seon.guitarpractice.chord.model.MinorChord
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LydianScaleTest {

    @Test
    fun `should get notes and chords for G lydian mode`() {
        val lydian = LydianScale(G)

        assertThat(lydian.notes()).isEqualTo(listOf(G, A, B, CSharp, D, E, FSharp))

    }

    @Test
    fun `should get notes and chords for C lydian mode`() {
        val lydian = LydianScale(C)
        val fSharpDim = DiminishedChord(FSharp)

        assertThat(lydian.notes()).isEqualTo(listOf(C, D, E, FSharp, G, A, B))
        assertThat(lydian.chords()).isEqualTo(listOf(
                MajorChord(C),
                MajorChord(D),
                MinorChord(E),
                fSharpDim,
                MajorChord(G),
                MinorChord(A),
                MinorChord(B)
        ))
        assertThat(fSharpDim.notes()).isEqualTo(listOf(FSharp, A, C))
    }
}