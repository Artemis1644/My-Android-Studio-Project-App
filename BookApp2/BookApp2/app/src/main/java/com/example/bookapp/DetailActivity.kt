package com.example.bookapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val image = findViewById<ImageView>(R.id.detailImage)
        val title = findViewById<TextView>(R.id.detailTitle)
        val author = findViewById<TextView>(R.id.detailAuthor)
        val desc = findViewById<TextView>(R.id.detailDescription)

        // Вземаме данните от "пратката" (Intent)
        title.text = intent.getStringExtra("title")
        author.text = intent.getStringExtra("author")
        desc.text = intent.getStringExtra("description")
        image.setImageResource(intent.getIntExtra("image", 0))
    }
}