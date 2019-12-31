package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Note.C
import com.seon.guitarpractice.chord.model.MajorChord
import org.junit.jupiter.api.Test

class ChordWithExtensionsTest {

    @Test
    fun `should get C maj7`() {

        val chord = MajorChord(C)
    }
}