package mau.example.billeteravirtualkotlin.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import mau.example.billeteravirtualkotlin.databinding.ActivityRequestMoneyBinding

class RequestMoney : AppCompatActivity() {

    private lateinit var binding: ActivityRequestMoneyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityRequestMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.left.setOnClickListener {
            finish()
        }
        binding.btnTransRequestMoney.setOnClickListener {
            toast()
        }
    }

    private fun toast() {
        Toast.makeText(this, "Dinero ingresado!", Toast.LENGTH_SHORT).show()
    }
}