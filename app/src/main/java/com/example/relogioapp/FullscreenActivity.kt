package com.example.relogioapp

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.relogioapp.databinding.ActivityFullscreenBinding

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {


    private val binding by lazy {
        ActivityFullscreenBinding.inflate(layoutInflater)
    }


    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(binding.root)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                window.insetsController?.hide(WindowInsets.Type.statusBars())
            } else {
                window.addFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN
                )
            }

            window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

            val bateriaReceiver: BroadcastReceiver = object : BroadcastReceiver() {
                override fun onReceive(context: Context?, intent: Intent?) {
                    if (intent != null) {
                        val nivel: Int = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0)

                        Toast.makeText(applicationContext, nivel.toString(), Toast.LENGTH_SHORT).show()
                        binding.checkBateria.text = nivel.toString() + "%"
                    }
                }
            }

            registerReceiver(bateriaReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))



            binding.checkBateria.setOnClickListener {
                var isChecked = binding.checkBateria.isChecked
                if (isChecked) {
                    binding.nivel_de_bateria.visibility = View.VISIBLE
                } else {
                    binding.niveldebateria.visibility = View.GONE
                }
            }

            binding.layoutMenu.animate().translationY(500F)

            binding.imagePreferences.setOnClickListener {

                binding.layoutMenu.animate().translationY(0F).setDuration(
                    resources.getInteger(android.R.integer.config_mediumAnimTime).toLong()
                )
                binding.imagePreferences.visibility = View.GONE
            }

            binding.imageViewFechar.setOnClickListener {
                binding.imagePreferences.visibility = View.VISIBLE
                binding.layoutMenu.animate()
                    .translationY(binding.layoutMenu.measuredHeight.toFloat()).setDuration(
                    resources.getInteger(android.R.integer.config_mediumAnimTime).toLong()
                )


            }


        }


    }

