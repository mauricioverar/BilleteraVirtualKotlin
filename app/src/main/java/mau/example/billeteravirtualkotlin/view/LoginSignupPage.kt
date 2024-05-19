package mau.example.billeteravirtualkotlin.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import mau.example.billeteravirtualkotlin.databinding.ActivityLoginSignupPageBinding
import mau.example.billeteravirtualkotlin.viewModel.UserViewModel


class LoginSignupPage : AppCompatActivity() {

    private lateinit var binding: ActivityLoginSignupPageBinding//

    // referencias a binding y viewmodel
//    private var viewModel: LoginViewModel?= null
    //private var _binding: ActivityLoginSignupPageBinding? = null
    //private val binding get() = _binding!!
    //private lateinit var viewModel: LoginViewModel

    // viewmodel
    private val userViewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginSignupPageBinding.inflate(layoutInflater)//
        setContentView(binding.root)//

        userViewModel.getEmail().observe(this, { // Observer
            //binding.etEmail.setText(it)
            //binding.etEmail.setSelection(binding.etEmail.text.length)


        })

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