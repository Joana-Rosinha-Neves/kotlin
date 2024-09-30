package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent
        val valor = i.extras?.getString("valor")


        binding.editButtonConverterdolares.setOnClickListener {


            val valor2 = binding.editValordois.text.toString()

            val i: Intent = Intent(this, MainActivity3::class.java)

            i.putExtra("valordois", valor2)
            i.putExtra("valor", valor)
            startActivity(i)
        }
    }
}
