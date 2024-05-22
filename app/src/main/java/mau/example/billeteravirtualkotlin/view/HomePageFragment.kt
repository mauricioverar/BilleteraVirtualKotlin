package mau.example.billeteravirtualkotlin.view

//import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import mau.example.billeteravirtualkotlin.R
import mau.example.billeteravirtualkotlin.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    val args: HomePageFragmentArgs by navArgs()
    private lateinit var navController: NavController
    private var _binding: FragmentHomePageBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomePageBinding.inflate(inflater, container, false)
                // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        val username = args.username
        //val username = arguments?.getString("username")


        binding.tvUsername.text = getString(R.string.hello, username)
        //binding.tvUsername.text = "Hola, $username"
        //binding.tvUsername.text = "Hola, ${arguments?.getString("username")}"

        _binding?.profilePicture?.setOnClickListener {
            navController.navigate(R.id.action_homePageFragment_to_profilePageFragment)
        }

        _binding?.btnSendMoney?.setOnClickListener {
            navController.navigate(R.id.action_homePageFragment_to_sendMoneyFragment)
        }

        _binding?.btnRequestMoney?.setOnClickListener {
            navController.navigate(R.id.action_homePageFragment_to_requestMoneyFragment)
        }

    }
}