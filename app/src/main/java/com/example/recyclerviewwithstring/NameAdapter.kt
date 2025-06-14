package com.example.recyclerviewwithstring

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.recyclerview.widget.ListAdapter


import com.example.recyclerviewwithstring.databinding.ItemNameBinding

class NameAdapter : ListAdapter<String, NameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
       ItemNameBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}