package com.example.francisco.calculojurospagamento

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.os.Handler
import android.util.Log
import kotlinx.android.synthetic.main.activity_main_novo_mes.*

class MainNovoMes : AppCompatActivity() {


    lateinit var usersDBHelper: UsersDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_novo_mes)

        usersDBHelper = UsersDBHelper(this)

        msgatua.setText("Atualize e Aguarde...")

        val btnNovoMes2: Button = findViewById(R.id.btnNovoMes2)

        // Create progressBar dynamically...
        val progressBar = ProgressBar(this)
        progressBar.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        val linearLayout = findViewById<LinearLayout>(R.id.rootContainer)
        // Add ProgressBar to LinearLayout
        linearLayout?.addView(progressBar)


        var juroscsv: List<String> = applicationContext.assets.open("francisco/juratraso.csv").bufferedReader().use {
            it.readLines()
        }

        btnNovoMes2.setOnClickListener {
            //val novomesIntent = Intent(this, MainNovoMes::class.java)
            msgatua.setText("Atualizado!")
            btnNovoMes2.setText("Atual")

            val visibility = if (progressBar.visibility == View.GONE) View.VISIBLE else View.GONE
            usersDBHelper.atualizatabela(juroscsv)
            progressBar.visibility = visibility

            msgatua.visibility
            //Thread(Runnable { usersDBHelper.atualizatabela(juroscsv)})
            var progressStatus = 0
            val handler: Handler = Handler()
            Thread(Runnable {
                while (progressStatus < 100) {
                    // Update the progress status
                    progressStatus += 1

                    // Try to sleep the thread for 50 milliseconds
                    try {
                        Thread.sleep(50)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                    // Update the progress bar
                    handler.post(Runnable {
                        progress_bar.progress = progressStatus

                        Log.d("#DB","Nascimento Filho>>");

                        // Show the progress on text view
                        text_view.text = progressStatus.toString()
                    })
                }
             usersDBHelper.atualizatabela(juroscsv) }) // Start the operation
            //startActivity(novomesIntent);
        }

        val NMSair: Button    = findViewById(R.id.NMSair)
        NMSair.setOnClickListener {
            finish()
        }

    }
}