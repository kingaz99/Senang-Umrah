package com.example.senangumrah

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_doa_content.*
import kotlinx.android.synthetic.main.activity_doa_content.navigation_button
import kotlinx.android.synthetic.main.activity_persediaan_home.*
import kotlinx.android.synthetic.main.cover_content_doa.*
import kotlinx.android.synthetic.main.cover_home_amalan_selepas.*
import kotlinx.android.synthetic.main.cover_home_amalan_selepas.navigationView
import kotlinx.android.synthetic.main.cover_home_persediaan.*
import kotlinx.android.synthetic.main.layout_side_menu.*

class DoaContent : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cover_content_doa)
        onSetNavigationDrawerEvents()

        var mediaPlayer = MediaPlayer.create(this, R.raw.doa)

        val btnback : ImageView = findViewById(R.id.buttonback)

        btnback.setOnClickListener {
            finish()
        }


        playButton.setOnClickListener {
            if (!mediaPlayer.isPlaying) {
                mediaPlayer.start()
                playButton.setImageResource(R.drawable.pause)
            } else {
                mediaPlayer.pause()
                playButton.setImageResource(R.drawable.play)
            }
        }
        mediaPlayer?.setOnCompletionListener {
            playButton.setImageResource(R.drawable.play)
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
                doacontentDrawerLayout.openDrawer(navigationView, true)
            }
            R.id.ll_First -> {
                val button = findViewById<TextView>(R.id.menu_persediaan)
                button.setOnClickListener{
                    val intent = Intent(this, PersediaanHome::class.java)
                    startActivity(intent)
                    doacontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Second -> {
                val button = findViewById<TextView>(R.id.menu_kursus)
                button.setOnClickListener{
                    val intent = Intent(this, KursusHome::class.java)
                    startActivity(intent)
                    doacontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Third -> {
                val button = findViewById<TextView>(R.id.menu_amalansemasa)
                button.setOnClickListener{
                    val intent = Intent(this, AmalanSemasaHome::class.java)
                    startActivity(intent)
                    doacontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Fourth -> {
                val button = findViewById<TextView>(R.id.menu_doa)
                button.setOnClickListener{
                    val intent = Intent(this, TempatZiarahHome::class.java)
                    startActivity(intent)
                    doacontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Fifth -> {
                val button = findViewById<TextView>(R.id.menu_tempat)
                button.setOnClickListener{
                    val intent = Intent(this,  TempatZiarahHome::class.java)
                    startActivity(intent)
                    doacontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Sixth -> {
                val button = findViewById<TextView>(R.id.menu_amalanselepas)
                button.setOnClickListener{
                    val intent = Intent(this, AmalanSelepasHome::class.java)
                    startActivity(intent)
                    doacontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.close -> {
                showToast("Doa")
                doacontentDrawerLayout.closeDrawer(navigationView, true)
            }
            else -> {
                showToast("Doa")
                doacontentDrawerLayout.closeDrawer(navigationView, true)
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onBackPressed() {
        if ( doacontentDrawerLayout.isDrawerOpen(navigationView)) {
            doacontentDrawerLayout.closeDrawer(navigationView, true)
        } else {
            super.onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
