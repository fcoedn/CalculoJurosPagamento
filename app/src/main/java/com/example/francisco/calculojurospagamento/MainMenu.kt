package com.example.francisco.calculojurospagamento

import android.content.Intent
import android.database.sqlite.SQLiteOpenHelper
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main_menu.*



class MainMenu : AppCompatActivity()   {

    lateinit var usersDBHelper : UsersDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        usersDBHelper = UsersDBHelper(this)

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


}

