package com.leksilab.firstapp.componentes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.leksilab.firstapp.R

class ComponentesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_componentes)

        val btnPaletteText = findViewById<AppCompatButton>(R.id.btnPaletteText)

        btnPaletteText.setOnClickListener { navigateToText() }
    }

    private fun navigateToText() {
        val intent = Intent(this, TextActivity::class.java)
        startActivity(intent)
    }
}