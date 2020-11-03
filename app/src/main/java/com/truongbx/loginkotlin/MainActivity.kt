package com.truongbx.loginkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.truongbx.loginkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val userList = ArrayList<User>()
        for (i in 0 until 10) {
            userList.add(User("bxTruong$i@gmail.com", "tinhiunhobe", R.drawable.a))
        }
        binding.rcUser.adapter = UserAdapter(userList,this)
        binding.rcUser.layoutManager=LinearLayoutManager(this)
        binding.rcUser.setHasFixedSize(true)


    }
}