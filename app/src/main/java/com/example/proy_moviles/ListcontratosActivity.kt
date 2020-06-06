package com.example.proy_moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proy_moviles.room.AppDatabase
import com.example.proy_moviles.room.Contratos
import kotlinx.android.synthetic.main.activity_listcontratos.*

class ListcontratosActivity : AppCompatActivity() {


    var listcon = emptyList<Contratos>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listcontratos)

        val db = AppDatabase.getDatabase(this)

    /*db.contratosDao().getAll().observe(this, Observer {
        listcon = it
        val adaptador = Adaptador(this, listcon)

        listado_contratos.adapter = adaptador
    })*/



      /*  var contra1 = Contratos("001", "Prestar servicios profesionales y de apoyo a la gestión en el grupo uno para desarrollar las actividades de abogado",4200,
            5200.0, 123,230,4200.0,9,"Grupo contratos",1)
        var contra2 = Contratos("001", "Prestar servicios profesionales y de apoyo a la gestión en el grupo uno para desarrollar las actividades de abogado",4200,
            5200.0, 124,25,0.0,910,"Grupo contratos",2)
        var contra3 = Contratos("001", "Prestar servicios profesionales y de apoyo a la gestión en el grupo uno para desarrollar las actividades de abogado",4200,
            5200.0, 125,250,2530.0,120,"Grupo contratos",3)

        val listcon = listOf(contra1, contra2, contra3)*/



        listado_contratos.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("param1", "prueba")
            startActivityForResult(intent, 10)
        }

    }
}
