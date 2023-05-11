package com.example.senangumrah.amalan

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import com.example.senangumrah.R


class AmalanSemasa10Fragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_amalan_semasa10, container, false)
        val video = rootView.findViewById<View>(R.id.videoAmalanSemasa10) as VideoView
        video.requestFocus()
        val videopath = "android.resource://com.example.senangumrah/" + R.raw.demovideo
        video.setVideoURI(Uri.parse(videopath))
        video.setMediaController(MediaController(activity)) //error in (this)[enter image description here][1]
        video.requestFocus()
        video.start()
        return rootView
    }


}