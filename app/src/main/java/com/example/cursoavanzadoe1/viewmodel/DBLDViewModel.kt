package com.example.cursoavanzadoe1.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cursoavanzadoe1.utils.User

class DBLDViewModel: ViewModel() {
    var user: MutableLiveData<User> = MutableLiveData()
    var visible: MutableLiveData<Boolean> = MutableLiveData()
    var size: MutableLiveData<Float> = MutableLiveData(14f)


    fun setUser(user: User) {
        this.user.value = user
    }

    fun updateUser() {
        val user = User("s","1")
        this.user.value = user
    }

    fun setVisible(visible:Boolean) {
        this.visible.value = visible
    }

    fun changeVisibility() {
        visible.value = visible.value != true
        size.value = size.value!!.toFloat() + 5f
    }
}