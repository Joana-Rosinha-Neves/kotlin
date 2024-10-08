package com.example.slide8exercicio2

import android.R
import android.app.ProgressDialog.show
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.slide8exercicio2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

        private val binding by lazy {
            ActivityMainBinding.inflate(layoutInflater)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)


            val listavalor = ArrayList<Int>()






            binding.editButtonadd.setOnClickListener {

                listavalor.add(binding.editNumero.text.toString().toInt())
                binding.listView.adapter =
                    ArrayAdapter(this, R.layout.simple_list_item_1, listavalor)

            }
            binding.listView.setOnItemClickListener { parent, view, position, id ->
                Toast.makeText(this, listavalor.get(position).toString(), Toast.LENGTH_SHORT)
                    .show()
            }

        }
    }

