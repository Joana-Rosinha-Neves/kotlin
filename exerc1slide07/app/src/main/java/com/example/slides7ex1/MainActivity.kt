package com.example.slides7ex1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.slides7ex1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.editButtonConverterdolares.setOnClickListener {


            val name = binding.editNome.text.toString()
            val email = binding.editEmail.text.toString()
            val genero = binding.editGenero.text.toString()
            val telefone = binding.editTelefone.text.toString()
            val morada = binding.editMorada.text.toString()
            val i: Intent = Intent(this, MainActivity2::class.java)
            i.putExtra("name", name)
            i.putExtra("email", email)
            i.putExtra("telefone",telefone)
            i.putExtra("morada",morada)
            startActivity(i)
        }
    }
}

