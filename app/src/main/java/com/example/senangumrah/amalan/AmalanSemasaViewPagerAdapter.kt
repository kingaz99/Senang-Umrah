package com.example.senangumrah.amalan

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class AmalanSemasaViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 10
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0->{
                AmalanSemasa1Fragment()
            }
            1->{
                AmalanSemasa2Fragment()
            }
            2->{
                AmalanSemasa3Fragment()
            }
            3->{
                AmalanSemasa4Fragment()
            }
            4->{
                AmalanSemasa5Fragment()
            }
            5->{
                AmalanSemasa6Fragment()
            }
            6->{
                AmalanSemasa7Fragment()
            }
            7->{
                AmalanSemasa8Fragment()
            }
            8->{
                AmalanSemasa9Fragment()
            }
            9->{
                AmalanSemasa10Fragment()
            }
            else->{
                Fragment()
            }
        }
    }
}