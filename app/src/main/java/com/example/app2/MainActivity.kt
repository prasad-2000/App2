package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login1.setOnClickListener {
            val i =Intent(this,login_activity::class.java)
            startActivity(i);
        }
        signup.setOnClickListener {
            val intent=Intent(this,SignUp::class.java)
            startActivity(intent);
        }
    }
}