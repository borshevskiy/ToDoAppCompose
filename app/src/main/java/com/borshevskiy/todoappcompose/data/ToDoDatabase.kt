package com.borshevskiy.todoappcompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.borshevskiy.todoappcompose.data.models.ToDoTask

@Database(entities = [ToDoTask::class], exportSchema = false, version = 1)
abstract class ToDoDatabase: RoomDatabase() {

    abstract fun toDoDao(): ToDoDao

}