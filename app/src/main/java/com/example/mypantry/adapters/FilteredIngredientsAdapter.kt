package com.example.mypantry.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mypantry.R
import com.example.mypantry.clicklisteners.OnIngredientClickListener
import com.example.mypantry.data.models.Ingredient
import com.example.mypantry.viewholders.IngredientsViewHolder

class FilteredIngredientsAdapter (private val onIngredientClickListener: OnIngredientClickListener):
    RecyclerView.Adapter<IngredientsViewHolder>(){

    private val ingredients: MutableList<Ingredient> = mutableListOf()
    private val filteredIngredients: MutableList<Ingredient> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_ingredient, parent, false)
        return IngredientsViewHolder(view)
    }

    override fun onBindViewHolder(holder: IngredientsViewHolder, position: Int) {
        val filteredIngredient = filteredIngredients[position]
        holder.bind(filteredIngredient)
        holder.itemView.setOnClickListener {
            onIngredientClickListener.onIngredientClick(filteredIngredient)
        }
    }

    override fun getItemCount(): Int = filteredIngredients.size

}