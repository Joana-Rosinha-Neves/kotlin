package com.example.a9exercicio3

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a9exercicio3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.btnSon.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(applicationContext, R.raw.ring)
            mediaPlayer.start()
        }
        binding.btnBell.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(applicationContext, R.raw.bell)
            mediaPlayer.start()

        }
        binding.btnRing.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(applicationContext, R.raw.bull)
            mediaPlayer.start()
        }
    }
}


