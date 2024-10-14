package com.example.a9ex1

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a9ex1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("chave", Context.MODE_PRIVATE)
        val userds = sharedPreferences.getString("username", "").toString()
        binding.editUser.setText(userds)


        binding.btnLog.setOnClickListener {

            val nome: String = binding.editUser.text.toString();
            val pass: String = binding.editPass.text.toString();


            if (nome != "user" || pass != "pass") {

                Toast.makeText(applicationContext, "login errado ", Toast.LENGTH_SHORT).show()


            } else {

                val editor: SharedPreferences.Editor = sharedPreferences.edit()
                editor.putString(
                    "username",
                    binding.editUser.text.toString()
                )


                editor.apply()


                Toast.makeText(applicationContext, "login valido ", Toast.LENGTH_SHORT).show()

            }
        }
    }
}

