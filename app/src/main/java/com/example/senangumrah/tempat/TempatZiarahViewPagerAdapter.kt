package com.example.senangumrah.tempat

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class TempatZiarahViewPagerAdapter (fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0->{
                SemuaTempatFragment()
            }
            1->{
                MekahFragment()
            }
            2->{
                MadinahFragment()
            }
            else->{
                Fragment()
            }
        }
    }
}