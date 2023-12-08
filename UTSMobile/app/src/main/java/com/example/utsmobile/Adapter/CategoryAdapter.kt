package com.example.utsmobile.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.utsmobile.Category
import com.example.utsmobile.R

class CategoryAdapter(private val itemList:ArrayList<Category>): RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imgPhoto:ImageView = itemView.findViewById(R.id.yoga)
        val title:TextView = itemView.findViewById(R.id.yogatext)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category,parent,false)
        return  MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val (image, title) = itemList[position]
        Glide.with(holder.itemView.context)
            .load(image)
            .into(holder.imgPhoto)

        holder.title.text = title
    }

    override fun getItemCount(): Int {
        return itemList.size
    }



}

