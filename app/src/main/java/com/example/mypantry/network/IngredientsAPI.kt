package com.example.mypantry.network

import com.example.mypantry.data.models.Ingredient
import retrofit2.Call
import retrofit2.http.GET

interface IngredientsAPI {

    @GET("/food/ingredients/search")
    fun getIngredients() : Call<List<Ingredient>>

}