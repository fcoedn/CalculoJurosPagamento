package com.example.francisco.calculojurospagamento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button

class MainResultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resultado)

        val btnSair: Button = findViewById(R.id.btnSair)
        btnSair.setOnClickListener {
            finish()
        }
    }
}
