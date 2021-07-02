package com.example.stonks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button


class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.front_page)
        title = "Stonks"
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val i = Intent(this@NewActivity, MainActivity1::class.java)
            startActivity(i)


        }
    }
}