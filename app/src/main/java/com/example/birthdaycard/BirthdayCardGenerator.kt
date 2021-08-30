package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_card_generator.*

class BirthdayCardGenerator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card_generator)

        val name = intent.getStringExtra("Name")

        birthdayGreeting.text = "Happy Birthday\n$name !!!!"
    }
}