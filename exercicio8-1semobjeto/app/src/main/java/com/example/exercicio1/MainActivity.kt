package com.example.exercicio1

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercicio1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val listautilizador = ArrayList<String>()

        listautilizador.add("joana")
        listautilizador.add("pedro")

        binding.listView.adapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, listautilizador)

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"olá  ${listautilizador.get(position)}", Toast.LENGTH_SHORT).show()
        }
    }}


