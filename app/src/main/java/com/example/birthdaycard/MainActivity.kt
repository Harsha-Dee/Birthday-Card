package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.editPersonName)

        createBirthdayButton.setOnClickListener{
            val personName = name.text.toString()

            val intent = Intent(this, BirthdayCardGenerator::class.java)
            intent.putExtra("Name", personName)
            startActivity(intent)
        }

    }

}