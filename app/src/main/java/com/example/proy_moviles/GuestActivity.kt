package com.example.proy_moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_guest.*
import kotlinx.android.synthetic.main.activity_main.*

class GuestActivity : AppCompatActivity() {

    val documento:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest)
        button3.setOnClickListener { view ->
           // val documento = editText_doc.text
            abrirActividad_listado()
        }
    }

    fun abrirActividad_listado(){
        val intent = Intent(this, ListcontratosActivity::class.java)
        intent.putExtra("docu", documento.toInt())
        startActivityForResult(intent, 10)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 10){
            //

        }
    }
}
