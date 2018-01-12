package com.example.francisco.calculojurospagamento

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainMenu : AppCompatActivity()   {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        btnCalcular.text = "Calcular"
         btnCalcular.setOnClickListener {
             val calculoIntent =  Intent(this, MainCalculo::class.java)
             startActivity(calculoIntent);
         }

        val btnNovoMes: Button = findViewById(R.id.btnNovoMes)
        btnNovoMes.setOnClickListener {
            val novomesIntent =  Intent(this, MainNovoMes::class.java)
            startActivity(novomesIntent);
         }

        val btnConfig: Button = findViewById(R.id.btnConfig)
        btnConfig.setOnClickListener {
            val configIntent =  Intent(this, MainConfig::class.java)
            startActivity(configIntent);
        }

        val btnSair: Button = findViewById(R.id.btnSair)
        btnSair.setOnClickListener {
            AlertDialog.Builder(this)
                    .setTitle("Notification")
                    .setMessage("Finalizando")
                    .setPositiveButton("Ok", { dialog, which -> }).show()
            finish()
        }
        // https://codelabs.developers.google.com/codelabs/build-your-first-android-app-kotlin/index.html?index=..%2F..%2Findex#7
    }

    /**
     fun jurosCalcular (view: View) {
            val calculoIntent =  Intent(this, MainCalculo::class.java)
            startActivity(calculoIntent);
      }

    fun jurosNovoMes (view: View) {
        val novomesIntent =  Intent(this, MainNovoMes::class.java)
        startActivity(novomesIntent);
    }

    fun jurosConfig (view: View) {
        val configIntent =  Intent(this, MainConfig::class.java)
        startActivity(configIntent);
    }

    fun jurosSair (view: View) {
        AlertDialog.Builder(this)
                .setTitle("Notification")
                .setMessage("Finalizando")
                .setPositiveButton("Ok", { dialog, which -> }).show()
       finish()

    }
     */
}
