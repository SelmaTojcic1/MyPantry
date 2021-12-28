package com.example.mypantry.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypantry.databinding.ActivityMainBinding
import com.example.mypantry.ui.home.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val viewPager = mainBinding.viewPager
        val tabLayout = mainBinding.tabLayout

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Fridge"
                else -> "Recipes"
            }
        }.attach()
    }

}