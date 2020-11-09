package com.example.personaltodolist

import androidx.lifecycle.LiveData

class NotesRepository(private val notesDao: NotesDao) {
    val allNotes: LiveData<List<Notes>> = notesDao.getAllNotes()

    suspend fun insert(notes: Notes){
        notesDao.insert(notes)
    }
    suspend fun delete(notes: Notes){
        notesDao.delete(notes)
    }
}