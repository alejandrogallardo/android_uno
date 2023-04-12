package com.leksilab.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.leksilab.firstapp.uno.UnoAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludar = findViewById<AppCompatButton>(R.id.btnSaludar)
        btnSaludar.setOnClickListener { navigateToSaludoApp() }
    }

    private fun navigateToSaludoApp() {
        val intent = Intent(this, UnoAppActivity::class.java)
        startActivity(intent)
    }
}