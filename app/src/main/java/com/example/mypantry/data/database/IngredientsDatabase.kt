package com.example.mypantry.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mypantry.data.models.Ingredient

@Database(entities = [Ingredient::class], version = 1)
abstract class IngredientsDatabase : RoomDatabase() {

    abstract fun ingredientDao(): IngredientsDao

    companion object {
        const val NAME = "ingredientsDb"
    }
}