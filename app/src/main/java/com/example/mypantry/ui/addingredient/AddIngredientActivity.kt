package com.example.mypantry.ui.addingredient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mypantry.R
import com.example.mypantry.databinding.ActivityAddIngredientBinding

class AddIngredientActivity : AppCompatActivity() {

    lateinit var activityAddIngredientBinding: ActivityAddIngredientBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityAddIngredientBinding = ActivityAddIngredientBinding.inflate(layoutInflater)
        setContentView(activityAddIngredientBinding.root)

        setupRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)

        return true
    }

    private fun setupRecyclerView() {
        activityAddIngredientBinding.rvIngredients.layoutManager = LinearLayoutManager (
            this, LinearLayoutManager.VERTICAL, false)

        //activityAddIngredientBinding.rvIngredients.adapter = FilteredIngredientsAdapter()
    }

}