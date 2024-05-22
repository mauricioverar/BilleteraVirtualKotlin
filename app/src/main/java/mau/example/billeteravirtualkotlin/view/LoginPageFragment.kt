package mau.example.billeteravirtualkotlin.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import mau.example.billeteravirtualkotlin.R
import mau.example.billeteravirtualkotlin.databinding.FragmentLoginPageBinding

class LoginPageFragment : Fragment() {
    //var SM: SendMessage? = null

    private lateinit var navController: NavController
    private var _binding: FragmentLoginPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        _binding?.btnGoToNewSignup?.setOnClickListener {
            navController.navigate(R.id.action_loginPageFragment_to_signupPageFragment)
        }

        // validar email y contraseña
        val emailRegex = "^[a-zA-Z0-9.!#\$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"
        val passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$"


        _binding?.btnGoToHome?.setOnClickListener {
            if (binding.etEmail.text.toString().isEmpty()) {
                toastEmailEmpty()
                return@setOnClickListener
            }
            if (binding.etPassword.text.toString().isEmpty()) {
                toastPasswordEmpty()
                return@setOnClickListener
            }
            if (!binding.etEmail.text.toString().matches(emailRegex.toRegex())) {
                toastEmailFalse()
                return@setOnClickListener
            }
            if (!binding.etPassword.text.toString().matches(passwordRegex.toRegex())) {
                toastPasswordFalse()
                return@setOnClickListener
            }

            //val intent = Intent(context, HomePageFragment::class.java)
            //intent.putExtra("username", binding.etEmail.text.toString())

            //SM?.sendData(binding.etEmail.text.toString().trim())

            //navController.navigate(R.id.action_loginPageFragment_to_homePageFragment2)
            navController.navigate(LoginPageFragmentDirections.actionLoginPageFragmentToHomePageFragment2(username = binding.etEmail.text.toString().trim()))
        }
    }

    /*private fun toast() {
        Toast.makeText(this, "Ingresa nueva contraseña", Toast.LENGTH_SHORT).show()
    }*/

    private fun toastEmailEmpty() {
        binding.etEmail.error = "Campo requerido"
    }

    private fun toastPasswordEmpty() {
        Toast.makeText(context, "Contraseña requerida", Toast.LENGTH_SHORT).show()
    }

    private fun toastEmailFalse() {
        binding.etEmail.error = "Email incorrecto"
    }

    private fun toastPasswordFalse() {
        binding.etPassword.error = "Contraseña debe contener al menos 8 caracteres, una letra y un número"
        //Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show()
    }

    /*interface SendMessage {
        fun sendData(message: String?)
    }

    override fun onAttach(context: android.content.Context) {
        super.onAttach(context)
        SM = context as SendMessage
    }*/


}