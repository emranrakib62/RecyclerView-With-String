package com.example.recyclerviewwithstring

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithstring.databinding.ItemNameBinding

class NameViewHolder(private val binding: ItemNameBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(name: String) {
        binding.nametv.text = name
    }
}
