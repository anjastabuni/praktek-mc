package com.example.praktek_mc

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.praktek_mc.databinding.ActivityLinkBinding

class ActivityLink : AppCompatActivity() {
    private lateinit var binding: ActivityLinkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_link)

        binding = ActivityLinkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.modul5.setOnClickListener {
            startActivity(Intent(this, ActivityModul5::class.java))
        }
        binding.modul6.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.modul7.setOnClickListener {
            startActivity(Intent(this, ActivityModul7::class.java))
        }
        binding.modul8.setOnClickListener {
            startActivity(Intent(this, ActivityModul8::class.java))
        }
    }
}