package com.seon.guitarpractice.scale

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.chord.model.Chord
import java.util.*

data class Interval2(val position: Interval,
                     val chord: (note: Note) -> Chord,
                     val extendedChords: (note: Note) -> Optional<Chord>)