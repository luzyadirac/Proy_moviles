package com.example.proy_moviles

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ingresar.*

class IngresarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar)

        /*val parametro1 = intent.getStringExtra("puno").toInt()
        Toast.makeText(this, "LEYO EL PARAMETRO TRES"+parametro1, Toast.LENGTH_SHORT).show()
        if(parametro1 == 1){
            showInicio()
        }
        if(parametro1 == 2){
            showRegistro()
        }*/


    TyC.setOnClickListener {  View ->
       val webintent :Intent = Uri.parse("https://www.google.com/search?q=terminos+y+condiciones&rlz=1C1CHBF_esCO839CO840&oq=terminos+y+condiciones&aqs=chrome..69i57j0l7.3862j0j4&sourceid=chrome&ie=UTF-8").let { webpage ->
           Intent(Intent.ACTION_VIEW, webpage)
       }
    }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 10){
            //

        }
    }

}
