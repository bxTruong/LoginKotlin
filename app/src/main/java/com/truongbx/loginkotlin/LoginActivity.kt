package com.truongbx.loginkotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.truongbx.loginkotlin.databinding.ActivityMainBinding

const val EXTRA_NUMBER = "test put number"
const val EXTRA_STRING = "test put string"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.tvHello.text = "Đăng nhập";
        val username = binding.edtUsername.text;
        val password = binding.edtPassword.text;

        binding.btnLogin.setOnClickListener {
            Toast.makeText(
                this,
                "Hello $username $password",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.btnSignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
                .apply {
                    putExtra(EXTRA_NUMBER, 10)
                    putExtra(EXTRA_STRING, " Chuyển màn hình ")
                }
            startActivity(intent);
        }

    }


}