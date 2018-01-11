package com.example.francisco.calculojurospagamento

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import java.text.SimpleDateFormat

class MainCalculo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_calculo)

        val textView: TextView = findViewById(R.id.TxDtPagamento)
        textView.text = SimpleDateFormat("dd.MM.yyyy").format(System.currentTimeMillis())



    }
}
