package com.example.mypantry.ui.addingredient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypantry.databinding.ActivityAddIngredientBinding

class AddIngredientActivity : AppCompatActivity() {
    lateinit var activityAddIngredientBinding: ActivityAddIngredientBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityAddIngredientBinding = ActivityAddIngredientBinding.inflate(layoutInflater)
        setContentView(activityAddIngredientBinding.root)


    }

}