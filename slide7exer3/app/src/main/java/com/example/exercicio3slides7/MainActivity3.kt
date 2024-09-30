package com.example.exercicio3slides7

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercicio3slides7.databinding.ActivityMain2Binding
import com.example.exercicio3slides7.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain3Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn4Validacao.setOnClickListener {

        val i = intent
        val user = i.extras?.getString("user").toString()
        val pass = i.extras?.getString("pass").toString()

        val userput = binding.userId.text.toString()
        val passput= binding.passwordId.text.toString()


            if (user != userput || pass != passput) {
                //val intent = Intent(this, MainActivity3::class.java)
                // startActivity(intent)
                Toast.makeText(applicationContext, "login errado ", Toast.LENGTH_SHORT).show()


            } else {
                val intent = Intent(this, MainActivity4::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "login valido ", Toast.LENGTH_SHORT).show()

            }
        }
    }
}
