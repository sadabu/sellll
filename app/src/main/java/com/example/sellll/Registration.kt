package com.example.sellll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val btn2 = findViewById<TextView>(R.id.textButton2)
        btn2.setOnClickListener {
            val intent = Intent(this@Registration, DemooActivity::class.java)
            startActivity(intent)
        }
    }
}