package com.seon.guitarpractice

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScaleTest {

    @Test
    fun `should get C major chords`() {
        val cMajorScale = Scale(C, Major)
        assertThat(cMajorScale.chords)
                .isEqualTo(listOf(
                        Chord(C, Major),
                        Chord(D, Minor),
                        Chord(E, Minor),
                        Chord(F, Major),
                        Chord(G, Major),
                        Chord(A, Minor),
                        Chord(B, Diminished)
                )
                )
        assertThat(cMajorScale.dominant()).isEqualTo(Chord(G, Major))
        assertThat(cMajorScale.relativeMinor()).isEqualTo(Chord(A, Minor))
        assertThat(cMajorScale.notes).isEqualTo(listOf(C, D, E, F, G, A, B))
    }

    @Test
    fun `should get G major chords`() {
        val gMajorScale = Scale(G, Major)
        assertThat(gMajorScale.chords)
                .isEqualTo(listOf(
                        Chord(G, Major),
                        Chord(A, Minor),
                        Chord(B, Minor),
                        Chord(C, Major),
                        Chord(D, Major),
                        Chord(E, Minor),
                        Chord(FSharp, Diminished)
                )
                )
        assertThat(gMajorScale.notes).isEqualTo(listOf(G, A, B, C, D, E, FSharp))
    }

    @Test
    fun `should get D major chords`() {
        val dMajorScale = Scale(D, Major)
        assertThat(dMajorScale.chords)
                .isEqualTo(listOf(
                        Chord(D, Major),
                        Chord(E, Minor),
                        Chord(FSharp, Minor),
                        Chord(G, Major),
                        Chord(A, Major),
                        Chord(B, Minor),
                        Chord(CSharp, Diminished)
                )
                )
        assertThat(dMajorScale.notes).isEqualTo(listOf(D, E, FSharp, G, A, B, CSharp))
    }

    @Test
    fun `should get A major chords`() {
        val aMajorScale = Scale(A, Major)
        assertThat(aMajorScale.chords)
                .isEqualTo(listOf(
                        Chord(A, Major),
                        Chord(B, Minor),
                        Chord(CSharp, Minor),
                        Chord(D, Major),
                        Chord(E, Major),
                        Chord(FSharp, Minor),
                        Chord(GSharp, Diminished)
                )
                )
        assertThat(aMajorScale.notes).isEqualTo(listOf(A, B, CSharp, D, E, FSharp, GSharp))
    }

    @Test
    fun `should get E major chords`() {
        val eMajorScale = Scale(E, Major)
        assertThat(eMajorScale.chords)
                .isEqualTo(listOf(
                        Chord(E, Major),
                        Chord(FSharp, Minor),
                        Chord(GSharp, Minor),
                        Chord(A, Major),
                        Chord(B, Major),
                        Chord(CSharp, Minor),
                        Chord(DSharp, Diminished)
                )
                )
        assertThat(eMajorScale.notes).isEqualTo(listOf(E, FSharp, GSharp, A, B, CSharp, DSharp))
    }

    @Test
    fun `should get B major chords`() {
        val bMajorScale = Scale(B, Major)
        assertThat(bMajorScale.chords)
                .isEqualTo(listOf(
                        Chord(B, Major),
                        Chord(CSharp, Minor),
                        Chord(DSharp, Minor),
                        Chord(E, Major),
                        Chord(FSharp, Major),
                        Chord(GSharp, Minor),
                        Chord(ASharp, Diminished)
                )
                )
        assertThat(bMajorScale.notes).isEqualTo(listOf(B, CSharp, DSharp, E, FSharp, GSharp, ASharp))
    }

    @Test
    fun `should get F# major chords`() {
        val fSharpMajorScale = Scale(FSharp, Major)
        assertThat(fSharpMajorScale.chords)
                .isEqualTo(listOf(
                        Chord(FSharp, Major),
                        Chord(GSharp, Minor),
                        Chord(ASharp, Minor),
                        Chord(B, Major),
                        Chord(CSharp, Major),
                        Chord(DSharp, Minor),
                        Chord(F, Diminished)
                )
                )
        assertThat(fSharpMajorScale.notes).isEqualTo(listOf(FSharp, GSharp, ASharp, B, CSharp, DSharp, F))
    }

    @Test
    fun `should get C# major chords`() {
        val cSharpMajorScale = Scale(CSharp, Major)
        assertThat(cSharpMajorScale.chords)
                .isEqualTo(listOf(
                        Chord(CSharp, Major),
                        Chord(DSharp, Minor),
                        Chord(ESharp, Minor),
                        Chord(FSharp, Major),
                        Chord(GSharp, Major),
                        Chord(ASharp, Minor),
                        Chord(BSharp, Diminished)
                )
                )
        assertThat(cSharpMajorScale.notes).isEqualTo(listOf(CSharp, DSharp, ESharp, FSharp, GSharp, ASharp, BSharp))
    }

    @Test
    fun `should get F major chords`() {
        val fMajorScale = Scale(F, Major)
        assertThat(fMajorScale.chords)
                .isEqualTo(listOf(
                        Chord(F, Major),
                        Chord(G, Minor),
                        Chord(A, Minor),
                        Chord(BFlat, Major),
                        Chord(C, Major),
                        Chord(D, Minor),
                        Chord(E, Diminished)
                )
                )
        assertThat(fMajorScale.notes).isEqualTo(listOf(F, G, A, BFlat, C, D, E))
    }

    @Test
    fun `should get Bb major chords`() {
        val eFlatMajor = Scale(BFlat, Major)
        assertThat(eFlatMajor.chords)
                .isEqualTo(listOf(
                        Chord(BFlat, Major),
                        Chord(C, Minor),
                        Chord(D, Minor),
                        Chord(EFlat, Major),
                        Chord(F, Major),
                        Chord(G, Minor),
                        Chord(A, Diminished)
                )
                )
        assertThat(eFlatMajor.notes).isEqualTo(listOf(BFlat, C, D, EFlat, F, G, A))
    }

    @Test
    fun `should get Eb major chords`() {
        val eFlatMajor = Scale(EFlat, Major)
        assertThat(eFlatMajor.chords)
                .isEqualTo(listOf(
                        Chord(EFlat, Major),
                        Chord(F, Minor),
                        Chord(G, Minor),
                        Chord(AFlat, Major),
                        Chord(BFlat, Major),
                        Chord(C, Minor),
                        Chord(D, Diminished)
                )
                )
        assertThat(eFlatMajor.notes).isEqualTo(listOf(EFlat, F, G, AFlat, BFlat, C, D))
    }

    @Test
    fun `should get Ab major chords`() {
        val aFlatMajor = Scale(AFlat, Major)
        assertThat(aFlatMajor.chords)
                .isEqualTo(listOf(
                        Chord(AFlat, Major),
                        Chord(BFlat, Minor),
                        Chord(C, Minor),
                        Chord(DFlat, Major),
                        Chord(EFlat, Major),
                        Chord(F, Minor),
                        Chord(G, Diminished)
                )
                )
        assertThat(aFlatMajor.notes).isEqualTo(listOf(AFlat, BFlat, C, DFlat, EFlat, F, G))
    }

    @Test
    fun `should get Db major chords`() {
        val dFlatMajor = Scale(DFlat, Major)
        assertThat(dFlatMajor.chords)
                .isEqualTo(listOf(
                        Chord(DFlat, Major),
                        Chord(EFlat, Minor),
                        Chord(F, Minor),
                        Chord(GFlat, Major),
                        Chord(AFlat, Major),
                        Chord(BFlat, Minor),
                        Chord(C, Diminished)
                )
                )
        assertThat(dFlatMajor.notes).isEqualTo(listOf(DFlat, EFlat, F, GFlat, AFlat, BFlat, C))
    }

    @Test
    fun `should get Gb major chords`() {
        val gFlatMajor = Scale(GFlat, Major)
        assertThat(gFlatMajor.chords)
                .isEqualTo(listOf(
                        Chord(GFlat, Major),
                        Chord(AFlat, Minor),
                        Chord(BFlat, Minor),
                        Chord(CFlat, Major),
                        Chord(DFlat, Major),
                        Chord(EFlat, Minor),
                        Chord(F, Diminished)
                )
                )
        assertThat(gFlatMajor.notes).isEqualTo(listOf(GFlat, AFlat, BFlat, CFlat, DFlat, EFlat, F))
    }

    @Test
    fun `should get Cb major chords`() {
        val cFlatMajorScale = Scale(CFlat, Major)
        assertThat(cFlatMajorScale.chords)
                .isEqualTo(listOf(
                        Chord(CFlat, Major),
                        Chord(DFlat, Minor),
                        Chord(EFlat, Minor),
                        Chord(FFlat, Major),
                        Chord(GFlat, Major),
                        Chord(AFlat, Minor),
                        Chord(BFlat, Diminished)
                )
                )
        assertThat(cFlatMajorScale.notes).isEqualTo(listOf(CFlat, DFlat, EFlat, FFlat, GFlat, AFlat, BFlat))
    }

    @Test
    fun `should get C minor chords`() {
        val cMinorScale = Scale(C, Minor)
        assertThat(cMinorScale.chords)
                .isEqualTo(listOf(
                        Chord(C, Minor),
                        Chord(D, Diminished),
                        Chord(EFlat, Major),
                        Chord(F, Minor),
                        Chord(G, Minor),
                        Chord(AFlat, Major),
                        Chord(BFlat, Major)
                )
                )
        assertThat(cMinorScale.notes).isEqualTo(listOf(C, D, EFlat, F, G, AFlat, BFlat))
    }

    @Test
    fun `should be true that C major is in C major scale`() {
        val cMajorScale = Scale(C, Major)

        val isChordInScale = cMajorScale.isChordInScale(Chord(C, Major))

        assertThat(isChordInScale).isTrue()
    }
}
