package com.seon.guitarpractice

import com.seon.guitarpractice.Accidental.*

enum class Note(val tabName: String, val accidentals: Accidental) {
    A("A", Perfect),
    ASharp("A#", Sharp),
    BFlat("B♭", Flat),
    B("B", Perfect),
    BSharp("B#", Sharp),
    CFlat("C♭", Flat),
    C("C", Perfect),
    CSharp("C#", Sharp),
    DFlat("D♭", Flat),
    D("D", Perfect),
    DSharp("D#", Sharp),
    EFlat("E♭", Flat),
    E("E", Perfect),
    ESharp("E#", Sharp),
    FFlat("F♭", Flat),
    F("F", Perfect),
    FSharp("F#", Sharp),
    GFlat("G♭", Flat),
    G("G", Perfect),
    GSharp("G#", Sharp),
    AFlat("A♭", Flat)
}