package com.example.proy_moviles

import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat.startActivity
import com.example.proy_moviles.room.AdminSQLiteOpenHelper
import com.example.proy_moviles.room.AppDatabase
import com.example.proy_moviles.room.Contratos
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync

class MainActivity : AppCompatActivity() {
    //private val db = AppDatabase.getDatabase(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        invitado.setOnClickListener { view ->
            abrirActividad_invitado()
        }
        buttonI.setOnClickListener { view->
            abrirActividad_ingreso()
        }
        buttonR.setOnClickListener { view ->
            abrirActividad_registro()
        }
        /*TyC.setOnClickListener { view ->
           val webintent :Intent ?= Uri.parse("https://www.google.com/search?q=terminos+y+condiciones&rlz=1C1CHBF_esCO839CO840&oq=terminos+y+condiciones&aqs=chrome..69i57j0l7.3862j0j4&sourceid=chrome&ie=UTF-8").let { webpage ->
               Intent(Intent.ACTION_VIEW, webpage)
           }*/
    }


    fun cantidadReg(): Long {
        val admin = AdminSQLiteOpenHelper(
            this,
            "BDD_contratistaspnn",
            null,
            1
        )
        val bd = admin.readableDatabase
        val cn = DatabaseUtils.queryNumEntries(bd, "contratos")
        bd.close()
        return cn
    }

    fun abrirActividad_invitado() {
        val intent = Intent(this, GuestActivity::class.java)
        //intent.putExtra("puno", "Ingresa las palabra solicitadas!!!")
        startActivityForResult(intent, 10)
    }

    fun abrirActividad_ingreso() {
        val intent = Intent(this, InsertarActivity::class.java)
        //intent.putExtra("puno", num)
        //startActivity(intent)
        startActivityForResult(intent, 10)
    }

    fun abrirActividad_registro() {
        val intent = Intent(this, RegistroActivity::class.java)
        //intent.putExtra("puno", num)
        startActivity(intent)
        startActivityForResult(intent, 10)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 10) {
            //

        }
    }
}

