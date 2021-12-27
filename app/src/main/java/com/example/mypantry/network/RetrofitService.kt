package com.example.mypantry.network

import com.example.mypantry.data.model.Ingredient
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "https://api.spoonacular.com/"

interface RetrofitService {

    @GET("food/ingredients/search?")
    fun getIngredient(@Query("query")searchString : String) : Call<List<Ingredient>>
}