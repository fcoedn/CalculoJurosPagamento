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
import java.util.*

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

        val format = NumberFormat.getCurrencyInstance(Locale("pt","br"))
        //AlertDialog.Builder(this)
        //        .setTitle("Juros")
        //        .setMessage("Valor-A $resultado4")
        //        .setPositiveButton("Ok", { dialog, which -> }).show()

        //AlertDialog.Builder(this)
        //        .setTitle("Juros")
        //        .setMessage("Valor-B $resultado5")
        //        .setPositiveButton("Ok", { dialog, which -> }).show()

        //Resultado Calculo Valor Prestação

        //var valorpre = resultado1.toString()
        var valorpre: String = format.format(resultado1)
        //valorpre = valorpre.replace(".",",")

        var valorjurospre: String = format.format(resultado2)
        //valorjurospre = valorjurospre.replace(".",",")

        //var valortotpre = (resultado1 + resultado2).toString()
        //valortotpre = valortotpre.replace(".",",")
        var valortotpre: String = format.format(resultado1+resultado2)

        txdias.text = resultado3.toString() + " Dia(s) do Vencimento"

        txdias.textSize = 20F
        txvlrprest.text        = valorpre
        txvlrprest.textSize    = 25F
        txvlrprest.setTextColor(0xff000000.toInt())
        txvlrjurospre.text     = valorjurospre
        txvlrjurospre.textSize = 25F
        txvlrjurospre.setTextColor(0xff0000ff.toInt())
        txtotalprest.text      = valortotpre
        txtotalprest.textSize  = 27F
        txtotalprest.setTextColor(0xff0000ff.toInt())


        var las1: String = format.format(resultado4)
        var las2: String = format.format(resultado5)


        //AlertDialog.Builder(this)
        //        .setTitle("Juros")
        //        .setMessage("Valor-C $las1")
         //       .setPositiveButton("Ok", { dialog, which -> }).show()

        //Resultao Calculo Valor PorConta
        //var valorpc = resultado4.toString()
        var valorpc = las1
        //valorpc =  valorpc.replace(".",",")
        txvlrpc.text       = valorpc
        txvlrpc.textSize    = 25F

        //var valorjupc = resultado5.toString()
        var valorjupc = las2
        //valorjupc =  valorjupc.replace(".",",")
        txvlrjurpc.text     = valorjupc
        txvlrjurpc.textSize = 25F

        //var valortotpc = (resultado4 + resultado5).toString()
        var las3: String = format.format(resultado4+resultado5)
        //valortotpc = valortotpc.replace(".",",")
        var valortotpc = las3
        txtotpc.text = valortotpc
        txtotpc.textSize = 27F

        val btnSair: Button    = findViewById(R.id.btnSair)
        btnSair.setOnClickListener {
           finish()
        }
    }
}
