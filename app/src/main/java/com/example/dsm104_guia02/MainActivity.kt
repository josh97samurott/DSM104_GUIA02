package com.example.dsm104_guia02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre.visibility = View.INVISIBLE
        ocultar.visibility = View.INVISIBLE
    }


    public fun pushShowName(view: View){
        nombre.visibility = View.VISIBLE
        mostrar.visibility = View.INVISIBLE
        ocultar.visibility = View.VISIBLE
    }

    public fun pushHideName(view: View){
        nombre.visibility = View.INVISIBLE
        mostrar.visibility = View.VISIBLE
        ocultar.visibility = View.INVISIBLE
    }
}