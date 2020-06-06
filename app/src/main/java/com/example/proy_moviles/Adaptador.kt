package com.example.proy_moviles

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.proy_moviles.room.Contratos
import kotlinx.android.synthetic.main.item_layout.view.*

class Adaptador (private val mContext: Context, private val listContratos:List<Contratos>) : ArrayAdapter<Contratos>(mContext, 0, listContratos) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false)

        val contrato = listContratos[position]

        layout.num_cto.text = contrato.n_cto
        layout.objeto.text = contrato.objeto
        layout.fechascto.text = contrato.plazo.toString()
        return layout
    }
}