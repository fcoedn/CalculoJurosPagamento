package com.example.francisco.calculojurospagamento

import android.provider.BaseColumns

object DBContract {
    class UserTabela : BaseColumns {
        companion object {
            val TABLE_NAME = "fcodb"
            val COLUMN_CODIGO = "codigo"
            val COLUMN_NOME = "nome"
        }
    }
}