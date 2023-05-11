package com.example.senangumrah

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_amalan_semasa_home.*
import kotlinx.android.synthetic.main.activity_tempat_ziarah_content.*
import kotlinx.android.synthetic.main.cover_content_tempat_ziarah.*
import kotlinx.android.synthetic.main.cover_home_amalan_semasa.*
import kotlinx.android.synthetic.main.cover_home_amalan_semasa.navigationView
import kotlinx.android.synthetic.main.cover_home_persediaan.*
import kotlinx.android.synthetic.main.layout_side_menu.*

class TempatZiarahContent : AppCompatActivity(), View.OnClickListener {

    var videoView: VideoView? = null
    var mediaController: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cover_content_tempat_ziarah)
        onSetNavigationDrawerEvents()

        val btnback : ImageView = findViewById(R.id.buttonbackactivity)

        btnback.setOnClickListener {
            finish()
        }

        videoView = findViewById<View>(R.id.videoTempatZiarah) as VideoView?

        if(mediaController==null){
            mediaController= MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }

        videoView!!.setMediaController(mediaController)
        videoView!!.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.demovideo))
        videoView!!.requestFocus()
        videoView!!.start()

        videoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext,"Video End", Toast.LENGTH_LONG).show()
        }

        videoView!!.setOnErrorListener { mediaPlayer, i, i2 ->
            Toast.makeText(applicationContext,"Error", Toast.LENGTH_LONG ).show()
            false
        }

    }

    private fun onSetNavigationDrawerEvents() {
        navigation_button_tempat_ziarah_content.setOnClickListener(this)
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
            R.id.navigation_button_tempat_ziarah_content -> {
                tempatziarahcontentDrawerLayout.openDrawer(navigationView, true)
            }
            R.id.ll_First -> {
                val button = findViewById<TextView>(R.id.menu_persediaan)
                button.setOnClickListener{
                    val intent = Intent(this, PersediaanHome::class.java)
                    startActivity(intent)
                    tempatziarahcontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Second -> {
                val button = findViewById<TextView>(R.id.menu_kursus)
                button.setOnClickListener{
                    val intent = Intent(this, KursusHome::class.java)
                    startActivity(intent)
                    tempatziarahcontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Third -> {
                val button = findViewById<TextView>(R.id.menu_amalansemasa)
                button.setOnClickListener{
                    val intent = Intent(this, AmalanSemasaHome::class.java)
                    startActivity(intent)
                    tempatziarahcontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Fourth -> {
                val button = findViewById<TextView>(R.id.menu_doa)
                button.setOnClickListener{
                    val intent = Intent(this, TempatZiarahHome::class.java)
                    startActivity(intent)
                    tempatziarahcontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Fifth -> {
                val button = findViewById<TextView>(R.id.menu_tempat)
                button.setOnClickListener{
                    val intent = Intent(this,  TempatZiarahHome::class.java)
                    startActivity(intent)
                    tempatziarahcontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.ll_Sixth -> {
                val button = findViewById<TextView>(R.id.menu_amalanselepas)
                button.setOnClickListener{
                    val intent = Intent(this, AmalanSelepasHome::class.java)
                    startActivity(intent)
                    tempatziarahcontentDrawerLayout.closeDrawer(navigationView, true)
                }
            }
            R.id.close -> {
                showToast("Amalan Semasa Umrah Home")
                tempatziarahcontentDrawerLayout.closeDrawer(navigationView, true)
            }
            else -> {
                showToast("Amalan Semasa Umrah Home")
                tempatziarahcontentDrawerLayout.closeDrawer(navigationView, true)
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onBackPressed() {
        if ( tempatziarahcontentDrawerLayout.isDrawerOpen(navigationView)) {
            tempatziarahcontentDrawerLayout.closeDrawer(navigationView, true)
        } else {
            super.onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}