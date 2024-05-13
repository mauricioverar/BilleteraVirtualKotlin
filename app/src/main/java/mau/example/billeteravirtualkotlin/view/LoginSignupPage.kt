package mau.example.billeteravirtualkotlin.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import mau.example.billeteravirtualkotlin.R
//import mau.example.billeteravirtualkotlin.databinding.ActivityMainBinding

class LoginSignupPage : AppCompatActivity() {

    // referencias a binding y viewmodel
    //private var binding : ActivityMainBinding? = null
//    private var viewModel: LoginViewModel?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_signup_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnGoToSignup = findViewById<Button>(R.id.btnGoToSignup)
        btnGoToSignup.setOnClickListener {
            val intent = Intent(this, SignupPage::class.java)
            startActivity(intent)
        }
    }
}