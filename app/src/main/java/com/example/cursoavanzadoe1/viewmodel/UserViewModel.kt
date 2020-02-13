package com.example.cursoavanzadoe1.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cursoavanzadoe1.utils.User

class UserViewModel: ViewModel {
    var userList: MutableList<User>

    constructor(){
        userList = ArrayList()
    }

    fun addUser(user: User) {
        userList.add(user)
    }
}