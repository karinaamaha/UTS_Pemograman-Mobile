package com.example.utsmobile.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.Goal
import com.example.utsmobile.R


class GoalAdapter(private val listGoal: ArrayList<Goal>): RecyclerView.Adapter<GoalAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.tv_item_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.goal,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGoal.size
}

override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    val (name) = listGoal[position]
    holder.title.text = name
    }
}
