package mau.example.billeteravirtualkotlin.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import mau.example.billeteravirtualkotlin.databinding.ActivityHomePageEmptyCaseBinding

class HomePageEmptyCase : AppCompatActivity() {

    private lateinit var binding: ActivityHomePageEmptyCaseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomePageEmptyCaseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}