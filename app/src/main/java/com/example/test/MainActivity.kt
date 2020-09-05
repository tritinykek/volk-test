package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView2)
        var loxi =0
        button.setOnClickListener(){
            loxi+=1

            textView.text = loxi.toString()

        }
    }

}