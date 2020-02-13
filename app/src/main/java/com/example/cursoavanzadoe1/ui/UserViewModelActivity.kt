package com.example.cursoavanzadoe1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.cursoavanzadoe1.R
import com.example.cursoavanzadoe1.utils.User
import com.example.cursoavanzadoe1.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_user_view_model.*

class UserViewModelActivity : AppCompatActivity() {

    lateinit var userViewModel: UserViewModel
    var userList: ArrayList<User> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_view_model)

        setUpView()
    }

    fun setUpView() {
        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)

        btSalvar.setOnClickListener{
            val user = User()
            user.edad = etEdad.text.toString()
            user.nombre = etNombre.text.toString()
            userList.add(user)
            userViewModel.addUser(user)
        }
        btVer.setOnClickListener{
            var texto = ""
            for (user in userList) {
                texto += "${user.nombre} ${user.edad} \n"
            }
            tvUser.text = texto

            texto = ""
            for (user in userViewModel.userList) {
                texto += "${user.nombre} ${user.edad} \n"
            }
            tvUserViewModel.text = texto

        }
    }
}
