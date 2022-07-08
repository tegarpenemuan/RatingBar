package com.tegarpenemuan.ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tegarpenemuan.ratingbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val rating = binding.ratingBar1.rating.toString()
            Toast.makeText(applicationContext, "Rating:"+rating, Toast.LENGTH_SHORT).show()
            binding.ratingResult.rating = rating.toFloat()
        }
    }
}