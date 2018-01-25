package com.example.francisco.calculojurospagamento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main_resultado.*

class MainResultado : AppCompatActivity() {
  //  abstract const val FCO
  companion object {
      const val FCO1 = "vlr prestacao"
      const val FCO2 = "vlr juros"
  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resultado)

      //  val resultado = intent.getDoubleExtra(FCO,0)
        val resultado1 = intent.getDoubleExtra(FCO1,0.0)
        val resultado2 = intent.getDoubleExtra(FCO2,0.0)

       // AlertDialog.Builder(this)
       //         .setTitle("Juros")
       //         .setMessage("Valor-A $resultado1")
       //         .setPositiveButton("Ok", { dialog, which -> }).show()

       // AlertDialog.Builder(this)
       //         .setTitle("Juros")
       //         .setMessage("Valor-B $resultado2")
       //         .setPositiveButton("Ok", { dialog, which -> }).show()

        //Resultado Calculo Valor Prestação
        txvlrprest.text        = resultado1.toString()
        txvlrprest.textSize    = 25F
        txvlrjurospre.text     = resultado2.toString()
        txvlrjurospre.textSize = 25F
     //   txvlrjurospre.textColors = "100"
        txtotalprest.text      = (resultado1 + resultado2).toString()
        txtotalprest.textSize  = 30F

        //Resultao Calculo Valor PorConta
        val btnSair: Button    = findViewById(R.id.btnSair)
        btnSair.setOnClickListener {
           finish()
        }
    }
}
