package com.example.mypantry.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mypantry.R
import com.example.mypantry.databinding.FragmentHomeScreenBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class HomeScreenFragment : Fragment() {

    private lateinit var homeScreenBinding: FragmentHomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeScreenBinding = FragmentHomeScreenBinding.inflate(inflater, container, false)


        homeScreenBinding.btnOpenBottomSheet.setOnClickListener {
            val dialog = BottomSheetDialog(requireContext())
            val view=layoutInflater.inflate(R.layout.bottom_sheet_dialog_layout,null)
            dialog.setContentView(view)
            dialog.show()
        }
        return homeScreenBinding.root
    }

}