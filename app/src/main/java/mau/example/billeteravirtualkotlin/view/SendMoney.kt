package mau.example.billeteravirtualkotlin.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import mau.example.billeteravirtualkotlin.databinding.ActivitySendMoneyBinding

class SendMoney : AppCompatActivity() {

    private lateinit var binding: ActivitySendMoneyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySendMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.left.setOnClickListener {
            finish()
        }
        binding.btnTransSendMoney.setOnClickListener {
            toast()
        }
    }

    private fun toast() {
        Toast.makeText(this, "Dinero enviado!", Toast.LENGTH_SHORT).show()
    }
}