package com.example.praktek_mc

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GridAdapter(private val context: Context, private val images : List<DataModel>, val listener : (DataModel) -> Unit)
    : RecyclerView.Adapter<GridAdapter.ImageViewHolder>() {

    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val iconsImage = view.findViewById<ImageView>(R.id.iconsImage)
        val titleImage = view.findViewById<TextView>(R.id.titleImage)
        fun bindView(image: DataModel, listener: (DataModel) -> Unit){
            iconsImage.setImageResource(image.iconsImage)
            titleImage.text = image.TitleImage
            itemView.setOnClickListener { listener(image) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder
    = GridAdapter.ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_grid, parent, false)
    )

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)
    }
}