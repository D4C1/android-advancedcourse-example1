package com.example.cursoavanzadoe1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.cursoavanzadoe1.R
import com.example.cursoavanzadoe1.databinding.ActivityDataBindingBinding
import com.example.cursoavanzadoe1.utils.User

class DataBindingActivity : AppCompatActivity() {

    lateinit var user:User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityDataBindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

        user = User("a","111")
        binding.user = user
    }
}
