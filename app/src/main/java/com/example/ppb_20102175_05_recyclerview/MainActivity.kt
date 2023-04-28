package com.example.ppb_20102175_05_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ppb_20102175_05_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listStudent = arrayListOf(
            MyContact("20102175", "Intan Nuraeni", "085225791931","https://i.pinimg.com/474x/56/2e/be/562ebed9cd49b9a09baa35eddfe86b00.jpg"),
            MyContact("20102176", "Mawar", "085225791922","https://i.pinimg.com/474x/56/2e/be/562ebed9cd49b9a09baa35eddfe86b00.jpg"),
            MyContact("20102177", "jasmine", "081287677653","https://i.pinimg.com/474x/56/2e/be/562ebed9cd49b9a09baa35eddfe86b00.jpg"),
            MyContact("20102178", "Melati", "086787677986","https://i.pinimg.com/474x/56/2e/be/562ebed9cd49b9a09baa35eddfe86b00.jpg"),
            MyContact("20102179", "Dahlia Tri", "081234567654","https://i.pinimg.com/474x/56/2e/be/562ebed9cd49b9a09baa35eddfe86b00.jpg"),
            MyContact("20102112", "Mustika Ratu", "082345765897","https://i.pinimg.com/474x/56/2e/be/562ebed9cd49b9a09baa35eddfe86b00.jpg"),
            MyContact("20102113", "Angelina Ratu", "082343678903","https://i.pinimg.com/474x/56/2e/be/562ebed9cd49b9a09baa35eddfe86b00.jpg"),
            MyContact("20102114", "Arinda", "081564789098","https://i.pinimg.com/474x/56/2e/be/562ebed9cd49b9a09baa35eddfe86b00.jpg"),
            MyContact("20102115", "Helga Abhinayah", "081112343657","https://i.pinimg.com/474x/56/2e/be/562ebed9cd49b9a09baa35eddfe86b00.jpg"),
            MyContact("20102116", "Akila", "085225654789","https://i.pinimg.com/474x/56/2e/be/562ebed9cd49b9a09baa35eddfe86b00.jpg"),
        )
        cardView(listStudent)

    }

    private fun listView(value : ArrayList<MyContact>){
        val adapter = ListViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun gridView(value : ArrayList<MyContact>){
        val adapter = GridViewAdapter(this,value)

        val layoutManager = GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun cardView(value : ArrayList<MyContact>){
        val adapter = CardViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}