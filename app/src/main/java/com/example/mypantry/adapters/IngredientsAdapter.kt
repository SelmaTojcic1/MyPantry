package com.example.mypantry.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mypantry.R
import com.example.mypantry.data.models.Ingredient
import com.example.mypantry.viewholders.IngredientsViewHolder

class IngredientsAdapter (ingredients: List<Ingredient>) :
    RecyclerView.Adapter<IngredientsViewHolder>(){

    private val ingredients: MutableList<Ingredient> = mutableListOf()
    init{
        refreshData(ingredients)
    }

    fun refreshData(ingredients: List<Ingredient>) {
        this.ingredients.clear()
        this.ingredients.addAll(ingredients)
        //this.notifyDatasetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_ingredient, parent, false)
        return IngredientsViewHolder(view)    }

    override fun onBindViewHolder(holder: IngredientsViewHolder, position: Int) {
        val ingredients = ingredients[position]
        holder.bind(ingredients)
    }

    override fun getItemCount(): Int = ingredients.size
}