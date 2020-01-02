package com.seon.guitarpractice

import com.seon.guitarpractice.Accidental.*

enum class Note(val tabName: String, val accidental: Accidental) {
    A("A", PERFECT),
    ASharp("A#", SHARP),
    BFlat("B♭", FLAT),
    B("B", PERFECT),
    BSharp("B#", SHARP),
    CFlat("C♭", FLAT),
    C("C", PERFECT),
    CSharp("C#", SHARP),
    CSharpSharp("C##", SHARP),
    DFlat("D♭", FLAT),
    D("D", PERFECT),
    DSharp("D#", SHARP),
    EFlat("E♭", FLAT),
    E("E", PERFECT),
    ESharp("E#", SHARP),
    FFlat("F♭", FLAT),
    F("F", PERFECT),
    FSharp("F#", SHARP),
    FSharpSharp("F##", SHARP),
    GFlat("G♭", FLAT),
    G("G", PERFECT),
    GSharp("G#", SHARP),
    GSharpSharp("G##", SHARP),
    AFlat("A♭", FLAT)
}