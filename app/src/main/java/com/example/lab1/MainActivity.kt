package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button = findViewById<Button>(R.id.button)
        val textView = findViewById(R.id.textView) as TextView
        val textView5 = findViewById(R.id.textView5) as TextView
        val textView9 = findViewById(R.id.textView9) as TextView
        val func = NumbersExercise();
        val list = func.numbers
        textView.setText(list.joinToString())
        Button.setOnClickListener {
        textView5.setText(func.firstnegative(list).toString())
        textView9.setText(func.lastpositive(list).toString()) }


    }
}