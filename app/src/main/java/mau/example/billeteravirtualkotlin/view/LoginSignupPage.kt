package mau.example.billeteravirtualkotlin.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import mau.example.billeteravirtualkotlin.databinding.ActivityLoginSignupPageBinding


class LoginSignupPage : AppCompatActivity() {

    private lateinit var binding: ActivityLoginSignupPageBinding//

    // referencias a binding y viewmodel
//    private var viewModel: LoginViewModel?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginSignupPageBinding.inflate(layoutInflater)//
        setContentView(binding.root)//

        binding.btnGoToSignup.setOnClickListener {
            val intent = Intent(this, SignupPage::class.java)
            startActivity(intent)
        }

        binding.btnGoToLogin.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }
    }
}