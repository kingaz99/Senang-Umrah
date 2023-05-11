package com.example.senangumrah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.senangumrah.kursus.KursusViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_kursus_home.*

class KursusHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kursus_home)

        val adapter = KursusViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPagerKursus.adapter= adapter

        TabLayoutMediator(tabLayout,viewPagerKursus){tab, position->
            when(position){
                0-> {
                    tab.text = "Kursus Umrah"
                }
                1-> {
                    tab.text = "Tutorial Ihram"
                }

            }
        }.attach()

        val ButtonBack : ImageView = findViewById(R.id.back)
        ButtonBack.setOnClickListener {
            val intent = Intent (this, HomeMenu::class.java)
            startActivity(intent)
        }
    }
}