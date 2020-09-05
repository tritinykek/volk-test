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
        val textView1: TextView = findViewById(R.id.textView2)
        val textView2: TextView = findViewById(R.id.textView3)
        var loxi =0
        button.setOnClickListener(){
            loxi+=1
            var text1="лох"
            when (loxi%10){
                1 -> text1="лох"
                2,3,4 -> text1="лоха"
                5,6,7,8,9,0 ->text1="лохов"
            }
            textView2.text = text1
            textView1.text = loxi.toString()

        }
    }

}