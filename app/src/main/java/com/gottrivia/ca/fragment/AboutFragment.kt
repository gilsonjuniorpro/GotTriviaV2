package com.gottrivia.ca.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
//import com.gottrivia.ca.BuildConfig

import com.gottrivia.ca.R



class AboutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_about, container, false)

        val versionID: TextView = rootView.findViewById(R.id.versionID)
        versionID.text = "BuildConfig.VERSION_NAME"

        return rootView
    }
}
