package com.merillpr.minotes.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class Note(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "activity")
    val activity: String,

    @ColumnInfo(name = "startHour")
    val startHour: Int,

    @ColumnInfo(name = "startMinute")
    val startMinute: Int,

    @ColumnInfo(name = "endHour")
    val endHour: Int,

    @ColumnInfo(name = "endMinute")
    val endMinute: Int,

    @ColumnInfo(name = "year")
    val year: Int,

    @ColumnInfo(name = "month")
    val month: Int,

    @ColumnInfo(name = "day")
    val day: Int,

    @ColumnInfo(name = "repeat")
    val repeat: String
)
