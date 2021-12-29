package com.example.mypantry.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mypantry.adapters.IngredientsAdapter
import com.example.mypantry.data.database.IngredientsDatabaseBuilder
import com.example.mypantry.data.repository.IngredientsRepository
import com.example.mypantry.databinding.FragmentHomeScreenBinding
import com.example.mypantry.ui.addingredient.AddIngredientActivity


class HomeScreenFragment : Fragment() {

    private lateinit var homeScreenBinding: FragmentHomeScreenBinding
    private val ingredientsDao = IngredientsDatabaseBuilder.getInstance().ingredientDao()
    private val ingredientsRepository = IngredientsRepository(ingredientsDao)

    companion object {
        const val TAG = "Ingredients list"
        fun create(): HomeScreenFragment {
            return HomeScreenFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeScreenBinding =
            FragmentHomeScreenBinding.inflate(inflater, container, false)

        setupRecyclerView()



        return homeScreenBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeScreenBinding.btnOpenAddIngredientFragment.setOnClickListener{
            startActivity(Intent(requireContext(),AddIngredientActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        (homeScreenBinding.rvIngredients.adapter as IngredientsAdapter)
            .refreshData(ingredientsRepository.getIngredients())
    }

    private fun setupRecyclerView() {
        homeScreenBinding.rvIngredients.layoutManager = LinearLayoutManager (
            context, LinearLayoutManager.VERTICAL, false)

        homeScreenBinding.rvIngredients.adapter =
            IngredientsAdapter(ingredientsRepository.getIngredients())

    }

}