package com.example.relogio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.relogio.databinding.ActivityFullscreenBinding
import com.example.relogio.databinding.ActivityMainBinding




    class MainActivity : AppCompatActivity() {

        private val binding by lazy {
            ActivityMainBinding.inflate(layoutInflater)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.buttonAvancar.setOnClickListener {
                val intent = Intent(this,FullscreenActivity::class.java)
                startActivity(intent)
            }
        }
    }
