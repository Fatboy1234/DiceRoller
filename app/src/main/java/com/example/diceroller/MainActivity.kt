package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setting target to be assign
        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)
        val resetButton: Button = findViewById(R.id.Reset_button)
        //Action for dice
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener { countDice() }
        resetButton.setOnClickListener{resetDice()}

        }
    private fun rollDice() {



        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result1_text)
        val resultText2: TextView = findViewById(R.id.result2_text)


        val randomInt = Random().nextInt(6) + 1
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()
        resultText1.text = randomInt1.toString()
        resultText2.text = randomInt2.toString()



    }

    private fun resetDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result1_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        resultText.text = "0"
        resultText1.text = "0"
        resultText2.text = "0"
    }

    private fun countDice() {


        //Getting Dice Random Value
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result1_text)
        val resultText2: TextView = findViewById(R.id.result2_text)

        //Convert Dice Random Value to Integer for + 1
        val countText: TextView = findViewById(R.id.result_count)
        val countText1: TextView = findViewById(R.id.result1_count)
        val countText2: TextView = findViewById(R.id.result2_count)
        val totalText: TextView = findViewById(R.id.total_count)

        //Plus 1 for the dice Value
        val result = Integer.parseInt(resultText.text.toString()) + 1
        val result1 = Integer.parseInt(resultText1.text.toString()) + 1
        val result2 = Integer.parseInt(resultText2.text.toString()) + 1

        //Calculation for the total dice Value
        val total = Integer.parseInt(resultText.text.toString()) + Integer.parseInt(resultText1.text.toString()) + Integer.parseInt(resultText2.text.toString())

        //dice1
        if( result >= 6)
        {
            countText.text = "6"

        }
        else{
            countText.text = result.toString()
        }
        //dice 2
        if( result1 >= 6)
        {
            countText1.text = "6"

        }
        else{
            countText1.text = result1.toString()
        }
        //dice 3
        if( result2 >= 6)
        {
            countText2.text = "6"

        }
        else{
            countText2.text = result2.toString()
        }
        //Total Dice Amount
        if(total >=18)
        {
            totalText.text = "18"
        }
        else{
            totalText.text = total.toString()

        }



    }
}
