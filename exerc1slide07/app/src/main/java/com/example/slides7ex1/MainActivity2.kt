package com.example.slides7ex1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.slides7ex1.databinding.ActivityMain2Binding
import com.example.slides7ex1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

val i= intent
        val nome= i.extras?.getString("name")
        val email= i.extras?.getString("email")
        val genero= i.extras?.getString("genero")
        val telefone= i.extras?.getString("telefone")
        val morada= i.extras?.getString("morada")
        binding.textResultado.text="ola ${nome} mora na $morada, tem o telefone $telefone e o email ${email}"


        }
    }



