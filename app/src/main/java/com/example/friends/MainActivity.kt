package com.example.friends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val migos = Migos (nombre = "Andres", ocupación = "actor", descripción = "Novela juan joyita", imagen = R.drawable.andres)
        val migos2 = Migos(nombre = "enrique", ocupación = "cantante", descripción = "nunca te ovidare", imagen = R.drawable.enrique)
        val migos3 = Migos(nombre = "mariana", ocupación = "atleta", descripción = "bicicleta", imagen = R.drawable.mariana)
        val migos4 = Migos(nombre = "jason", ocupación = "cantante", descripción = "i´m yours", imagen = R.drawable.jason)
        val migos5 = Migos(nombre = "Leydi", ocupación = "estudiante", descripción = "sistemas", imagen = R.drawable.leydi)

        val listaMigos = listOf(migos, migos2, migos3, migos4, migos5)
        val adapter = migosAdapter(this, listaMigos)
        lista_id.adapter = adapter
        lista_id.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}
