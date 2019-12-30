package com.seon.guitarpractice.chord

import com.seon.guitarpractice.Interval
import com.seon.guitarpractice.Note
import com.seon.guitarpractice.Type
import com.seon.guitarpractice.scale.ScaleTemplate.notesInKey

abstract class Chord(private val root: Note) {

    abstract val intervals: List<Interval>
    abstract val type: Type

    fun name() = "${root.tabName}${type.tabName}"

    fun notes(): List<Note> {
        val notesInKey = notesInKey(root, type)
        return intervals.map { notesInKey[it.position] }
    }

}
