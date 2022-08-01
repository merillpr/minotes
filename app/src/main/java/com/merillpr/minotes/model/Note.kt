package com.merillpr.minotes.model

data class Note(
    val id: Int,
    val activity: String,
    val startHour: Int,
    val startMinute: Int,
    val endHour: Int,
    val endMinute: Int,
    val year: Int,
    val month: Int,
    val day: Int,
    val repeat: String
)
