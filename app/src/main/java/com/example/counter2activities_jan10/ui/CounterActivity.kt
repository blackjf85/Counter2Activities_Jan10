package com.example.counter2activities_jan10.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.counter2activities_jan10.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCounterBinding

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCounterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            counterTv.text = count.toString()

            countBtn.setOnClickListener {
                count++
                counterTv.text = count.toString()
            }

            nextBtn.setOnClickListener {
                val intent = Intent(this@CounterActivity, DisplayActivity::class.java)
                // adding data to bundle which is a HashMap that is part of intent class.
                intent.putExtra("Map", count)
                startActivity(intent)
            }

            // Grab text from edit text
            binding.nameEt.text.toString()

        }
    }

}