package com.tapaafandi.todoappjetpackcompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tapaafandi.todoappjetpackcompose.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {

    abstract fun toDoDao(): ToDoDao
}