package com.example.francisco.calculojurospagamento

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteConstraintException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.Cursor
import android.database.sqlite.SQLiteException

import java.util.ArrayList

class UsersDBHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('DTI20180101', 12.488471211)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('DTI20180122', 12.668993815)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('DTI20180123', 12.677654922)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('DTI20180124',12.686321950)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('DTI20180125', 12.694994903)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES)
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
        val DATABASE_VERSION = 4
        val DATABASE_NAME = "CLAUDINO.db"

        private val SQL_CREATE_ENTRIES =
                "CREATE TABLE " + DBContract.UserTabela.TABLE_NAME + " (" +
                        DBContract.UserTabela.COLUMN_CHAVE + " TEXT PRIMARY KEY," +
                        DBContract.UserTabela.COLUMN_TAXA + " DECIMAL(15,9))"
                        //DBContract.UserTabela.COLUMN_AGE + " TEXT)"

        private val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + DBContract.UserTabela.TABLE_NAME
    }

}