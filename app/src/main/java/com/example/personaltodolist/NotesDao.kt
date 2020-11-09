package com.example.personaltodolist

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(notes: Notes)

    @Delete
    suspend fun delete(notes: Notes)

    @Query("Select * from notes_table order by id ASC")
    fun getAllNotes(): LiveData<List<Notes>>
}