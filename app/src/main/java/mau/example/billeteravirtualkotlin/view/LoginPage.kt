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

            // validar email y contraseña
            val emailRegex = "^[a-zA-Z0-9.!#\$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"
            if (binding.etEmail.text.toString().isEmpty() || binding.etPassword.text.toString().isEmpty()) {
                toastCampos()
                return@setOnClickListener
            }
            if (binding.etEmail.text.toString().matches(emailRegex.toRegex())) {
                toastEmailTrue()

                //val intent = Intent(this, HomePageEmptyCase::class.java)
                val intent = Intent(this, HomePage::class.java)
                intent.putExtra("username", binding.etEmail.text.toString())
                startActivity(intent)

            } else {
                toastEmailFalse()
            }


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

    private fun toastCampos() {
        Toast.makeText(this, "Faltan campos", Toast.LENGTH_SHORT).show()
    }

    private fun toastEmailTrue() {
        Toast.makeText(this, "Email correcto", Toast.LENGTH_SHORT).show()
    }

    private fun toastEmailFalse() {
        Toast.makeText(this, "Email incorrecto", Toast.LENGTH_SHORT).show()
    }

}