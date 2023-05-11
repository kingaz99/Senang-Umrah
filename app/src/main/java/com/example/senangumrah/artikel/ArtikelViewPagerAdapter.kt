package com.example.senangumrah.artikel

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ArtikelViewPagerAdapter (fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle ) {
    override fun getItemCount(): Int {
        return 6
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0->{
                KategoriSemuaFragment()
            }
            1->{
                Kategori1Fragment()
            }
            2->{
                Kategori2Fragment()
            }
            3->{
                Kategori3Fragment()
            }
            4->{
                Kategori4Fragment()
            }
            5->{
                Kategori5Fragment()
            }
            else->{
                Fragment()
            }

        }
    }
}