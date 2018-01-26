package com.example.francisco.calculojurospagamento

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main_resultado.*
import kotlinx.android.synthetic.main.activity_main_resultado.view.*
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.NumberFormat

class MainResultado : AppCompatActivity() {
  //  abstract const val FCO
  companion object {
      const val FCO1 = "vlr prestacao"
      const val FCO2 = "vlr juros"
      const val FCO3 = "dias"
      const val FCO4 = "vlr pc"
      const val FCO5 = "juros pc"
  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resultado)

      //  val resultado = intent.getDoubleExtra(FCO,0)
        val resultado1 = intent.getDoubleExtra(FCO1,0.0)
        val resultado2 = intent.getDoubleExtra(FCO2,0.0)
        val resultado3 = intent.getIntExtra(FCO3,0)
        val resultado4 = intent.getDoubleExtra(FCO4,0.0)
        val resultado5 = intent.getDoubleExtra(FCO5,0.0)

       // AlertDialog.Builder(this)
       //         .setTitle("Juros")
       //         .setMessage("Valor-A $resultado1")
       //         .setPositiveButton("Ok", { dialog, which -> }).show()

       // AlertDialog.Builder(this)
       //         .setTitle("Juros")
       //         .setMessage("Valor-B $resultado2")
       //         .setPositiveButton("Ok", { dialog, which -> }).show()

        //Resultado Calculo Valor Prestação

        var valorpre = resultado1.toString()
        valorpre = valorpre.replace(".",",")
        var valorjurospre = resultado2.toString()
        valorjurospre = valorjurospre.replace(".",",")
        var valortotpre = (resultado1 + resultado2).toString()
        valortotpre = valortotpre.replace(".",",")

        txdias.text = resultado3.toString() + " Dia(s) do Vencimento"

        txdias.textSize = 20F
        txvlrprest.text        = valorpre
        txvlrprest.textSize    = 25F
        txvlrprest.setTextColor(0xff000000.toInt())
        txvlrjurospre.text     = valorjurospre
        txvlrjurospre.textSize = 25F
        txvlrjurospre.setTextColor(0xff0000ff.toInt())
        txtotalprest.text      = valortotpre
        txtotalprest.textSize  = 30F
        txtotalprest.setTextColor(0xff0000ff.toInt())

        //Resultao Calculo Valor PorConta
        var valorpc = resultado4.toString()
        valorpc =  valorpc.replace(".",",")
        txvlrpc.text       = valorpc
        txvlrpc.textSize    = 25F
        var valorjupc = resultado5.toString()
        valorjupc =  valorjupc.replace(".",",")
        txvlrjurpc.text     = valorjupc
        txvlrjurpc.textSize = 25F
        var valortotpc = (resultado4 + resultado5).toString()
        valortotpc = valortotpc.replace(".",",")
        txtotpc.text = valortotpc
        txtotpc.textSize = 25F
        val btnSair: Button    = findViewById(R.id.btnSair)
        btnSair.setOnClickListener {
           finish()
        }
    }
}
