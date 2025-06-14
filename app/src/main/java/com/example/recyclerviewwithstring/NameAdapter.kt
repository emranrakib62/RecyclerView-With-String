package com.example.recyclerviewwithstring

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.recyclerview.widget.ListAdapter


import com.example.recyclerviewwithstring.databinding.ItemNameBinding

class NameAdapter : ListAdapter<String, NameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
      val binding=ItemNameBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
      getItem(position).let {
          holder.binding.nametv.text=it
      }
    }


}