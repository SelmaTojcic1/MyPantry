package com.example.mypantry.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mypantry.ui.recipes.RecipesFragment

class ViewPagerAdapter (fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    companion object {
        private const val NUM_OF_FRAGMENTS = 2
    }

    override fun getItemCount() = NUM_OF_FRAGMENTS

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeScreenFragment()
            else -> RecipesFragment()
        }
    }
}