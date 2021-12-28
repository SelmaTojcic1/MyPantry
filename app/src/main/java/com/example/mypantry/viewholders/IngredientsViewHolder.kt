package com.example.mypantry.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mypantry.data.models.Ingredient
import com.example.mypantry.databinding.ItemIngredientBinding

class IngredientsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(ingredient: Ingredient) {
        val itemIngredientBinding = ItemIngredientBinding.bind(itemView)

        itemIngredientBinding.tvIngredientName.text = ingredient.name

        Glide.with(itemView.context)
            .load(ingredient.image)
            .centerCrop()
            .into(itemIngredientBinding.ivIngredient)
    }
}

