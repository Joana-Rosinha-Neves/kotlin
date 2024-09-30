package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain3Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent
        val valor = i.extras?.getString("valor").toString().toInt()
        val valor2 = i.extras?.getString("valordois").toString().toInt()
        val soma= valor + valor2
        val diferenca=valor - valor2
        val divisao=valor / valor2
        val produto  =valor * valor2


        binding.idSoma.text="$soma"
        binding.idProduto.text="$produto"
        binding.idDiferenca.text="$diferenca"
        binding.editDivisao.text="$divisao"




        }
    }
