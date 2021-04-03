package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.chord.model.DiminishedChord
import com.seon.guitarpractice.chord.model.DominantChord
import com.seon.guitarpractice.chord.model.MajorChord
import com.seon.guitarpractice.chord.model.MinorChord
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MajorScaleTest {

    @Test
    fun `should get string with list of chords`() {
        val cMajor = MajorScale(C)
        assertThat(cMajor.scaleChords()).isEqualTo("| C |  Dm |  Em |  F |  G |  Am |  Bo | ")
    }

    @Test
    fun `should get C major chords`() {
        val cMajorScale = MajorScale(C)
        assertThat(cMajorScale.chords())
                .isEqualTo(listOf(
                        MajorChord(C),
                        MinorChord(D),
                        MinorChord(E),
                        MajorChord(F),
                        MajorChord(G),
                        MinorChord(A),
                        DiminishedChord(B)
                )
                )
        assertThat(cMajorScale.dominant()).isEqualTo(DominantChord(G))
        assertThat(cMajorScale.relativeMinor()).isEqualTo(MinorChord(A))
        assertThat(cMajorScale.notes()).isEqualTo(listOf(C, D, E, F, G, A, B))
    }

    @Test
    fun `should get G major chords`() {
        val gMajorScale = MajorScale(G)
        assertThat(gMajorScale.chords())
                .isEqualTo(listOf(
                        MajorChord(G),
                        MinorChord(A),
                        MinorChord(B),
                        MajorChord(C),
                        MajorChord(D),
                        MinorChord(E),
                        DiminishedChord(FSharp)
                )
                )
        assertThat(gMajorScale.notes()).isEqualTo(listOf(G, A, B, C, D, E, FSharp))
    }

    @Test
    fun `should get A# major chords`() {
        val scale = MajorScale(ASharp)
        assertThat(scale.chords())
                .isEqualTo(listOf(
                        MajorChord(ASharp),
                        MinorChord(BSharp),
                        MinorChord(CSharpSharp),
                        MajorChord(DSharp),
                        MajorChord(ESharp),
                        MinorChord(FSharpSharp),
                        DiminishedChord(GSharpSharp)
                )
                )
        assertThat(scale.notes()).isEqualTo(listOf(ASharp, BSharp, CSharpSharp, DSharp, ESharp, FSharpSharp, GSharpSharp))
    }

    @Test
    fun `should get D major chords`() {
        val dMajorScale = MajorScale(D)
        assertThat(dMajorScale.chords())
                .isEqualTo(listOf(
                        MajorChord(D),
                        MinorChord(E),
                        MinorChord(FSharp),
                        MajorChord(G),
                        MajorChord(A),
                        MinorChord(B),
                        DiminishedChord(CSharp)
                )
                )
        assertThat(dMajorScale.notes()).isEqualTo(listOf(D, E, FSharp, G, A, B, CSharp))
    }

    @Test
    fun `should get A major chords`() {
        val aMajorScale = MajorScale(A)
        assertThat(aMajorScale.chords())
                .isEqualTo(listOf(
                        MajorChord(A),
                        MinorChord(B),
                        MinorChord(CSharp),
                        MajorChord(D),
                        MajorChord(E),
                        MinorChord(FSharp),
                        DiminishedChord(GSharp)
                )
                )
        assertThat(aMajorScale.notes()).isEqualTo(listOf(A, B, CSharp, D, E, FSharp, GSharp))
    }

    @Test
    fun `should get E major chords`() {
        val eMajorScale = MajorScale(E)
        assertThat(eMajorScale.chords())
                .isEqualTo(listOf(
                        MajorChord(E),
                        MinorChord(FSharp),
                        MinorChord(GSharp),
                        MajorChord(A),
                        MajorChord(B),
                        MinorChord(CSharp),
                        DiminishedChord(DSharp)
                )
                )
        assertThat(eMajorScale.notes()).isEqualTo(listOf(E, FSharp, GSharp, A, B, CSharp, DSharp))
    }

    @Test
    fun `should get B major chords`() {
        val bMajorScale = MajorScale(B)
        assertThat(bMajorScale.chords())
                .isEqualTo(listOf(
                        MajorChord(B),
                        MinorChord(CSharp),
                        MinorChord(DSharp),
                        MajorChord(E),
                        MajorChord(FSharp),
                        MinorChord(GSharp),
                        DiminishedChord(ASharp)
                )
                )
        assertThat(bMajorScale.notes()).isEqualTo(listOf(B, CSharp, DSharp, E, FSharp, GSharp, ASharp))
    }

    @Test
    fun `should get F# major chords`() {
        val fSharpMajorScale = MajorScale(FSharp)
        assertThat(fSharpMajorScale.chords())
                .isEqualTo(listOf(
                        MajorChord(FSharp),
                        MinorChord(GSharp),
                        MinorChord(ASharp),
                        MajorChord(B),
                        MajorChord(CSharp),
                        MinorChord(DSharp),
                        DiminishedChord(ESharp)
                )
                )
        assertThat(fSharpMajorScale.notes()).isEqualTo(listOf(FSharp, GSharp, ASharp, B, CSharp, DSharp, ESharp))
    }

    @Test
    fun `should get C# major chords`() {
        val cSharpMajorScale = MajorScale(CSharp)
        assertThat(cSharpMajorScale.chords())
                .isEqualTo(listOf(
                        MajorChord(CSharp),
                        MinorChord(DSharp),
                        MinorChord(ESharp),
                        MajorChord(FSharp),
                        MajorChord(GSharp),
                        MinorChord(ASharp),
                        DiminishedChord(BSharp)
                )
                )
        assertThat(cSharpMajorScale.notes()).isEqualTo(listOf(CSharp, DSharp, ESharp, FSharp, GSharp, ASharp, BSharp))
    }

    @Test
    fun `should get F major chords`() {
        val fMajorScale = MajorScale(F)
        assertThat(fMajorScale.chords())
                .isEqualTo(listOf(
                        MajorChord(F),
                        MinorChord(G),
                        MinorChord(A),
                        MajorChord(BFlat),
                        MajorChord(C),
                        MinorChord(D),
                        DiminishedChord(E)
                )
                )
        assertThat(fMajorScale.notes()).isEqualTo(listOf(F, G, A, BFlat, C, D, E))
    }

    @Test
    fun `should get Bb major chords`() {
        val eFlatMajor = MajorScale(BFlat)
        assertThat(eFlatMajor.chords())
                .isEqualTo(listOf(
                        MajorChord(BFlat),
                        MinorChord(C),
                        MinorChord(D),
                        MajorChord(EFlat),
                        MajorChord(F),
                        MinorChord(G),
                        DiminishedChord(A)
                )
                )
        assertThat(eFlatMajor.notes()).isEqualTo(listOf(BFlat, C, D, EFlat, F, G, A))
    }

    @Test
    fun `should get Eb major chords`() {
        val eFlatMajor = MajorScale(EFlat)
        assertThat(eFlatMajor.chords())
                .isEqualTo(listOf(
                        MajorChord(EFlat),
                        MinorChord(F),
                        MinorChord(G),
                        MajorChord(AFlat),
                        MajorChord(BFlat),
                        MinorChord(C),
                        DiminishedChord(D)
                )
                )
        assertThat(eFlatMajor.notes()).isEqualTo(listOf(EFlat, F, G, AFlat, BFlat, C, D))
    }

    @Test
    fun `should get Ab major chords`() {
        val aFlatMajor = MajorScale(AFlat)
        assertThat(aFlatMajor.chords())
                .isEqualTo(listOf(
                        MajorChord(AFlat),
                        MinorChord(BFlat),
                        MinorChord(C),
                        MajorChord(DFlat),
                        MajorChord(EFlat),
                        MinorChord(F),
                        DiminishedChord(G)
                )
                )
        assertThat(aFlatMajor.notes()).isEqualTo(listOf(AFlat, BFlat, C, DFlat, EFlat, F, G))
    }

    @Test
    fun `should get Db major chords`() {
        val dFlatMajor = MajorScale(DFlat)
        assertThat(dFlatMajor.chords())
                .isEqualTo(listOf(
                        MajorChord(DFlat),
                        MinorChord(EFlat),
                        MinorChord(F),
                        MajorChord(GFlat),
                        MajorChord(AFlat),
                        MinorChord(BFlat),
                        DiminishedChord(C)
                )
                )
        assertThat(dFlatMajor.notes()).isEqualTo(listOf(DFlat, EFlat, F, GFlat, AFlat, BFlat, C))
    }

    @Test
    fun `should get Gb major chords`() {
        val gFlatMajor = MajorScale(GFlat)
        assertThat(gFlatMajor.chords())
                .isEqualTo(listOf(
                        MajorChord(GFlat),
                        MinorChord(AFlat),
                        MinorChord(BFlat),
                        MajorChord(CFlat),
                        MajorChord(DFlat),
                        MinorChord(EFlat),
                        DiminishedChord(F)
                )
                )
        assertThat(gFlatMajor.notes()).isEqualTo(listOf(GFlat, AFlat, BFlat, CFlat, DFlat, EFlat, F))
    }

    @Test
    fun `should get Cb major chords`() {
        val cFlatMajorScale = MajorScale(CFlat)
        assertThat(cFlatMajorScale.chords())
                .isEqualTo(listOf(
                        MajorChord(CFlat),
                        MinorChord(DFlat),
                        MinorChord(EFlat),
                        MajorChord(FFlat),
                        MajorChord(GFlat),
                        MinorChord(AFlat),
                        DiminishedChord(BFlat)
                )
                )
        assertThat(cFlatMajorScale.notes()).isEqualTo(listOf(CFlat, DFlat, EFlat, FFlat, GFlat, AFlat, BFlat))
    }


    @Test
    fun `should be true that C major is in C major scale`() {
        val cMajorScale = MajorScale(C)

        val isChordInScale = cMajorScale.isChordInScale(MajorChord(C))

        assertThat(isChordInScale).isTrue()
    }
}
