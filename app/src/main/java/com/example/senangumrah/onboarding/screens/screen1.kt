package com.example.senangumrah.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.senangumrah.R
import kotlinx.android.synthetic.main.fragment_screen1.view.*


class screen1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_screen1, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewpager)

        view.buttonseterusnya.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return view
    }


}