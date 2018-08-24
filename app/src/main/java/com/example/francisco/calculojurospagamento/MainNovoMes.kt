package com.example.francisco.calculojurospagamento

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main_novo_mes.*

class MainNovoMes : AppCompatActivity() {


    lateinit var usersDBHelper: UsersDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_novo_mes)

        usersDBHelper = UsersDBHelper(this)

        val btnNovoMes2: Button = findViewById(R.id.btnNovoMes2)

        var juroscsv: List<String> = applicationContext.assets.open("francisco/juratraso.csv").bufferedReader().use {
            it.readLines()
        }

        btnNovoMes2.setOnClickListener {
            //val novomesIntent = Intent(this, MainNovoMes::class.java)
            msgatua.setText("Atualizando")
            usersDBHelper.atualizatabela(juroscsv)
            //startActivity(novomesIntent);
        }

        val NMSair: Button    = findViewById(R.id.NMSair)
        NMSair.setOnClickListener {
            finish()
        }

    }
}