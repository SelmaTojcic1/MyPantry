package com.example.mypantry.clicklisteners

import com.example.mypantry.data.models.Ingredient

interface OnIngredientClickListener {
    fun onIngredientClick(ingredient: Ingredient)
}