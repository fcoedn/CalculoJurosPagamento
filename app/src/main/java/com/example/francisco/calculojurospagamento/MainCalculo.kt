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

            val DtVencimento1 = DtVencimento.text
            val buscaVenc = "GP2" + DtVencimento1.substring(6,10) + DtVencimento1.substring(3,5) +
                    DtVencimento1.substring(0,2)
            val DtPagamento1 = DtPagamento.text
            val buscaPagto = "GP2" + DtPagamento1.substring(6,10) + DtPagamento1.substring(3,5) +
                    DtPagamento1.substring(0,2)

            val myFrmDate = "dd.MM.yyyy"
            val dfd = SimpleDateFormat(myFrmDate)
            val dtPagar: Date = dfd.parse(DtPagamento1.toString())
            val dtVenc: Date = dfd.parse(DtVencimento1.toString())

            //val compResult1 = when {
            //    date1 < date2 -> "BEFORE"
            //    date1 > date2 -> "AFTER"
            //    else -> "WITH"
            //}
            var numDias: Long = (dtPagar.time - dtVenc.time) / (24*60*60*1000)
            var numDiasC = when {numDias > 150 -> 150
                            else -> numDias}
            if (a.isEmpty()) {
                Toast.makeText(applicationContext, "Valor Incorreto", Toast.LENGTH_SHORT).show()
             }
             else if (dtPagar <= dtVenc) {
                   Toast.makeText(applicationContext,"Data Pagamento Incorreta", Toast.LENGTH_SHORT).show()
             }
             else {
                 // AlertDialog.Builder(this)
                 //         .setTitle("Juros")
                 //         .setMessage("Valor ${numDias.toString()}")
                 //         .setPositiveButton("Ok", { dialog, which -> }).show()


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
                val vl_calcmulta: Double = vl_temp2 * (0.20 * numDiasC) / 100
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

                // Calculo do Porcontas
                val vl_pc1: Double = a.toDouble() * vl_taxa_vencimento
                val vl_pc2: Double = vl_pc1 / vl_taxa_pagamento
                val vl_pc3: Double = a.toDouble() - vl_pc2
                val vl_diaspc: Double = ((numDias * (0.20 / 100)) + 1)
                val vl_finalpc1: Double =  vl_pc2 / vl_diaspc
                val vl_finalpc2: Double = (a.toDouble() - vl_finalpc1) - vl_pc3
                val vl_finalpc3: Double = (vl_finalpc1 * vl_taxa_pagamento ) / vl_taxa_vencimento
                val vl_finalpc4: Double = vl_finalpc3 * vl_diaspc

                var vl_finalpc5 = vl_finalpc1 * 1000
                var vl_finalpc6: Int = vl_finalpc5.toInt()
                var vl_finalpc10: Double = (vl_finalpc6.toDouble() / 1000)
                // val vl_finalpc7: Double = (vl_finalpc6.toDouble() / 100) * 10
                //val vl_finalpc8 = df.format(vl_finalpc7)
                //val vl_finalpc9: Double = (vl_finalpc8.toDouble() / 10) * 100
                //val vl_finalpc10: Double = vl_finalpc9 / 100
                val vl_prespc: Double = vl_finalpc10

                vl_finalpc5 = (a.toDouble() - vl_prespc) * 1000
                vl_finalpc6 = vl_finalpc5.toInt()
                vl_finalpc10 = (vl_finalpc6.toDouble() / 1000)
                val vl_jurospc: Double = vl_finalpc10


                //  AlertDialog.Builder(this)
              //          .setTitle("Juros")
              //          .setMessage("Valor $vl_taxa_pagamento")
              //          .setPositiveButton("Ok", { dialog, which -> }).show()

               // conts val FCO
                val resultadoIntent =  Intent(this, MainResultado::class.java)
              //  resultadoIntent.putExtra(MainResultado.FCO,b)
                resultadoIntent.putExtra(MainResultado.FCO1,a.toDouble())
                resultadoIntent.putExtra(MainResultado.FCO2,b)
                resultadoIntent.putExtra(MainResultado.FCO3,numDias.toInt())
                resultadoIntent.putExtra(MainResultado.FCO4,vl_prespc)
                resultadoIntent.putExtra(MainResultado.FCO5,vl_jurospc)
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
