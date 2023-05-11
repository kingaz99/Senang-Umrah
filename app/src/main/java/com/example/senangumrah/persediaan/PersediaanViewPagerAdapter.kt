package com.example.senangumrah.persediaan

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.senangumrah.kursus.KursusUmrahFragment
import com.example.senangumrah.kursus.TutorialIhramFragment

class PersediaanViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0->{
                Persediaan1Fragment()
            }
            1->{
                Persediaan2Fragment()
            }
            2->{
                Persediaan3Fragment()
            }
            3->{
                Persediaan4Fragment()
            }
            4->{
                Persediaan5Fragment()
            }
            else->{
                Fragment()
            }
        }
    }
}