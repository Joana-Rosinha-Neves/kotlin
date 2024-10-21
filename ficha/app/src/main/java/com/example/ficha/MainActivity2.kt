package com.example.ficha

import android.R
import android.app.ProgressDialog.show
import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.service.autofill.Validators.or
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ficha.databinding.ActivityMain2Binding
import com.example.ficha.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        val listacompras = ArrayList<String>()
        binding.imageadicionar.setOnClickListener {

            val novop = binding.novoProduto.text.toString()
            val resultado = binding.textResultado.toString()

            listacompras.add(novop)
            if( novop != null)
            {


                binding.textResultado.adapter =
                    ArrayAdapter(this, R.layout.simple_list_item_1, listacompras)
                binding.textResultado.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listacompras.mapIndexed { index, item ->
                    "${index + 1}. $item"


                })
            }



                    binding.btmRemover.setOnClickListener {
                        val novoproduto = binding.removerProduto.text.toString().toInt()


                        if (novoproduto in 1..listacompras.size) {


                        listacompras.removeAt(novoproduto - 1)



                        binding.textResultado.adapter =
                            ArrayAdapter(this, R.layout.simple_list_item_1, listacompras.mapIndexed { index, item ->
                                "${index + 1}. $item"})


                            }
                binding.btnVoltar.setOnClickListener {

                    val intent = Intent(this,MainActivity::class.java)
                    startActivity(intent)


                }}}}}

