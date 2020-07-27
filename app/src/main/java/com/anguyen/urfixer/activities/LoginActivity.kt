package com.anguyen.urfixer.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anguyen.urfixer.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setupButtonsHandler()

    }

    private fun setupButtonsHandler(){
        btn_phone_number_login.setOnClickListener {
            startActivity(Intent(this, PhoneLoginActivity::class.java))
        }

        txt_toRegister
    }

}