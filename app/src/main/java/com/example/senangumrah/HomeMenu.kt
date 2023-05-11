package com.example.senangumrah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_menu.*
import kotlinx.android.synthetic.main.cover_home_menu.*
import kotlinx.android.synthetic.main.layout_side_menu.*

class HomeMenu : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cover_home_menu)
        onSetNavigationDrawerEvents()

        val btnpersediaan : ImageView = findViewById(R.id.buttonpersediaan)
        val btnkursus : ImageView = findViewById(R.id.buttonkursus)
        val btnamalansemasa : ImageView = findViewById(R.id.buttonamalansemasa)
        val btndoa : ImageView = findViewById(R.id.buttondoa)
        val btntempat : ImageView = findViewById(R.id.buttontempat)
        val btnamalanselepas : ImageView = findViewById(R.id.buttonamalanselepas)
        val btnartikel1 : ImageView = findViewById(R.id.artikel1)
        val btnmore : ImageView = findViewById(R.id.more)

        btnpersediaan.setOnClickListener {
            val intent = Intent (this, PersediaanHome::class.java)
            startActivity(intent)
        }

        btnkursus.setOnClickListener {
            val intent = Intent (this, KursusHome::class.java)
            startActivity(intent)
        }

        btnamalansemasa.setOnClickListener {
            val intent = Intent (this, AmalanSemasaHome::class.java)
            startActivity(intent)
        }

        btntempat.setOnClickListener {
            val intent = Intent (this, TempatZiarahHome::class.java)
            startActivity(intent)
        }

        btnamalanselepas.setOnClickListener {
            val intent = Intent (this, AmalanSelepasHome::class.java)
            startActivity(intent)
        }

        btndoa.setOnClickListener {
            val intent = Intent (this, DoaHome::class.java)
            startActivity(intent)
        }



        btnartikel1.setOnClickListener {
            val intent = Intent (this, ArtikelContent::class.java)
            startActivity(intent)
        }

        btnmore.setOnClickListener {
            val intent = Intent (this, ArtikelHome::class.java)
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
                homeDrawerLayout.openDrawer(navigationView, true)
            }
            R.id.ll_First -> {
                val button = findViewById<TextView>(R.id.menu_persediaan)
                button.setOnClickListener{
                    val intent = Intent(this, PersediaanHome::class.java)
                    startActivity(intent)
                    homeDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Second -> {
                val button = findViewById<TextView>(R.id.menu_kursus)
                button.setOnClickListener{
                    val intent = Intent(this, KursusHome::class.java)
                    startActivity(intent)
                    homeDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Third -> {
                val button = findViewById<TextView>(R.id.menu_amalansemasa)
                button.setOnClickListener{
                    val intent = Intent(this, AmalanSemasaHome::class.java)
                    startActivity(intent)
                    homeDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Fourth -> {
                val button = findViewById<TextView>(R.id.menu_doa)
                button.setOnClickListener{
                    val intent = Intent(this, TempatZiarahHome::class.java)
                    startActivity(intent)
                    homeDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Fifth -> {
                val button = findViewById<TextView>(R.id.menu_tempat)
                button.setOnClickListener{
                    val intent = Intent(this,  TempatZiarahHome::class.java)
                    startActivity(intent)
                    homeDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Sixth -> {
                val button = findViewById<TextView>(R.id.menu_amalanselepas)
                button.setOnClickListener{
                    val intent = Intent(this, AmalanSelepasHome::class.java)
                    startActivity(intent)
                    homeDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.close -> {
                showToast("Home")
                homeDrawerLayout.closeDrawer(navigationView, true)
            }
            else -> {
                showToast("Home")
                homeDrawerLayout.closeDrawer(navigationView, true)
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onBackPressed() {
        if ( homeDrawerLayout.isDrawerOpen(navigationView)) {
            homeDrawerLayout.closeDrawer(navigationView, true)
        } else {
            super.onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }


}