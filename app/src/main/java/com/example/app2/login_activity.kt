package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_layout.*

class login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)
        login2.setOnClickListener {
            if(user_name.text.toString().isEmpty()||password.text.toString().isEmpty()){
                Toast.makeText(this,"Enter Details Carefully",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Login Successfully",Toast.LENGTH_LONG).show()
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}