package com.example.nestedrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.model.CategoryItem

class SecondRecyclerAdapter(var contex: Context, var categoryItem: ArrayList<CategoryItem>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun getItemCount(): Int {
        return categoryItem.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SecondViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.child_layout,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is SecondViewHolder){
            holder.itemImage.setImageResource(categoryItem[position].itemURL)
        }
    }

    class SecondViewHolder(var view:View):RecyclerView.ViewHolder(view){
        var itemImage = view.findViewById<ImageView>(R.id.img_child_item)
    }
}