package com.example.cursoavanzadoe1.ui

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.cursoavanzadoe1.R
import com.example.cursoavanzadoe1.utils.Sumar
import com.example.cursoavanzadoe1.viewmodel.SumarViewModel
import kotlinx.android.synthetic.main.activity_view_model.*

class ViewModelActivity : AppCompatActivity() {


    lateinit var sumarViewModel: SumarViewModel
    var resultado : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        setUpView()
    }

    fun setUpView(){

        sumarViewModel = ViewModelProviders.of(this).get(SumarViewModel::class.java)


        tvSumar.text = "$resultado"

        tvSumarViewModel.text = sumarViewModel.resultado.toString()

        btSumar.setOnClickListener{

            resultado = Sumar.sumar(resultado)
            tvSumar.text = "$resultado"

            sumarViewModel.resultado = Sumar.sumar(sumarViewModel.resultado)
            tvSumarViewModel.text = sumarViewModel.resultado.toString()
        }
    }
}
