package com.example.ejercicio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EjercicioContadorPulsacionesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.ejercicio_contador_pulsaciones)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var contador = findViewById<TextView>(R.id.contador)
        var valor = contador.text.toString().toInt()
        var botonTop = findViewById<Button>(R.id.botonTop)
        var botonBottom = findViewById<Button>(R.id.botonBottom)

        botonTop.setOnClickListener {
            valor++
            contador.text = valor.toString()
        }

        botonBottom.setOnClickListener {
            valor++
            contador.text = valor.toString()
        }
    }
}