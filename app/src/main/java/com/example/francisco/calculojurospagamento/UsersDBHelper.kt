package com.example.francisco.calculojurospagamento

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Context
import android.content.res.AssetManager
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.Cursor
import android.database.sqlite.SQLiteException
import android.support.v7.app.AlertDialog
import android.util.Log
import android.webkit.WebView
import android.widget.Toast


import java.io.*
import java.nio.charset.Charset
import java.util.*
import kotlin.concurrent.timerTask


class UsersDBHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    var fileReader: BufferedReader? = null

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)

        //  db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180101', 12.488471211)")
      //  db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180122', 12.668993815)")
      //  db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180123', 12.677654922)")
      //  db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180124',12.686321950)")
     //   db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180125', 12.694994903)")
    }


    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
      //   This database is only a cache for online data, so its upgrade policy is
      //   to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES)


        //Log.d("#DB","Nascimento Filho>>"); //will show you database entries in Logcat.

                onCreate(db)
    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        onUpgrade(db, oldVersion, newVersion)
    }

    /*
    @Throws(SQLiteConstraintException::class)
    fun insertUser(user: UserModel): Boolean {
        // Gets the data repository in write mode
        val db = writableDatabase

        // Create a new map of values, where column names are the keys
        val values = ContentValues()
        values.put(DBContract.UserTabela.COLUMN_CODIGO, user.codigo)
        values.put(DBContract.UserTabela.COLUMN_NOME, user.nome)
        //values.put(DBContract.UserEntry.COLUMN_AGE, user.age)

        // Insert the new row, returning the primary key value of the new row
        val newRowId = db.insert(DBContract.UserTabela.TABLE_NAME, null, values)

        return true
    }

    @Throws(SQLiteConstraintException::class)
    fun deleteUser(codigo: String): Boolean {
        // Gets the data repository in write mode
        val db = writableDatabase
        // Define 'where' part of query.
        val selection = DBContract.UserTabela.COLUMN_CODIGO + " LIKE ?"
        // Specify arguments in placeholder order.
        val selectionArgs = arrayOf(codigo)
        // Issue SQL statement.
        db.delete(DBContract.UserTabela.TABLE_NAME, selection, selectionArgs)

        return true
    }

*/


    fun readUser(cd_chave: String): ArrayList<UserModel> {
        //getAssets().open("wordsData.txt")
        val users = ArrayList<UserModel>()
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from " + DBContract.UserTabela.TABLE_NAME + " WHERE " + DBContract.UserTabela.COLUMN_CHAVE + "='" + cd_chave + "'", null)
        } catch (e: SQLiteException) {
            // if table not yet present, create it
            db.execSQL(SQL_CREATE_ENTRIES)
            return ArrayList()
        }

        //var codigo: String
        var vl_taxa: Double
        //var age: String
        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
            //--    vl_taxa = cursor.getString(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_TAXA))
                vl_taxa = cursor.getDouble(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_TAXA))
          //      age = cursor.getString(cursor.getColumnIndex(DBContract.UserEntry.COLUMN_AGE))

                users.add(UserModel(cd_chave, vl_taxa))
                cursor.moveToNext()
            }
        }
        return users
    }

    fun readUser1(cd_chave: String): Double {
        val vl_taxa:  Double
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from " + DBContract.UserTabela.TABLE_NAME + " WHERE " + DBContract.UserTabela.COLUMN_CHAVE + "='" + cd_chave + "'", null)
        } catch (e: SQLiteException) {
            // if table not yet present, create it
            db.execSQL(SQL_CREATE_ENTRIES)
            return Double.MIN_VALUE
        }
        //vl_taxa = 5.0
        //var codigo: String
        var vl_taxa1: Double = 0.0
        //var age: String
        //vl_taxa = cursor.getDouble(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_TAXA))
        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
                //--    vl_taxa = cursor.getString(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_TAXA))
                vl_taxa1 = cursor.getDouble(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_TAXA))
                //      age = cursor.getString(cursor.getColumnIndex(DBContract.UserEntry.COLUMN_AGE))

              //  users.add(UserModel(cd_chave, vl_taxa))
                cursor.moveToNext()
            }
        }
        vl_taxa = vl_taxa1
        return vl_taxa
    }

    fun atualizatabela(juroscsv: List<String>) {
        //println(juroscsv)
        val db = writableDatabase
        //Log.d("#csv","OK Filho>>");
        //var loop = 0
        //while (loop < 1000    ) {
        //    Log.d("#csv", loop.toString())
        //    loop = loop + 1
        //}
        var dados = arrayOf<String>("A","B")
        db.beginTransaction()
        db.execSQL("DELETE FROM juratraso")
        for (linha in juroscsv) {
            //Log.d("#DB","Atualizando...");
            dados = linha.split("|").toTypedArray()
            db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('"+dados[0]+"',"+dados[1]+")")
        }
        db.setTransactionSuccessful();
        db.endTransaction();

       // Log.d("#csv","OK OKOKOK>>");
    }
    /*
    fun readAllUsers(): ArrayList<UserModel> {
        val users = ArrayList<UserModel>()
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from " + DBContract.UserTabela.TABLE_NAME, null)
        } catch (e: SQLiteException) {
            db.execSQL(SQL_CREATE_ENTRIES)
            return ArrayList()
        }

        var codigo: String
        var nome: String
        //var age: String
        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
                codigo = cursor.getString(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_CODIGO))
                nome = cursor.getString(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_NOME))
          //      age = cursor.getString(cursor.getColumnIndex(DBContract.UserEntry.COLUMN_AGE))

                users.add(UserModel(codigo, nome))
                cursor.moveToNext()
            }
        }
        return users
    }

*/
    companion object {
        // If you change the database schema, you must increment the database version.
        val DATABASE_VERSION = 9
        val DATABASE_NAME = "CLAUDINO.db"

        private val SQL_CREATE_ENTRIES =
                "CREATE TABLE " + DBContract.UserTabela.TABLE_NAME + " (" +
                        DBContract.UserTabela.COLUMN_CHAVE + " TEXT PRIMARY KEY," +
                        DBContract.UserTabela.COLUMN_TAXA + " DECIMAL(15,9))"
                        //DBContract.UserTabela.COLUMN_AGE + " TEXT)"

        private val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + DBContract.UserTabela.TABLE_NAME
    }

}