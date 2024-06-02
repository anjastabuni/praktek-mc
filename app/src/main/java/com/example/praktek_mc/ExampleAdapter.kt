package com.example.praktek_mc

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.praktek_mc.databinding.ExampleItemBinding

class ExampleAdapter (private val  exampleList: List<ExampleItem>): RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>(){

    class ExampleViewHolder(val binding: ExampleItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val binding = ExampleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExampleViewHolder(binding)
    }

    override fun getItemCount(): Int = exampleList.size

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.binding.imageView.setImageResource(currentItem.imageResource)
        holder.binding.tvName.text = currentItem.textName
        holder.binding.tvPhone.text = currentItem.textPhone
    }
}