package com.example.fichapratica

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fichapratica.databinding.ActivityMain2Binding
import com.example.fichapratica.databinding.ActivityMain3Binding
import java.io.Serializable

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain3Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn4Validacao.setOnClickListener {

    ;

            val i = intent

            listutilizador =(List <Utilizador> getSerializable("list"))

            binding.btn4Validacao.setOnClickListener {

                val userput = binding.usernameInput.text.toString()
                val passput = binding.passwordInput.text.toString()


            if ((nome == userput && pass == passput)) {
                Toast.makeText(applicationContext, "login valido ", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity5::class.java)
                startActivity(intent)
            }

            else {

                //val intent = Intent(this, MainActivity3::class.java)
                // startActivity(intent)
                Toast.makeText(applicationContext, "login errado ", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity4::class.java)
                startActivity(intent)
            }



        }


    }
}