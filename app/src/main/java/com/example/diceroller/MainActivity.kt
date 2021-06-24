package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.btn_Roll) //declaration for button

        btnRoll.setOnClickListener() {
            rollDice() //call the function
        }

        //without private function
        //btnRoll.setOnClickListener() {
        //    val randomInt = (1..6).random()
        //    val textResult: TextView = findViewById(R.id.Result_TextView)
        //    textResult.text = randomInt.toString()
        //}

    }
    //with private function
    private fun rollDice() {

        val randomInt = (1..6).random()

        val textResult: TextView = findViewById(R.id.Result_TextView)
        //textResult.text = "Dice Rolled"
        
        textResult.text = randomInt.toString()

        Toast.makeText(this, "button clicked", //it will show a "button clicked" at the bottom of the app when click the button
            Toast.LENGTH_SHORT).show()
    }
}