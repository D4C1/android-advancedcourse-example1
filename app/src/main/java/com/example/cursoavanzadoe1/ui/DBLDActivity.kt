package com.example.cursoavanzadoe1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.cursoavanzadoe1.R
import com.example.cursoavanzadoe1.databinding.ActivityDataBindingBinding
import com.example.cursoavanzadoe1.databinding.ActivityDbldBinding
import com.example.cursoavanzadoe1.utils.User
import com.example.cursoavanzadoe1.viewmodel.DBLDViewModel

class DBLDActivity : AppCompatActivity() {

    lateinit var viewModel:DBLDViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityDbldBinding = DataBindingUtil.setContentView(this,R.layout.activity_dbld)

        binding.setLifecycleOwner(this)
        viewModel = ViewModelProviders.of(this).get(DBLDViewModel::class.java)

        binding.viewModel = viewModel

        val user = User("al", "30")
        viewModel.setUser(user)

    }
}
