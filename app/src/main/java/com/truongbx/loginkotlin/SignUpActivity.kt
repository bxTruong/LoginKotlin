package com.truongbx.loginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.truongbx.loginkotlin.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)

        val number = intent.getIntExtra(EXTRA_NUMBER, -1)
        val string = intent.getStringExtra(EXTRA_STRING)

        Toast.makeText(this, " $number $string ", Toast.LENGTH_SHORT).show()
    }

}