package com.example.senangumrah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.senangumrah.artikel.ArtikelViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_artikel_home.*
import kotlinx.android.synthetic.main.activity_artikel_home.navigation_button
import kotlinx.android.synthetic.main.activity_artikel_home.tabLayout
import kotlinx.android.synthetic.main.activity_persediaan_home.*
import kotlinx.android.synthetic.main.cover_home_artikel.*
import kotlinx.android.synthetic.main.cover_home_menu.*
import kotlinx.android.synthetic.main.cover_home_persediaan.*
import kotlinx.android.synthetic.main.cover_home_persediaan.navigationView
import kotlinx.android.synthetic.main.layout_side_menu.*

class ArtikelHome : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cover_home_artikel)
        onSetNavigationDrawerEvents()

        val adapter = ArtikelViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPagerArtikel.adapter = adapter

        TabLayoutMediator(tabLayout, viewPagerArtikel) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Semua"
                }
                1 -> {
                    tab.text = "Kat 1"
                }
                2 -> {
                    tab.text = "Kat 2"
                }
                3 -> {
                    tab.text = "Kat 3"
                }
                4 -> {
                    tab.text = "Kat 4"
                }
                5 -> {
                    tab.text = "Kat 5"
                }
            }
        }.attach()

        val ButtonBack: ImageView = findViewById(R.id.back)
        ButtonBack.setOnClickListener {
            val intent = Intent(this, HomeMenu::class.java)
            startActivity(intent)
        }
    }


    private fun onSetNavigationDrawerEvents() {
        navigation_button.setOnClickListener(this)
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
            R.id.navigation_button -> {
                artikelDrawerLayout.openDrawer(navigationView, true)
            }
            R.id.ll_First -> {
                val button = findViewById<TextView>(R.id.menu_persediaan)
                button.setOnClickListener{
                    val intent = Intent(this, PersediaanHome::class.java)
                    startActivity(intent)
                    artikelDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Second -> {
                val button = findViewById<TextView>(R.id.menu_kursus)
                button.setOnClickListener{
                    val intent = Intent(this, KursusHome::class.java)
                    startActivity(intent)
                    artikelDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Third -> {
                val button = findViewById<TextView>(R.id.menu_amalansemasa)
                button.setOnClickListener{
                    val intent = Intent(this, AmalanSemasaHome::class.java)
                    startActivity(intent)
                    artikelDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Fourth -> {
                val button = findViewById<TextView>(R.id.menu_doa)
                button.setOnClickListener{
                    val intent = Intent(this, TempatZiarahHome::class.java)
                    startActivity(intent)
                    artikelDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Fifth -> {
                val button = findViewById<TextView>(R.id.menu_tempat)
                button.setOnClickListener{
                    val intent = Intent(this,  TempatZiarahHome::class.java)
                    startActivity(intent)
                    artikelDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Sixth -> {
                val button = findViewById<TextView>(R.id.menu_amalanselepas)
                button.setOnClickListener{
                    val intent = Intent(this, AmalanSelepasHome::class.java)
                    startActivity(intent)
                    artikelDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.close -> {
                showToast("Artikel Home")
                artikelDrawerLayout.closeDrawer(navigationView, true)
            }
            else -> {
                showToast("Artikel Home")
                artikelDrawerLayout.closeDrawer(navigationView, true)
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onBackPressed() {
        if ( artikelDrawerLayout.isDrawerOpen(navigationView)) {
            artikelDrawerLayout.closeDrawer(navigationView, true)
        } else {
            super.onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}