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

      //  val resultado = intent.getDoubleExtra(FCO,0)
        val resultado = intent.getDoubleExtra(FCO,0.0)

        AlertDialog.Builder(this)
                .setTitle("Juros")
                .setMessage("Valor $resultado")
                .setPositiveButton("Ok", { dialog, which -> }).show()

        //txresulprest.text = Integer.toString(resultado)
        txresulprest.text = resultado.toString()
        val btnSair: Button = findViewById(R.id.btnSair)
        btnSair.setOnClickListener {
            finish()
        }
    }
}
