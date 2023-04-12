package com.leksilab.firstapp.uno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.leksilab.firstapp.R

class UnoAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uno_app)
        var btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        var etName = findViewById<AppCompatEditText>(R.id.etName)
        btnStart.setOnClickListener {
            val name = etName.text.toString()
            if (name.isNotEmpty()) {
//                Log.i("Leksilab", "Mensage: $name")
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    }
}