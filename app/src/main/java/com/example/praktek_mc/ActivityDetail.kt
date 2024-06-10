package com.example.praktek_mc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ActivityDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val image = intent.getParcelableExtra<Image>(ActivityModul7.INTENT_PARCELABLE)
        val imgSrc = findViewById<ImageView>(R.id.imageDetail)
        val imgTitle = findViewById<TextView>(R.id.imageTitle)
        val imgDesc = findViewById<TextView>(R.id.imageDesc)

        imgSrc.setImageResource(image!!.imageSrc)
        imgTitle.text = image.imageTitle
        imgDesc.text = image.imageDesc
    }
}