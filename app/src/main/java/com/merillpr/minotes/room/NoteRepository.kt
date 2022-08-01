package com.merillpr.minotes.room

import kotlinx.coroutines.Dispatchers

class NoteRepository(private val noteDao: NoteDao) {
    val selectAll = noteDao.selectAll()

    suspend fun selectByDay(day: Int) {
        Dispatchers.IO.apply {
            noteDao.selectByDay(day)
        }
    }

    suspend fun insert(note: Note) {
        Dispatchers.IO.apply {
            noteDao.insert(note)
        }
    }

    suspend fun delete(note: Note) {
        Dispatchers.IO.apply {
            noteDao.detele(note.id)
        }
    }

    suspend fun update(note: Note) {
        Dispatchers.IO.apply {
            noteDao.update(note)
        }
    }

}