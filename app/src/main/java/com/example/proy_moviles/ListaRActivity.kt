package com.example.proy_moviles

import android.app.LauncherActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lista_r.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class ListaRActivity : AppCompatActivity() {
    val listado = arrayListOf<String>()
    var adaptador: ArrayAdapter<String> ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_r)
        carga_archivo()
        adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listado)
        Lista1.adapter = adaptador

        Lista1.setOnItemClickListener { parent, view, position, id ->
            val textView = view as TextView
            Toast.makeText(this, textView.text.toString(), Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("param1", textView.text.toString())
            startActivityForResult(intent, 10)
        }
    }

    fun carga_archivo(){
        val entrada = Scanner ( openFileInput("archivoContratistas.txt"))

        while(entrada.hasNextLine()) {
            val linea = entrada.nextLine()
            val parte=linea.split(";")
            //listado.addAll(linea.split(";"))
            listado.add("Contrato "+parte[1]+" a nombre de "+parte[4])
            adaptador?.notifyDataSetChanged()
        }
        entrada.close()
    }

    fun actualiza_lista(m:String){
        listado.add(m)
        adaptador?.notifyDataSetChanged()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 10) {
            //
        }
    }

}
