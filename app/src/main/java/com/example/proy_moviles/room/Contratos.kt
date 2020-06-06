package com.example.proy_moviles.room

import android.text.Editable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "contratos")
data class Contratos(
    @PrimaryKey ()val n_cto: String,
    val objeto: String,
    val vr_mes: String,
    val vr_total: String,
    val contratista: String,
    val plazo: String,
    val adicion: Int,
    val prorroga: Int,
    val dependencia: String
) : Serializable
