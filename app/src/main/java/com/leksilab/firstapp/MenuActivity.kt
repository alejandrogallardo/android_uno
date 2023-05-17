package com.leksilab.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.leksilab.firstapp.componentes.ComponentesActivity
import com.leksilab.firstapp.dogapp.DogListActivity
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
        val btnDogApp = findViewById<AppCompatButton>(R.id.btnDogApp)
        val btnComponentes = findViewById<AppCompatButton>(R.id.btnComponentes)

        btnSaludar.setOnClickListener { navigateToSaludoApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTODOApp() }
        btnSuperHero.setOnClickListener { navigateToSuperHero() }
        btnDogApp.setOnClickListener { navigateToDogApp() }
        btnComponentes.setOnClickListener { navigateToComponentes() }
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

    private fun navigateToDogApp() {
        val intent = Intent(this, DogListActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToComponentes() {
        val intent = Intent(this, ComponentesActivity::class.java)
        startActivity(intent)
    }
}