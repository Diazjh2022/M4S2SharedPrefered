package com.heltonbustos.ejemplocorrutinas01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.m4s2sharedprefered.R

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        var usuario = intent.getStringExtra("usuario")
        var textView: TextView = findViewById(R.id.textView)
        textView.text = usuario
    }
}