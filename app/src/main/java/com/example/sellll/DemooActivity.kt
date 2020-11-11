package com.example.sellll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.text.TextUtils
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import java.util.regex.Matcher
import java.util.regex.Pattern

class DemooActivity : AppCompatActivity() {

    lateinit var textEmailId:TextInputEditText
    lateinit var textPassword:TextInputEditText
    lateinit var buttonLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demoo)

        val spin=findViewById<Spinner>(R.id.spinId) as Spinner

        val languages = arrayOf("English","Русский","O'zbekcha")
        val ArrayAdp=ArrayAdapter(this@DemooActivity,android.R.layout.simple_spinner_dropdown_item,languages)
        spin.adapter=ArrayAdp

        textEmailId=findViewById(R.id.emailId)
        textPassword=findViewById(R.id.password)
        buttonLogin=findViewById(R.id.loginButton)

        buttonLogin.setOnClickListener{
            LoginFunc()
        }

    }

    private fun LoginFunc(){

        val strEmail=textEmailId.text.toString().trim()
        val strPassword=textPassword.text.toString().trim()

        if (TextUtils.isEmpty(strEmail)||TextUtils.isEmpty(strPassword)){
            textEmailId.error="Cannot be EMPTY"
            textPassword.error="Cannot be EMPTY"
        }else if (!EmailValidationFunc(strEmail)){
            textEmailId.error="Not valid Email address..."
        }
        else{
            Toast.makeText(applicationContext,"Login SUCCESSFUL...",Toast.LENGTH_LONG).show()
        }
    }

    private fun EmailValidationFunc(strEmail:String):Boolean{
        val EMAIL_PATTERN ="^[A-Za-z0-9-]+(\\.A-za-z09+)*@[A-Za-z0-9-]+(\\.A-za-z09+)*(\\.[A-Za-z]{2,})$"
        val  pattern: Pattern=Pattern.compile(EMAIL_PATTERN)
        val matcher:Matcher=pattern.matcher((strEmail))
        return matcher.matches()
    }

}