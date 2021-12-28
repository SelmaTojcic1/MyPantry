package com.example.mypantry.data.database

import androidx.room.Dao
import androidx.room.Query
import com.example.mypantry.data.models.Ingredient

@Dao
interface IngredientsDao {

    @Query("SELECT * FROM ingredients")
    fun getIngredients(): List<Ingredient>
}