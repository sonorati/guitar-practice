package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval.*
import com.seon.guitarpractice.Note.*
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Major
import com.seon.guitarpractice.Type.Minor
import com.seon.guitarpractice.chord.model.MinorSevenChord
import com.seon.guitarpractice.chord.service.ChordService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChordServiceTest {

    private val chordService = ChordService()

    @Test
    fun `should get C major chord given C E G notes`() {
        val chord = chordService.chordFinder(C, E, G)
        assertThat(chord.name()).isEqualTo("C")
        assertThat(chord.type).isEqualTo(Major)
        assertThat(chord.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
    }

    @Test
    fun `should get C major chord given major triad in different order C G E`() {
        val chord = chordService.chordFinder(C, G, E)
        assertThat(chord.name()).isEqualTo("C")
        assertThat(chord.type).isEqualTo(Major)
        assertThat(chord.intervals).isEqualTo(listOf(ROOT, THIRD, FIFTH))
    }

    @Test
    fun `should get Em chord given E G B notes`() {
        val chord = chordService.chordFinder(E, G, B)
        assertThat(chord.name()).isEqualTo("Em")
        assertThat(chord.type).isEqualTo(Minor)
        assertThat(chord.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH))
    }

    @Test
    fun `should get Am7 chord given A C E G notes`() {
        val chord = chordService.chordFinder(A, C, E, G)
        assertThat(chord.name()).isEqualTo("Am7")
        assertThat(chord.type).isEqualTo(Type.MinorSeven)
        assertThat(chord.intervals).isEqualTo(listOf(ROOT, MINOR_THIRD, FIFTH, FLAT_SEVENTH))
        assertThat(chord).isInstanceOf(MinorSevenChord::class.java)
    }
}