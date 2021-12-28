package com.example.mypantry.data.repository

import com.example.mypantry.data.database.IngredientsDao
import com.example.mypantry.data.models.Ingredient

class IngredientsRepository(private val ingredientsDao: IngredientsDao) {

    fun getIngredients(): List<Ingredient> = ingredientsDao.getIngredients()


}