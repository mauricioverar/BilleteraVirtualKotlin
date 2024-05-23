package mau.example.billeteravirtualkotlin.view

import android.annotation.SuppressLint
//import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import mau.example.billeteravirtualkotlin.R

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // ...splash screen
        //val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)


        //splashScreen.setKeepOnScreenCondition {true}

        // solo para detener y poder ver
        /*Thread.sleep(2000)
        val intent = Intent(this, LoginSignupPage::class.java)
        startActivity(intent)
        finish()*/
    }
}