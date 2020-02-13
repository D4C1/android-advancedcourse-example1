package com.example.cursoavanzadoe1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.cursoavanzadoe1.R
import com.example.cursoavanzadoe1.utils.User
import com.example.cursoavanzadoe1.viewmodel.LiveDataViewModel
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

    lateinit var viewModel:LiveDataViewModel
    var numero: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        setUpView()
    }

    fun setUpView() {
        viewModel = ViewModelProviders.of(this).get(LiveDataViewModel::class.java)

        btSave.setOnClickListener{
            if(numero == 0) {
                val user = User("alberto", "10")
                viewModel.addUser(user)


            }
            if(numero == 1) {
                val user = User("albe", "20")
                viewModel.addUser(user)

            }
            if(numero == 2) {
            val user = User("a", "30")
                viewModel.addUser(user)

            }
            numero ++

        }

        val listObserver =  Observer<List<User>> {
            userList ->
            var texto = ""
            for (user in userList) {
                texto += user.nombre + user.edad+"\n"
            }
            tvLiveData.text = texto
        }

        viewModel.getUserList().observe(this,listObserver)
    }
}
