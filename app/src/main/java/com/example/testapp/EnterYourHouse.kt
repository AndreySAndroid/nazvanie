package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_enter_your_house.*

class EnterYourHouse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_your_house)

        button1.setOnClickListener{
            val intent1 = Intent(this, NewResident::class.java)
            startActivity(intent1)
        }
    }
}