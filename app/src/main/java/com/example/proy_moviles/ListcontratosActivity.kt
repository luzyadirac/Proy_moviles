package com.example.proy_moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_listcontratos.*

class ListcontratosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listcontratos)
        var contra1 = Contratistas("Juanito Grillo", "CPS-001-2019","Prestar servicios profesionales y de apoyo a la gestión en el grupo uno para desarrollar las actividades de abogado",
            1200000.0,"30/01/2019")
        var contra2 = Contratistas("Pepe Pluma", "CPS-002-2019","Prestar servicios profesionales y de apoyo a la gestión en el grupo dos para desarrollar las actividades de psicologia",
            3500000.0,"29/03/2019")
        var contra3 = Contratistas("Anastacia Jirafa", "CPS-003-2019","Prestar servicios profesionales y de apoyo a la gestión en el grupo diez para desarrollar las actividades de ingeniero",
            2400000.0,"12/04/2019")

        val listcon = listOf(contra1, contra2, contra3)

        val adaptador = Adaptador(this, listcon)

        listado_contratos.adapter = adaptador

        listado_contratos.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("param1", contra1.nombre)
            startActivityForResult(intent, 10)
        }

    }
}
