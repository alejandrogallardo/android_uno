package com.leksilab.firstapp.componentes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.leksilab.firstapp.R

class TextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        var tvExample = findViewById<TextView>(R.id.tvExample)

        /* Funcion de alcance
        tvExample.apply {
            setTextColor(Color.CYAN)
            text = "Hola perros"
            setOnClickListener {
                setTextColor(Color.GREEN)
            }
        }*/

        tvExample.setTextColor(Color.CYAN)
        tvExample.text = "Hola perros"

        tvExample.setOnClickListener {
            Toast.makeText(this, "Texto Cliclado", Toast.LENGTH_SHORT).show()
            tvExample.setTextColor(Color.GREEN)
        }

        var editTextUno = findViewById<EditText>(R.id.editTextUno)
        editTextUno.addTextChangedListener {
            if (editTextUno.text.length == 0) editTextUno.setError("Este campo esta vacio")
        }

    }
}