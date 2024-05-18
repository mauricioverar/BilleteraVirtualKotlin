package mau.example.billeteravirtualkotlin.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import mau.example.billeteravirtualkotlin.databinding.ActivityLoginPageBinding

class LoginPage : AppCompatActivity() {

    private lateinit var binding: ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGoToHome.setOnClickListener {
            //val intent = Intent(this, HomePageEmptyCase::class.java)
            val intent = Intent(this, HomePage::class.java)
            intent.putExtra("username", binding.etEmail.text.toString())
            startActivity(intent)
        }
        binding.btnGoToNewSignup.setOnClickListener {
            val intent = Intent(this, SignupPage::class.java)
            startActivity(intent)
        }
        binding.forgetPassword.setOnClickListener {
            toast()
        }
    }

    private fun toast() {
        Toast.makeText(this, "Ingresa nueva contraseña", Toast.LENGTH_SHORT).show()
    }
}