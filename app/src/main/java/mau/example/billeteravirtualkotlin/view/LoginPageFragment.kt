package mau.example.billeteravirtualkotlin.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import mau.example.billeteravirtualkotlin.R
import mau.example.billeteravirtualkotlin.databinding.FragmentLoginPageBinding

class LoginPageFragment : Fragment() {

    //1
    private lateinit var navController: NavController
    private var _binding: FragmentLoginPageBinding? = null
    private val binding get() = _binding!!

    //2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginPageBinding.inflate(inflater, container, false)
        //navController = findNavController()
        // Inflate the layout for this fragment
        return binding.root
    }

    //3
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        _binding?.btnGoToNewSignup?.setOnClickListener {
            navController.navigate(R.id.action_loginPageFragment_to_signupPageFragment)
        }

        _binding?.btnGoToHome?.setOnClickListener {
            navController.navigate(R.id.action_loginPageFragment_to_homePageFragment2)
        }
    }
}