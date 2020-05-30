package com.example.proy_moviles

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_layout.view.*

class Adaptador (private val mContext: Context, private val listContratistas:List<Contratistas>) : ArrayAdapter<Contratistas>(mContext, 0, listContratistas) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false)

        val contratista = listContratistas[position]

        layout.num_cto.text = contratista.nombre
        layout.objeto.text = contratista.obj
        layout.fechascto.text = contratista.fechas
        return layout
    }
}