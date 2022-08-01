package com.merillpr.minotes.room

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun selectAll(): Flow<List<Note>>

    @Query("SELECT * From note WHERE day = :day")
    fun selectByDay(day: Int): Flow<List<Note>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    @Query("DELETE FROM note WHERE id = :id")
    suspend fun detele(id: Int)

    @Update
    suspend fun update(note: Note)
}