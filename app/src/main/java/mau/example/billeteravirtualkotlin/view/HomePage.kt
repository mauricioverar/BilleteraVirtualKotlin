package mau.example.billeteravirtualkotlin.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import mau.example.billeteravirtualkotlin.R

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnRequestMoney = findViewById<Button>(R.id.btnRequestMoney)
        val btnSendMoney = findViewById<Button>(R.id.btnSendMoney)
        val profile_picture = findViewById<ImageView>(R.id.profile_picture)


        btnRequestMoney.setOnClickListener {
            //val intent = Intent(this, HomePageEmptyCase::class.java)
            val intent = Intent(this, RequestMoney::class.java)
            startActivity(intent)
        }

        btnSendMoney.setOnClickListener {
            val intent = Intent(this, SendMoney::class.java)
            startActivity(intent)
        }

        profile_picture.setOnClickListener {
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
        }
    }
}