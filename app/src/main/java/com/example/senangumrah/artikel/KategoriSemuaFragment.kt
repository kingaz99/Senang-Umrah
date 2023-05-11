package com.example.senangumrah.artikel

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.senangumrah.ArtikelContent
import com.example.senangumrah.databinding.FragmentKategoriSemuaBinding


class KategoriSemuaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val bind = FragmentKategoriSemuaBinding.inflate(layoutInflater)
        bind.buttonbaca1.setOnClickListener {
            val intent = Intent (this@KategoriSemuaFragment.requireContext(), ArtikelContent::class.java)
            startActivity(intent)
        }
        return bind.root
    }



}