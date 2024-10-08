package com.example.slides8ex1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.slides8ex1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val listautilizador = ArrayList<Utilizador>()

        listautilizador.add(Utilizador("username"))

        binding.listView.adapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, listautilizador)

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, listautilizador.get(position).username, Toast.LENGTH_SHORT).show()
        }
    }}


