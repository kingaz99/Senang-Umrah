package com.example.senangumrah.tempat

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.senangumrah.AmalanSelepasContent
import com.example.senangumrah.ArtikelContent
import com.example.senangumrah.R
import com.example.senangumrah.TempatZiarahContent
import com.example.senangumrah.databinding.FragmentKategoriSemuaBinding
import com.example.senangumrah.databinding.FragmentSemuaTempatBinding

class SemuaTempatFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val bind = FragmentSemuaTempatBinding.inflate(layoutInflater)
        bind.buttonlihat.setOnClickListener {
            val intent = Intent (this@SemuaTempatFragment.requireContext(), TempatZiarahContent::class.java)
            startActivity(intent)
        }
        return bind.root
    }


}