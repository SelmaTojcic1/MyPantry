package com.example.mypantry.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mypantry.R
import com.example.mypantry.adapters.IngredientsAdapter
import com.example.mypantry.data.database.IngredientsDatabaseBuilder
import com.example.mypantry.data.repository.IngredientsRepository
import com.example.mypantry.databinding.FragmentHomeScreenBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

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
        homeScreenBinding = FragmentHomeScreenBinding.inflate(inflater, container, false)

        setupRecyclerView()

        homeScreenBinding.btnOpenBottomSheet.setOnClickListener {
            val dialog = BottomSheetDialog(requireContext())
            val view=layoutInflater.inflate(R.layout.bottom_sheet_dialog_layout,null)
            dialog.setContentView(view)
            dialog.show()
        }
        return homeScreenBinding.root
    }

    override fun onResume() {
        super.onResume()
        (homeScreenBinding.rvIngredients.adapter as IngredientsAdapter)
            .refreshData(ingredientsRepository.getIngredients())
    }

    private fun setupRecyclerView() {
        homeScreenBinding.rvIngredients.layoutManager = LinearLayoutManager (
            context, LinearLayoutManager.VERTICAL, false)

        homeScreenBinding.rvIngredients.adapter = IngredientsAdapter(ingredientsRepository.getIngredients())

    }

}