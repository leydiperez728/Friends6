package com.example.friends

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_migos.view.*

class migosAdapter(private val mContext: Context, private val listaMigos: List<Migos>) : ArrayAdapter<Migos>(mContext, 0, listaMigos) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
    val layout = LayoutInflater.from(mContext).inflate(R.layout.item_migos, parent, false)

    val migos = listaMigos[position]
        layout.nombre_id.text = migos.nombre
     layout.nombre_id.text = migos.nombre
      layout.imageView.setImageResource(migos.imagen)

        return layout
    }
}