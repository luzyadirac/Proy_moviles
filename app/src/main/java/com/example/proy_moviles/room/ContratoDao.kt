package com.example.proy_moviles.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContratoDao {
    @Query("SELECT * FROM contratos")
    fun getAll(): LiveData<List<Contratos>>

    @Query("SELECT * FROM contratos WHERE contratista =:dato")
    fun obtener_contratos(dato: Int):List<Contratos>

    @Insert
    fun insertAll(vararg contrato: Contratos)

    @Update
    fun update(vararg contrato: Contratos)

    @Delete
    fun delete(vararg contrato: Contratos)
}