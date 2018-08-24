package com.example.francisco.calculojurospagamento

import android.content.Intent
import android.database.sqlite.SQLiteOpenHelper
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_menu.*



class MainMenu : AppCompatActivity()   {

    lateinit var usersDBHelper : UsersDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        //Log.d("#csv","Nascimento Filho>>");
        //var juroscsv: List<String> = applicationContext.assets.open("francisco/juratraso.csv").bufferedReader().use {
        //    it.readLines()
        //}

        //Log.d("#csv","Inicio>>");
        //println(FCO)
        //Log.d("#csv","Final>>");

        usersDBHelper = UsersDBHelper(this)
        //Toast.makeText(applicationContext,"Atualizando Base de Dados", Toast.LENGTH_SHORT).show()
        //AlertDialog.Builder(this)
        //        .setTitle("Notification")
        //        .setMessage("Atualizando")
        //        .setPositiveButton("Ok", { dialog, which -> }).show()
        //tx_mensagem.text = "Atualizando"
        //usersDBHelper.atualizatabela(juroscsv)
        //tx_mensagem.text = "Atualizado Sucesso"

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        btnCalcular.text = "Calcular"
        tx_mensagem.setText("Atualizando -1")
         btnCalcular.setOnClickListener {
         //    var users = usersDBHelper.readUser("DTI20180122")
         //    users.forEach {
         //        var tv_user = TextView(this)
         //        tv_user.textSize = 30F
         //        tv_user.text = it.cd_chave.toString() + " - " + it.vl_taxa.toString()
         //        this.ll_entries.addView(tv_user)
         //    }
         //    this.textview_result.text = "Fetched " + users.size + " users"

           val calculoIntent =  Intent(this, MainCalculo::class.java)
              //setContentView(R.layout.activity_main_menu)
              startActivity(calculoIntent);
         }

        val btnNovoMes: Button = findViewById(R.id.btnNovoMes)
        btnNovoMes.setOnClickListener {
            val novomesIntent =  Intent(this, MainNovoMes::class.java)
            //usersDBHelper.atualizatabela(juroscsv)
            startActivity(novomesIntent);
         }

        val btnConfig: Button = findViewById(R.id.btnConfig)
        btnConfig.setOnClickListener {
            val configIntent =  Intent(this, MainConfig::class.java)
            startActivity(configIntent);
        }

        val btnSair: Button = findViewById(R.id.btnSair)
        btnSair.setOnClickListener {
            //AlertDialog.Builder(this)
            //        .setTitle("Notification")
            //        .setMessage("Finalizando")
            //        .setPositiveButton("Ok", { dialog, which -> }).show()
            finish()
        }
        // https://codelabs.developers.google.com/codelabs/build-your-first-android-app-kotlin/index.html?index=..%2F..%2Findex#7
    }

    /*
    fun addUser(v:View){
        //val x: EditText = findViewById(R.id.edittext_name.)
        var codigo = this.edittext_userid.text.toString()
        var nome = this.edittext_name.text.toString()
        var result = usersDBHelper.insertUser(UserModel(codigo = codigo,nome = nome))
        //clear all edittext s
         this.edittext_name.setText("")
        this.edittext_userid.setText("")
        this.textview_result.text = "Added user : "+result
        this.ll_entries.removeAllViews()
    }

*/

    /*
    fun showAllUsers(v:View){
        var users = usersDBHelper.readAllUsers()
        this.ll_entries.removeAllViews()
        users.forEach {
            var tv_user = TextView(this)
            tv_user.textSize = 30F
            tv_user.text = it.codigo.toString() + " - " + it.nome.toString()
            this.ll_entries.addView(tv_user)
        }
        this.textview_result.text = "Fetched " + users.size + " users"
    }
*/

  //   fun jurosCalcular (view: View) {
  //          val calculoIntent =  Intent(this, MainCalculo::class.java)
  //          startActivity(calculoIntent);
  //    }

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


}

