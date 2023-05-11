package com.example.senangumrah

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ImageView
import android.widget.TextView

class ExpandableListViewAdapter internal constructor(private val context: Context, private val chapterList: List<String>, private val topicsList: HashMap<String, List<String>>):
    BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return chapterList.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this.topicsList.get(chapterList[groupPosition])!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return chapterList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return this.topicsList[this.chapterList[groupPosition]]!![childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {

        var convertView = convertView
        val chapterTitle = getGroup(groupPosition) as String

        if (convertView == null) {

            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.chapter_list, null)
        }


        val chapterTv = convertView!!.findViewById<TextView>(R.id.chapter_tv)
        chapterTv.setText(chapterTitle)
        val img = convertView.findViewById<View>(R.id.thumbnail) as ImageView
        val name = chapterTitle
        chapterTv.text = name

        //ASSIGN TEAM IMAGES ACCORDING TO TEAM NAME
        if (name === "Sebelum Berlepas") {
            img.setImageResource(R.drawable.sebelum)
        } else if (name === "Setelah Sampai") {
            img.setImageResource(R.drawable.sampai)
        } else if (name === "Sebelum Masuk Mekah") {
            img.setImageResource(R.drawable.mekah)
        } else if (name === "Ketika di Kaabah") {
            img.setImageResource(R.drawable.kaabah)
        } else if (name === "Ketika Tawaf") {
            img.setImageResource(R.drawable.tawaf)
        } else if (name === "Keluar dari Mekah") {
            img.setImageResource(R.drawable.mekah)
        } else if (name === "Sebelum Masuk Madinah") {
            img.setImageResource(R.drawable.madinah)
        } else if (name === "Ketika di Masjid Nabawi") {
            img.setImageResource(R.drawable.nabawi)
        } else if (name === "Ketika di Raudhah") {
            img.setImageResource(R.drawable.raudhah)
        } else if (name === "Keluar dari Madinah") {
            img.setImageResource(R.drawable.madinah)
        }


        return convertView
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        val topicTitle = getChild(groupPosition, childPosition) as String

        if (convertView == null) {

            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.topics_list, null)
        }
        val topicTv = convertView!!.findViewById<TextView>(R.id.topics_tv)
        topicTv.setText(topicTitle)
        val name = topicTitle
        topicTv.text = name

        val button = convertView!!.findViewById<ImageView>(R.id.button)
        button.setOnClickListener {
            if (name === "Doa Naik Kenderaan") {
                val intent = Intent(context, DoaContent::class.java)
                context.startActivity(intent)
            } else if (name === "Doa Keselamatan Diri dan Harta") {
                val intent = Intent(context, Test::class.java)
                context.startActivity(intent)
            } else if (name === "Doa Dipermudahkan Urusan") {
                val intent = Intent(context, Test::class.java)
                context.startActivity(intent)
            }
        }

        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}