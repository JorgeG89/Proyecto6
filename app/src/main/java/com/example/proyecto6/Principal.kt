package com.example.proyecto6

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Principal : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Trabajo de Jorge Mañas Garcia
        val boton = findViewById<Button>(R.id.boton)
        val lado = findViewById<EditText>(R.id.numero1)
        val resultado = findViewById<TextView>(R.id.resultado)

        boton.setOnClickListener {
            val val1 = lado.text.toString().toInt()
            val perimetro = val1*4

            resultado.text = "El perimetro del cuadrado es $perimetro"
        }
    }
}