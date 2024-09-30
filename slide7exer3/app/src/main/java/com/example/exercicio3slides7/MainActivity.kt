package com.example.exercicio3slides7

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercicio3slides7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)





        binding.buttonLogin.setOnClickListener {


            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
        binding.buttonLogin.setOnClickListener {


            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
    }
}
