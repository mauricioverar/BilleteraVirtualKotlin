package mau.example.billeteravirtualkotlin.view

import android.os.Bundle
//import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
//import androidx.lifecycle.Observer
//import androidx.lifecycle.ViewModelProvider
//import androidx.recyclerview.widget.LinearLayoutManager
//import mau.example.billeteravirtualkotlin.R
import mau.example.billeteravirtualkotlin.databinding.ActivityCasosBinding
//import mau.example.billeteravirtualkotlin.view.adapters.UserAdapter
import mau.example.billeteravirtualkotlin.viewModel.UsersViewModel

class CasosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCasosBinding

    private val usersViewModel: UsersViewModel by viewModels() //**

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCasosBinding.inflate(layoutInflater)

        enableEdgeToEdge()

        setContentView(binding.root)

        //binding.button.setOnClickListener {Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()}


        //viewmodel //, Observer
        usersViewModel.usuario.observe(this, {
            binding.tvNombre.text = it.userName
            binding.tvEmail.text = it.userEmail

            //binding.textView3.text = it.user.userName

        })
        /*binding.button.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
            usersViewModel.showUser()
        }*/


        //val viewModel: UsersViewModel = ViewModelProvider(this).get(UsersViewModel::class.java)

        //val viewModel: UsersViewModel by viewModels()
        /*val viewModel = CasosViewModel()
        binding.viewModel = viewModel
        binding.lifecycleOwner = this*/

        // adapter y recyclerview
        /*var adapterUser = UserAdapter()
        binding.rcv.adapter = adapterUser

        //observe
        viewModel.usersLVD.observe(this, Observer {
            adapterUser.users = it.toMutableList()
        })*/
        /*viewModel.usersLVD.observe(this, Observer {
            binding.
            binding.rcv.adapter = adapterUser

            binding.rcv.layoutManager = LinearLayoutManager(this)
            adapterUser.users = it.toMutableList()

            *//*adapterUser.onItemClickListener = {
                viewModel.userSelected = it
            }*//*
        })*/





    }
}