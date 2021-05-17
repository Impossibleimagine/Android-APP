package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }
    //
    class Dice(val SideNum : Int){
        fun roll(): Int{
            return (1..SideNum).random()
        }
    }
    //
    public fun rollDice() {
        val dice = Dice(6)
        val DiceRollResult = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView3)
        resultTextView.text = DiceRollResult.toString()
    }
}
