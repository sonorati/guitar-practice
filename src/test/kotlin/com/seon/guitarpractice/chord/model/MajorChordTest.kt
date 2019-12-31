package com.seon.guitarpractice.chord.model

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.chord.model.MajorChord
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MajorChordTest {

//    @Test
//    fun `should get C Major by name and C E G interval`() {
//        val cMajor = MajorChord(C)
//
//        assertThat(cMajor.name()).isEqualTo("C")
//        assertThat(cMajor.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
//        assertThat(cMajor.notes()).isEqualTo(listOf(C, E, G))
//    }
//
//    @Test
//    fun `should get Gb Major`() {
//        val gFlatMajor = MajorChord(GFlat)
//
//        assertThat(gFlatMajor.name()).isEqualTo("G♭")
//        assertThat(gFlatMajor.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
//        assertThat(gFlatMajor.notes()).isEqualTo(listOf(GFlat, BFlat, DFlat))
//    }

    @Test
    fun `should get C#`() {
        val cSharp = MajorChord(CSharp)
        assertThat(cSharp.name()).isEqualTo("C#")
        assertThat(cSharp.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
        assertThat(cSharp.notes()).isEqualTo(listOf(CSharp, ESharp, GSharp))
    }


//    @Test
//    fun `should get Cb`() {
//        val cFlatMajor = MajorChord(CFlat)
//        assertThat(cFlatMajor.name()).isEqualTo("C♭")
//        assertThat(cFlatMajor.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
//        assertThat(cFlatMajor.notes()).isEqualTo(listOf(CFlat, EFlat, GFlat))
//    }
}