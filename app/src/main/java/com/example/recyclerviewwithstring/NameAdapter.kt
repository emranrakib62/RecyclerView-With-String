package com.example.recyclerviewwithstring

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter


import com.example.recyclerviewwithstring.databinding.ItemNameBinding

class NameAdapter : ListAdapter<String, NameViewHolder>(comparator) {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
      val binding=ItemNameBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
      getItem(position).let {
          holder.binding.nametv.text=it
      }
    }
companion object{
    val comparator=object :DiffUtil.ItemCallback<String>(){
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return  oldItem==newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return  oldItem==newItem
        }

    }
}

}