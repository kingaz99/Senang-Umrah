package com.example.senangumrah.persediaan

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import com.example.senangumrah.R


class Persediaan2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_persediaan2, container, false)
        val video = rootView.findViewById<View>(R.id.videoPersediaan2) as VideoView
        video.requestFocus()
        val videopath = "android.resource://com.example.senangumrah/" + R.raw.demovideo
        video.setVideoURI(Uri.parse(videopath))
        video.setMediaController(MediaController(activity)) //error in (this)[enter image description here][1]
        video.requestFocus()
        video.start()
        return rootView
    }


}