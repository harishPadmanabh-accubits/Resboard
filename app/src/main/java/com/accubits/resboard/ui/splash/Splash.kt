package com.accubits.resboard.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.accubits.resboard.MainActivity
import com.accubits.resboard.R
import com.accubits.resboard.ui.login.LoginActivity
import com.accubits.resboard.utils.openActivity


class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            openActivity(LoginActivity::class.java)
            finish()

        }, 2000)
    }
}