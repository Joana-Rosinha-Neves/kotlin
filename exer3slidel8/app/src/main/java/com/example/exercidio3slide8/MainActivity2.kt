package com.example.exercidio3slide8

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercidio3slide8.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

        private val binding by lazy {
            ActivityMain2Binding.inflate(layoutInflater)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            val i= intent
            val nomealuno= i.getStringExtra("nomealuno")
            val moradalista= i.getStringExtra("moradalista")
            val email= i.getStringExtra("email")

            binding.textViewNome.text = nomealuno
            binding.textViewMorada.text = moradalista
            binding.textViewEmail.text = email
        }
}