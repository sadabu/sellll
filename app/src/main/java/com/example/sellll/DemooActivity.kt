package com.example.sellll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.text.TextUtils
import android.view.View
import android.widget.*
import com.google.android.material.textfield.TextInputEditText
import java.util.regex.Matcher
import java.util.regex.Pattern

class DemooActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demoo)

        val btn2=findViewById<TextView>(R.id.textButton)
        btn2.setOnClickListener{
            val intent= Intent(this@DemooActivity,Registration::class.java)
            startActivity(intent)
        }

        val spin=findViewById<Spinner>(R.id.spinId) as Spinner

        val languages = arrayOf("English","Русский","O'zbekcha")
        val ArrayAdp=ArrayAdapter(this@DemooActivity,android.R.layout.simple_spinner_dropdown_item,languages)
        spin.adapter=ArrayAdp
        }

    }



