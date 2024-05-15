package mau.example.billeteravirtualkotlin.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import mau.example.billeteravirtualkotlin.R

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSendLogin = findViewById<Button>(R.id.btnSendLogin)

        btnSendLogin.setOnClickListener {
            //val intent = Intent(this, HomePageEmptyCase::class.java)
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }
    }


}