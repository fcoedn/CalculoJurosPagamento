package com.example.francisco.calculojurospagamento

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_calculo.*
import kotlinx.android.synthetic.main.activity_main_menu.*
import java.math.RoundingMode
import java.text.DateFormat
import java.text.DecimalFormat
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

class MainCalculo : AppCompatActivity() {

    lateinit var usersDBHelper : UsersDBHelper

    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_calculo)

        usersDBHelper = UsersDBHelper(this)

        // Data Atual
        val DtPagamento: TextView = findViewById(R.id.DtPagamento)
        DtPagamento.text = SimpleDateFormat("dd.MM.yyyy").format(System.currentTimeMillis())
        DtPagamento.setOnClickListener {
            var cal = Calendar.getInstance()

            val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                val myFormat = "dd.MM.yyyy" // mention the format you need
                val sdf = SimpleDateFormat(myFormat, Locale.US)
                DtPagamento.text = sdf.format(cal.time)
            }

            DatePickerDialog(this@MainCalculo, dateSetListener,
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
        }

        // Data do Vencimento
        val DtVencimento: TextView = findViewById(R.id.DtVencimento)
        DtVencimento.text = SimpleDateFormat("dd.MM.yyyy").format(System.currentTimeMillis())
        DtVencimento.setOnClickListener {
            var cal = Calendar.getInstance()

            val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                val myFormat = "dd.MM.yyyy" // mention the format you need
                val sdf = SimpleDateFormat(myFormat, Locale.US)
                DtVencimento.text = sdf.format(cal.time)
            }

            DatePickerDialog(this@MainCalculo, dateSetListener,
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
        }

        // Calculo dos Juros
        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        //btnCalcular.text = "Rogerio"
        btnCalcular.setOnClickListener {
            val vlraPagar: EditText = findViewById(R.id.VlrPagar)
            val a: String = vlraPagar.text.toString()


            if (a.isEmpty()) {
               Toast.makeText(applicationContext,"Valor Incorreto", Toast.LENGTH_SHORT).show()
            } else {

                  val DtVencimento1 = DtVencimento.text
                  val buscaVenc = "DTI" + DtVencimento1.substring(6,10) + DtVencimento1.substring(3,5) +
                          DtVencimento1.substring(0,2)
                  val DtPagamento1 = DtPagamento.text
                  val buscaPagto = "DTI" + DtPagamento1.substring(6,10) + DtPagamento1.substring(3,5) +
                        DtPagamento1.substring(0,2)

                  //AlertDialog.Builder(this)
                  //        .setTitle("Juros")
                  //        .setMessage("Valor $buscaVenc")
                  //        .setPositiveButton("Ok", { dialog, which -> }).show()

                //var users = usersDBHelper.readUser("DTI20180122")
                   val vl_taxa_vencimento: Double = usersDBHelper.readUser1(buscaVenc)
                   val vl_taxa_pagamento: Double = usersDBHelper.readUser1(buscaPagto)
                   // users.forEach {
                   //     var tv_user = TextView(this)
                   //     tv_user.text = it.cd_chave.toString() + " - " + it.vl_taxa.toString()
                   //     val c = a.toDouble() * it.vl_taxa
                   // }
                val vl_temp1: Double = a.toDouble() / vl_taxa_vencimento.toDouble()
                val vl_temp2: Double = vl_temp1 * vl_taxa_pagamento
                // Multa
                val vl_calcmulta: Double = vl_temp2 * (0.20 * 23) / 100
                val vl_final1: Double = (vl_temp2 + vl_calcmulta) - a.toDouble()
                val vl_final2: Double = vl_final1 * 100
                val vl_final3:Int = vl_final2.toInt()
                val vl_final4: Double = (vl_final3.toDouble() / 100) * 10
                val df = DecimalFormat("###")
                df.roundingMode = RoundingMode.CEILING
                val vl_final5  = df.format(vl_final4)
                val vl_final6: Double = (vl_final5.toDouble() / 10 ) * 100
                val vl_final7: Double = vl_final6 / 100
                val b: Double = vl_final7.toDouble()
                //result.setText(e.toString())

              //  AlertDialog.Builder(this)
              //          .setTitle("Juros")
              //          .setMessage("Valor $vl_taxa_pagamento")
              //          .setPositiveButton("Ok", { dialog, which -> }).show()

               // conts val FCO
                val resultadoIntent =  Intent(this, MainResultado::class.java)
              //  resultadoIntent.putExtra(MainResultado.FCO,b)
                resultadoIntent.putExtra(MainResultado.FCO1,a.toDouble())
                resultadoIntent.putExtra(MainResultado.FCO2,b)
                startActivity(resultadoIntent);
            }
        }
    }

    // Antes chamado pelo activity_main_calculo.xml
    //fun infdtpagamento1 (view: View) {

    //    val textView: TextView = findViewById(R.id.DtPagamento)
        //textView.text = SimpleDateFormat("dd.MM.yyyy").format(System.currentTimeMillis())

    //    var cal = Calendar.getInstance()

     //   val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
     //       cal.set(Calendar.YEAR, year)
     //       cal.set(Calendar.MONTH, monthOfYear)
     //       cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

     //       val myFormat = "dd.MM.yyyy" // mention the format you need
     //       val sdf = SimpleDateFormat(myFormat, Locale.US)
     //       textView.text = sdf.format(cal.time)

     //   }

     //  textView.setOnClickListener {
     //       DatePickerDialog(this@MainCalculo, dateSetListener,
     //               cal.get(Calendar.YEAR),
     //               cal.get(Calendar.MONTH),
     //               cal.get(Calendar.DAY_OF_MONTH)).show()
     //   }

    //}

    //fun infdtvencimento (view: View) {

     //   val textView: TextView = findViewById(R.id.DtPagamento)
        //textView.text = SimpleDateFormat("dd.MM.yyyy").format(System.currentTimeMillis())

     //   var cal = Calendar.getInstance()

     //   val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
     //       cal.set(Calendar.YEAR, year)
     //       cal.set(Calendar.MONTH, monthOfYear)
     //       cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

     //       val myFormat = "dd.MM.yyyy" // mention the format you need
    //        val sdf = SimpleDateFormat(myFormat, Locale.US)
     //       textView.text = sdf.format(cal.time)

     //   }

        //  textView.setOnClickListener {
     //   DatePickerDialog(this@MainCalculo, dateSetListener,
     //           cal.get(Calendar.YEAR),
     //           cal.get(Calendar.MONTH),
     //           cal.get(Calendar.DAY_OF_MONTH)).show()
        // }

    //}
}
