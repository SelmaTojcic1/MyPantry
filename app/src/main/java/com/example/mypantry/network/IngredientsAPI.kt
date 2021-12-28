package com.example.mypantry.network

import com.example.mypantry.data.models.Ingredient
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface IngredientsAPI {

    @GET("/ingredients/search")
    suspend fun getIngredients(
        @QueryMap queries: Map<String, String>
    ): Response<Ingredient>

    @GET("/ingredients/search")
    suspend fun searchIngredients(
        @QueryMap queries: Map<String, String>
    ): Response<Ingredient>
}