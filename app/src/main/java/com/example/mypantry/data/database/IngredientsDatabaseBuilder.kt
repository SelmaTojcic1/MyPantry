package com.example.mypantry.data.database

import androidx.room.Room
import com.example.mypantry.MyPantry

object IngredientsDatabaseBuilder {

    private var instance: IngredientsDatabase? = null

    fun getInstance(): IngredientsDatabase {
        synchronized(IngredientsDatabase::class) {
            if (instance == null) {
                instance = buildDatabase()
            }
        }
        return instance!!
    }

    private fun buildDatabase(): IngredientsDatabase {
        return Room.databaseBuilder(
            MyPantry.application, IngredientsDatabase::class.java,
            IngredientsDatabase.NAME
        )

            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }
}