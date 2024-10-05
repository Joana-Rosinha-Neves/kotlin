package com.example.exercicio3slides7

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercicio3slides7.databinding.ActivityMain2Binding
import com.example.exercicio3slides7.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnRegisto.setOnClickListener {


            val nome: String = binding.idUser.text.toString();
            val pass: String = binding.idPass.text.toString();

            val i: Intent = Intent(this, MainActivity3::class.java)
            i.putExtra("nome", nome)
            i.putExtra("pass", pass)
            startActivity(i)


        }
    }
}
