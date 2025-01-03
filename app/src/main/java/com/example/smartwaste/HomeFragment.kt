package com.example.smartwaste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val recyclerku = view.findViewById<RecyclerView>(R.id.Recycler_ViewKu)

        val dataset = arrayOf("Multani", "Jake", "Logan Paul", "Rizal", "Multani", "Jake", "Logan Paul", "Rizal", "Multani", "Jake", "Logan Paul", "Rizal")

        val adapter = HomeAdapter(dataset)

        recyclerku.layoutManager = LinearLayoutManager(context)
        recyclerku.adapter = adapter

        return view

    }

}