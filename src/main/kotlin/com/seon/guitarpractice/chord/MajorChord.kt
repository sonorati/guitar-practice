package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Interval.ROOT
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.Type.Major

data class MajorChord(private val root: Note,
                 val type: Type = Major,
                      val intervals: List<Interval> = listOf(ROOT, Interval.THIRD, Interval.FIFTH))
    : Chord(root, type, intervals)
