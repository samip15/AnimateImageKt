package com.sam.imagezoomanimatekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.iv_image)
        imageView.setOnClickListener {
            imageView.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction{
                imageView.animate().apply {
                    duration = 1000
                    rotationYBy(3600f)
                }.start()
            }
        }
    }
}