package com.seon.guitarpractice

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type.*
import com.seon.guitarpractice.scale.MajorScale
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MajorScaleTest {

    @Test
    fun `should get C major chords`() {
        val cMajorScale = MajorScale(C)
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
        assertThat(cMajorScale.dominant()).isEqualTo(Chord(G, Dominant))
        assertThat(cMajorScale.relativeMinor()).isEqualTo(Chord(A, Minor))
        assertThat(cMajorScale.notes).isEqualTo(listOf(C, D, E, F, G, A, B))
    }

    @Test
    fun `should get G major chords`() {
        val gMajorScale = MajorScale(G)
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
        val dMajorScale = MajorScale(D)
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
        val aMajorScale = MajorScale(A)
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
        val eMajorScale = MajorScale(E)
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
        val bMajorScale = MajorScale(B)
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
        val fSharpMajorScale = MajorScale(FSharp)
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
        val cSharpMajorScale = MajorScale(CSharp)
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
        val fMajorScale = MajorScale(F)
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
        val eFlatMajor = MajorScale(BFlat)
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
        val eFlatMajor = MajorScale(EFlat)
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
        val aFlatMajor = MajorScale(AFlat)
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
        val dFlatMajor = MajorScale(DFlat)
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
        val gFlatMajor = MajorScale(GFlat)
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
        val cFlatMajorScale = MajorScale(CFlat)
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
    fun `should be true that C major is in C major scale`() {
        val cMajorScale = MajorScale(C)

        val isChordInScale = cMajorScale.isChordInScale(Chord(C, Major))

        assertThat(isChordInScale).isTrue()
    }
}
