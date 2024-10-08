package com.example.fichapratica

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fichapratica.databinding.ActivityMain2Binding
import com.example.fichapratica.databinding.ActivityMainBinding
import java.io.Serializable

class MainActivity2 : AppCompatActivity() {


        private val binding by lazy {
            ActivityMain2Binding.inflate(layoutInflater)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            {
                {

                    val listautilizador = ArrayList<Utilizador>()


                    binding.btnrRegisto.setOnClickListener {
                        listautilizador.add(
                            Utilizador(
                                binding.nome.text.toString(),
                                binding.pass.text.toString(),
                                binding.telefone.text.toString(),
                                binding.morada.text.toString()
                            )
                        )
                        binding.listView.adapter =
                            ArrayAdapter(this, android.R.layout.simple_list_item_1, listautilizador)
                        val i = intent

                        intent.putExtra("list ", (Serializable) listautilizador)

                    }
                }
            }






