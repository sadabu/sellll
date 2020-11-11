package com.example.sellll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

class DemooActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demoo)

        val spin=findViewById<Spinner>(R.id.spinId) as Spinner

        val languages = arrayOf("English","Русский","O'zbekcha")
        val ArrayAdp=ArrayAdapter(this@DemooActivity,android.R.layout.simple_spinner_dropdown_item,languages)
        spin.adapter=ArrayAdp

    }
}