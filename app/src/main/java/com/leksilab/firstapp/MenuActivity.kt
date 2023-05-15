package com.leksilab.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.leksilab.firstapp.imccalculator.ImcCalculatorActivity
import com.leksilab.firstapp.superheroapp.SuperHeroListActivity
import com.leksilab.firstapp.todoapp.TodoActivity
import com.leksilab.firstapp.uno.UnoAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludar = findViewById<AppCompatButton>(R.id.btnSaludar)
        val btnImcApp = findViewById<AppCompatButton>(R.id.btnIMCApp)
        val btnTODO = findViewById<AppCompatButton>(R.id.btnTODO)
        val btnSuperHero = findViewById<AppCompatButton>(R.id.btnSuperHero)
        btnSaludar.setOnClickListener { navigateToSaludoApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTODOApp() }
        btnSuperHero.setOnClickListener { navigateToSuperHero() }
    }

    private fun navigateToTODOApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludoApp() {
        val intent = Intent(this, UnoAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperHero() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
}