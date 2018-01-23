package com.example.francisco.calculojurospagamento

import android.provider.BaseColumns

object DBContract {
    class UserTabela : BaseColumns {
        companion object {
            val TABLE_NAME = "JURATRASO"
            val COLUMN_CHAVE = "cd_chave"
            val COLUMN_TAXA = "vl_taxa"
        }
    }
}