package com.example.senangumrah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.senangumrah.tempat.TempatZiarahViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_amalan_semasa_home.*
import kotlinx.android.synthetic.main.activity_tempat_ziarah_home.*
import kotlinx.android.synthetic.main.activity_tempat_ziarah_home.tabLayout
import kotlinx.android.synthetic.main.cover_home_amalan_semasa.*
import kotlinx.android.synthetic.main.cover_home_amalan_semasa.navigationView
import kotlinx.android.synthetic.main.cover_home_persediaan.*
import kotlinx.android.synthetic.main.cover_home_tempat_ziarah.*
import kotlinx.android.synthetic.main.layout_side_menu.*

class TempatZiarahHome : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cover_home_tempat_ziarah)
        onSetNavigationDrawerEvents()

        val adapter = TempatZiarahViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPagerTempatZiarah.adapter=adapter

        TabLayoutMediator(tabLayout,viewPagerTempatZiarah){tab, position->
            when(position){
                0-> {
                    tab.text = "Semua"
                }
                1-> {
                    tab.text = "Mekah"
                }
                2-> {
                    tab.text = "Madinah"
                }
            }
        }.attach()



        val ButtonBack : ImageView = findViewById(R.id.back)
        ButtonBack.setOnClickListener {
            val intent = Intent (this, HomeMenu::class.java)
            startActivity(intent)
        }
    }

    private fun onSetNavigationDrawerEvents() {
        navigation_button_tempat_ziarah_home.setOnClickListener(this)
        ll_First.setOnClickListener(this)
        ll_Second.setOnClickListener(this)
        ll_Third.setOnClickListener(this)
        ll_Fourth.setOnClickListener(this)
        ll_Fifth.setOnClickListener(this)
        ll_Sixth.setOnClickListener(this)
        close.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.navigation_button_tempat_ziarah_home -> {
                tempatziarahDrawerLayout.openDrawer(navigationView, true)
            }
            R.id.ll_First -> {
                val button = findViewById<TextView>(R.id.menu_persediaan)
                button.setOnClickListener{
                    val intent = Intent(this, PersediaanHome::class.java)
                    startActivity(intent)
                    tempatziarahDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Second -> {
                val button = findViewById<TextView>(R.id.menu_kursus)
                button.setOnClickListener{
                    val intent = Intent(this, KursusHome::class.java)
                    startActivity(intent)
                    tempatziarahDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Third -> {
                val button = findViewById<TextView>(R.id.menu_amalansemasa)
                button.setOnClickListener{
                    val intent = Intent(this, AmalanSemasaHome::class.java)
                    startActivity(intent)
                    tempatziarahDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Fourth -> {
                val button = findViewById<TextView>(R.id.menu_doa)
                button.setOnClickListener{
                    val intent = Intent(this, TempatZiarahHome::class.java)
                    startActivity(intent)
                    tempatziarahDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Fifth -> {
                val button = findViewById<TextView>(R.id.menu_tempat)
                button.setOnClickListener{
                    val intent = Intent(this,  TempatZiarahHome::class.java)
                    startActivity(intent)
                    tempatziarahDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Sixth -> {
                val button = findViewById<TextView>(R.id.menu_amalanselepas)
                button.setOnClickListener{
                    val intent = Intent(this, AmalanSelepasHome::class.java)
                    startActivity(intent)
                    tempatziarahDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.close -> {
                showToast("Amalan Semasa Umrah Home")
                tempatziarahDrawerLayout.closeDrawer(navigationView, true)
            }
            else -> {
                showToast("Amalan Semasa Umrah Home")
                tempatziarahDrawerLayout.closeDrawer(navigationView, true)
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onBackPressed() {
        if ( tempatziarahDrawerLayout.isDrawerOpen(navigationView)) {
            tempatziarahDrawerLayout.closeDrawer(navigationView, true)
        } else {
            super.onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}