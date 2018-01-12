package com.example.francisco.calculojurospagamento

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
import java.text.SimpleDateFormat
import java.util.*

class MainCalculo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_calculo)

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
                val b = a.toInt() * 2
                //result.setText(e.toString())

                AlertDialog.Builder(this)
                        .setTitle("Juros")
                        .setMessage("Valor $b")
                        .setPositiveButton("Ok", { dialog, which -> }).show()
                val resultadoIntent =  Intent(this, MainResultado::class.java)
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
