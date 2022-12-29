package com.example.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.nestedrecyclerview.adapter.MainRecyclerAdapter
import com.example.nestedrecyclerview.model.AllCategory
import com.example.nestedrecyclerview.model.CategoryItem

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }
    fun initviews(){
        recyclerView = findViewById(R.id.parent_recyclerview)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshAdapter(prepareCats())
    }
    fun refreshAdapter(catTitle:ArrayList<AllCategory>){
        var adapter = MainRecyclerAdapter(this,catTitle)
        recyclerView.adapter = adapter
    }

    fun prepareCats():ArrayList<AllCategory>{
        var categoryItem1 = ArrayList<CategoryItem>()
        categoryItem1.add(CategoryItem(R.drawable.recommended1))
        categoryItem1.add(CategoryItem(R.drawable.recommended2))
        categoryItem1.add(CategoryItem(R.drawable.recommended3))
        categoryItem1.add(CategoryItem(R.drawable.recommended4))
        categoryItem1.add(CategoryItem(R.drawable.recommended5))

        var categoryItem2 = ArrayList<CategoryItem>()
        categoryItem2.add(CategoryItem(R.drawable.action1))
        categoryItem2.add(CategoryItem(R.drawable.action2))
        categoryItem2.add(CategoryItem(R.drawable.action3))
        categoryItem2.add(CategoryItem(R.drawable.action4))
        categoryItem2.add(CategoryItem(R.drawable.action5))

        var categoryItem3 = ArrayList<CategoryItem>()
        categoryItem3.add(CategoryItem(R.drawable.comedy1))
        categoryItem3.add(CategoryItem(R.drawable.comedy2))
        categoryItem3.add(CategoryItem(R.drawable.comedy3))
        categoryItem3.add(CategoryItem(R.drawable.comedy4))
        categoryItem3.add(CategoryItem(R.drawable.comedy5))

        var categoryItem4 = ArrayList<CategoryItem>()
        categoryItem4.add(CategoryItem(R.drawable.cartoon1))
        categoryItem4.add(CategoryItem(R.drawable.cartoon2))
        categoryItem4.add(CategoryItem(R.drawable.cartoon3))
        categoryItem4.add(CategoryItem(R.drawable.cartoon4))
        categoryItem4.add(CategoryItem(R.drawable.cartoon5))

        var categoryItem5 = ArrayList<CategoryItem>()
        categoryItem5.add(CategoryItem(R.drawable.horror1))
        categoryItem5.add(CategoryItem(R.drawable.horror2))
        categoryItem5.add(CategoryItem(R.drawable.horror3))
        categoryItem5.add(CategoryItem(R.drawable.horror4))
        categoryItem5.add(CategoryItem(R.drawable.horror5))

        var catTitle = ArrayList<AllCategory>()
        catTitle.add(AllCategory("Recommended for you", categoryItem1))
        catTitle.add(AllCategory("Action", categoryItem2))
        catTitle.add(AllCategory("Comedy", categoryItem3))
        catTitle.add(AllCategory("Cartoon", categoryItem4))
        catTitle.add(AllCategory("Horror", categoryItem5))

        return catTitle
    }
}