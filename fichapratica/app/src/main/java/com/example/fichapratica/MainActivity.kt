package com.example.fichapratica

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fichapratica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)





        binding.buttonRegisto.setOnClickListener {


            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
        binding.buttonLogin.setOnClickListener {


            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        binding.buttonRecuperarPassword.setOnClickListener {


            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }}

