package com.example.nestedrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.model.AllCategory
import com.example.nestedrecyclerview.model.CategoryItem


class MainRecyclerAdapter(var contex:Context, var allCategory: ArrayList<AllCategory>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemCount(): Int {
        return allCategory.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(com.example.nestedrecyclerview.R.layout.parent_layout,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MainViewHolder){
            holder.catTitle.setText(allCategory[position].categoryTitle)
            refreshAdapter(holder.itemRecycler, allCategory[position].categoryItem)
        }
    }

    class MainViewHolder(var view: View):RecyclerView.ViewHolder(view){
        var catTitle = view.findViewById<TextView>(com.example.nestedrecyclerview.R.id.parent_item_title)
        var itemRecycler = view.findViewById<RecyclerView>(com.example.nestedrecyclerview.R.id.child_recyclerview)
    }

    fun refreshAdapter(recyclerView: RecyclerView, categoryItem:ArrayList<CategoryItem>){
        recyclerView.layoutManager = LinearLayoutManager(contex, RecyclerView.HORIZONTAL,false)
        var adapter = SecondRecyclerAdapter(contex, categoryItem)
        recyclerView.adapter = adapter
    }
}

