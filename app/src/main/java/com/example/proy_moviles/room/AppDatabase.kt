package com.example.proy_moviles.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Contratos::class, Usuario::class], version = 1)
abstract class AppDatabase: RoomDatabase(){

    abstract fun contratosDao(): ContratoDao
    abstract fun usuariosDao(): UsuarioDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            val tempInstance =
                INSTANCE

            if(tempInstance != null){
                return  tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "BDD_contrapnn").build()
                INSTANCE = instance

                return instance
            }
        }
    }
}