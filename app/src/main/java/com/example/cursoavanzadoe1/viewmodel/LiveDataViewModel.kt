package com.example.cursoavanzadoe1.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cursoavanzadoe1.utils.User

class LiveDataViewModel: ViewModel(){

    var userLisLiveData: MutableLiveData<List<User>> = MutableLiveData()
    var userList: MutableList<User> = ArrayList()

    fun getUserList(): LiveData<List<User>> {
        return userLisLiveData
    }

    fun addUser(user: User) {
        userList.add(user)

        userLisLiveData.value = userList
    }

}