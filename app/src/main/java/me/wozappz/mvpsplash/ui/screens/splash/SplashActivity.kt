package me.wozappz.mvpsplash.ui.screens.splash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.wozappz.mvpsplash.ui.screens.main.MainActivity
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity<MainActivity>()
        finish()
    }
}
