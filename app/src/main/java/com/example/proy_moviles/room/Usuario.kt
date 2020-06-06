package com.example.proy_moviles.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "usuarios")
data class Usuario (
    val nombre_usu: String,
    val pass: String,
    val tipo: Int,
    @PrimaryKey(autoGenerate = true)
    val ID_usuario: Int
) : Serializable