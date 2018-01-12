package com.example.francisco.calculojurospagamento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main_resultado.*

class MainResultado : AppCompatActivity() {
  //  abstract const val FCO
  companion object {
      const val FCO = "total_count"
  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resultado)

        val resultado = intent.getIntExtra(FCO,0)
        txresulprest.text = Integer.toString(resultado)
        val btnSair: Button = findViewById(R.id.btnSair)
        btnSair.setOnClickListener {
            finish()
        }
    }
}
