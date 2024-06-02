 package com.example.praktek_mc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.praktek_mc.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val exampleList: List<ExampleItem> = generateDataList(100)

        binding.myRecyclerView.adapter = ExampleAdapter(exampleList)
        binding.myRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.myRecyclerView.setHasFixedSize(true)
    }
    private fun generateDataList(size: Int):List<ExampleItem>{
        val list = ArrayList<ExampleItem>()

        for (i in 0 until size){
            val drawable = when(i % 3){
                0 -> R.drawable.ic_android
                1 -> R.drawable.baseline_audio
                else -> R.drawable.baseline_sunny
            }

            val item = ExampleItem(drawable, "Name $i", "Phone Number $i")
            list += item
        }
        return list
    }
}