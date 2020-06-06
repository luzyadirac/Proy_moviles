package com.example.proy_moviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proy_moviles.room.AppDatabase
import com.example.proy_moviles.room.Contratos
import kotlinx.android.synthetic.main.activity_insertar.*
import org.jetbrains.anko.doAsync

class InsertarActivity : AppCompatActivity() {
private val db = AppDatabase.getDatabase(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertar)

        buttonGuardar.setOnClickListener {
            val num = numero_et.text
            val obj = objeto_et.text
            val vm = vrmes_et.text.toString()
            val vt = vrtotal_et.text.toString()
            val con = contratista_et.text.toString()
            val dep = dep_et.text.toString()
            val duracion = plazo_et.text.toString()

            val nvocontrato = Contratos(num.toString(),obj.toString(),vm,vt,con,duracion,0,0,dep)

            doAsync {
                db.contratosDao().insertAll(nvocontrato)

                runOnUiThread{
                    this@InsertarActivity.finish()
                }
            }



        }
    }
}
