package com.example.proy_moviles.room

import androidx.lifecycle.LiveData
import androidx.room.*
@Dao
interface UsuarioDao {

          @Query("SELECT * FROM usuarios")
        fun getAll(): LiveData<List<Usuario>>

        @Query("SELECT * FROM usuarios WHERE nombre_usu =:dato")
        fun obtener_usuarios(dato: Int):List<Usuario>

        @Insert
        fun insertAll(vararg usuario: Usuario)

        @Update
        fun update(vararg usuario: Usuario)

        @Delete
        fun delete(vararg usuario: Usuario)
    }
