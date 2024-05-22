package mau.example.billeteravirtualkotlin.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import mau.example.billeteravirtualkotlin.R
//import mau.example.billeteravirtualkotlin.databinding.ActivityLoginSignupPageBinding
import mau.example.billeteravirtualkotlin.databinding.FragmentLoginSignupPageBinding


// 1 , View.OnClickListener y implement members
class LoginSignupPageFragment : Fragment(), View.OnClickListener {

    //2
    private lateinit var navController: NavController
    private var _binding: FragmentLoginSignupPageBinding? = null
    private val binding get() = _binding!!
    //private lateinit var binding: LoginSignupPageFragment


    /*private var param1: String? = null
    private var param2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }*/


    // 3
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginSignupPageBinding.inflate(inflater, container, false)
        //binding.btnGoToLogin.setOnClickListener(this)
        return binding.root

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_login_signup_page, container, false)
    }

    //5 import Navigation
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding = LoginSignupPageFragment.inflate(layoutInflater)
        navController = Navigation.findNavController(view)
        //binding.btnGoToLogin.setOnClickListener(this)
        //view.findViewById<Button>(R.id.btnGoToLogin).setOnClickListener(this)

        _binding?.btnGoToLogin?.setOnClickListener {
            navController.navigate(R.id.action_loginSignupPageFragment_to_loginPageFragment)
        }

        _binding?.btnGoToSignup?.setOnClickListener {
            navController.navigate(R.id.action_loginSignupPageFragment_to_signupPageFragment)
        }

    }

    /*override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnGoToLogin -> navController.navigate(R.id.action_loginSignupPageFragment_to_loginFragment)
        }
    }*/
    override fun onClick(view: View?) {
        when (view?.id) {
            //_binding?.btnGoToLogin?.id -> navController.navigate(R.id.action_loginSignupPageFragment_to_loginPageFragment)
            R.id.btnGoToLogin -> navController.navigate(R.id.action_loginSignupPageFragment_to_loginPageFragment)
            //binding.btnGoToLogin.id -> navController.navigate(R.id.action_loginSignupPageFragment_to_loginPageFragment)
        }
    }

    //4


    /*companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoginSignupPageFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }*/
}