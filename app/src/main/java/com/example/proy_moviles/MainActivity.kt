package com.example.proy_moviles

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_ingresar.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        invitado.setOnClickListener { view ->
            abrirActividad_invitado()
        }
        buttonI.setOnClickListener { view->
            abrirActividad_ingreso()
        }
        /*TyC.setOnClickListener { view ->
           val webintent :Intent ?= Uri.parse("https://www.google.com/search?q=terminos+y+condiciones&rlz=1C1CHBF_esCO839CO840&oq=terminos+y+condiciones&aqs=chrome..69i57j0l7.3862j0j4&sourceid=chrome&ie=UTF-8").let { webpage ->
               Intent(Intent.ACTION_VIEW, webpage)
           }
        }*/
    }

    fun abrirActividad_invitado(){
        val intent = Intent(this, GuestActivity::class.java)
        //intent.putExtra("puno", "Ingresa las palabra solicitadas!!!")
        startActivityForResult(intent, 10)
    }

    fun abrirActividad_ingreso(){
        val intent = Intent(this, IngresarActivity::class.java)
        //intent.putExtra("puno", "Ingresa las palabra solicitadas!!!")
        startActivityForResult(intent, 10)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 10){
            //

        }
    }
}
