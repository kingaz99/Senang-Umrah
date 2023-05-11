package com.example.senangumrah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.senangumrah.databinding.ActivityDoaHomeBinding
import kotlinx.android.synthetic.main.activity_persediaan_home.*
import kotlinx.android.synthetic.main.cover_home_amalan_selepas.*
import kotlinx.android.synthetic.main.cover_home_amalan_selepas.navigationView
import kotlinx.android.synthetic.main.cover_home_doa.*
import kotlinx.android.synthetic.main.cover_home_persediaan.*
import kotlinx.android.synthetic.main.layout_side_menu.*

class DoaHome : AppCompatActivity() {

    private lateinit var binding: ActivityDoaHomeBinding
    private lateinit var listViewAdapter: ExpandableListViewAdapter
    private lateinit var chapterList: List<String>
    private lateinit var topicList: HashMap<String, List<String>>



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityDoaHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showList()
        listViewAdapter = ExpandableListViewAdapter( context = this, chapterList, topicList)
        binding.eListView.setAdapter(listViewAdapter)

        val btnback : ImageView = findViewById(R.id.buttonback)

        btnback.setOnClickListener {
            finish()
        }


    }




    private fun showList() {

        chapterList = ArrayList()
        topicList = HashMap()

        (chapterList as ArrayList<String>).add("Sebelum Berlepas")
        (chapterList as ArrayList<String>).add("Setelah Sampai")
        (chapterList as ArrayList<String>).add("Sebelum Masuk Mekah")
        (chapterList as ArrayList<String>).add("Ketika di Kaabah")
        (chapterList as ArrayList<String>).add("Ketika Tawaf")
        (chapterList as ArrayList<String>).add("Keluar dari Mekah")
        (chapterList as ArrayList<String>).add("Sebelum Masuk Madinah")
        (chapterList as ArrayList<String>).add("Ketika di Masjid Nabawi")
        (chapterList as ArrayList<String>).add("Ketika di Raudhah")
        (chapterList as ArrayList<String>).add("Keluar dari Madinah")

        val topic1 : MutableList<String> = ArrayList()
        topic1.add("Doa Naik Kenderaan")
        topic1.add("Doa Keselamatan Diri dan Harta")
        topic1.add("Doa Dipermudahkan Urusan")

        val topic2 : MutableList<String> = ArrayList()
        topic2.add("Topic 1")
        topic2.add("Topic 2")
        topic2.add("Topic 3")

        val topic3 : MutableList<String> = ArrayList()
        topic3.add("Topic 1")
        topic3.add("Topic 2")
        topic3.add("Topic 3")

        val topic4 : MutableList<String> = ArrayList()
        topic4.add("Topic 1")
        topic4.add("Topic 2")
        topic4.add("Topic 3")

        val topic5 : MutableList<String> = ArrayList()
        topic5.add("Topic 1")
        topic5.add("Topic 2")
        topic5.add("Topic 3")

        val topic6 : MutableList<String> = ArrayList()
        topic6.add("Topic 1")
        topic6.add("Topic 2")
        topic6.add("Topic 3")

        val topic7 : MutableList<String> = ArrayList()
        topic7.add("Topic 1")
        topic7.add("Topic 2")
        topic7.add("Topic 3")

        val topic8 : MutableList<String> = ArrayList()
        topic8.add("Topic 1")
        topic8.add("Topic 2")
        topic8.add("Topic 3")

        val topic9 : MutableList<String> = ArrayList()
        topic9.add("Topic 1")
        topic9.add("Topic 2")
        topic9.add("Topic 3")

        val topic10 : MutableList<String> = ArrayList()
        topic10.add("Topic 1")
        topic10.add("Topic 2")
        topic10.add("Topic 3")

        topicList[chapterList[0]] = topic1
        topicList[chapterList[1]] = topic2
        topicList[chapterList[2]] = topic3
        topicList[chapterList[3]] = topic4
        topicList[chapterList[4]] = topic5
        topicList[chapterList[5]] = topic6
        topicList[chapterList[6]] = topic7
        topicList[chapterList[7]] = topic8
        topicList[chapterList[8]] = topic9
        topicList[chapterList[9]] = topic10

    }




}