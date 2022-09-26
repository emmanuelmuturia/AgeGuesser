package com.emmanuelmuturia.ageguesser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val guessAge = findViewById<Button>(R.id.age_guesser)
        guessAge.setOnClickListener {
            val myAges = findViewById<Spinner>(R.id.my_ages)
            val statement = findViewById<TextView>(R.id.age_statement)
            val age = myAges.selectedItem
            statement.text = "You are probably ${getAge(age.toString())} years old!"

        }
    }
    private fun getAge(age: String): String {
        return when (age) {
            "10 to 20" -> (10 until 20).random().toString()
            "20 to 30" -> (20 until 30).random().toString()
            "30 to 40" -> (30 until 40).random().toString()
            "40 to 50" -> (40 until 50).random().toString()
            "50 to 60" -> (50 until 60).random().toString()
            "60 to 70" -> (60 until 70).random().toString()
            "70 to 80" -> (70 until 80).random().toString()
            else -> "I give up!"
        }
    }

}