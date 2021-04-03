package com.seon.guitarpractice.progression

import com.seon.guitarpractice.Progression.*

// Commonly used chord progressions

val minorScaleChordProgressions = listOf(
        listOf(i, VI, III, VII),
        listOf(i, VI, VII, v),
        listOf(VI, VII, i),
        listOf(i, VI, II, VII),
        listOf(i, VII, VI, v),
        listOf(i, VII, VI, v, III)
)

val majorScaleChordProgressions = listOf(
        listOf(I, vi, IV, V),
        listOf(I, V, vi, iii, IV, iii, IV, V),
        listOf(I, iii, vi, IV),
        listOf(I, iii, I, iii),
        listOf(I, V, iii, VI),
        listOf(I, V, vi, IV),
        listOf(I, ii, iii, ii),
        listOf(I, IV, vi, V),
        listOf(IV, V, I)
)