package com.example.exercidio3slide8

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercidio3slide8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

        private val binding by lazy {
            ActivityMainBinding.inflate(layoutInflater)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)


            val nomealuno = ArrayList<String>()


            nomealuno.add("joao")
            nomealuno.add("Ana")
            nomealuno.add("Eva")
            binding.listView.adapter =
                ArrayAdapter(this, android.R.layout.simple_list_item_1, nomealuno)
            val moradalista = ArrayList<String>()

            moradalista.add("Rua Rodrigues")
            moradalista.add("Rua Sé")
            moradalista.add("Rua das Flores")


            val email = ArrayList<String>()
            email.add("joao@gmail.com")
            email.add("ana@gmail.com")
            email.add("eva@gmail.com")




            binding.listView.setOnItemClickListener { parent, view, position, id ->



                val i: Intent = Intent(this, MainActivity2::class.java)
                i.putExtra("nomealuno", nomealuno[position])
                i.putExtra("moradalista", moradalista[position])
                i.putExtra("email", email[position])
                startActivity(i)


            }

        }

    }

