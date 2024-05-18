package mau.example.billeteravirtualkotlin.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import mau.example.billeteravirtualkotlin.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {

    private lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("username")
        binding.tvUsername.text = username

        binding.btnRequestMoney.setOnClickListener {
            val intent = Intent(this, RequestMoney::class.java)
            startActivity(intent)
        }
        binding.btnSendMoney.setOnClickListener {
            val intent = Intent(this, SendMoney::class.java)
            startActivity(intent)
        }
        binding.profilePicture.setOnClickListener {
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
        }
    }
}