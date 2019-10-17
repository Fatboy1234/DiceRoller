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

        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener { countDice() }
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
    private fun countDice() {



        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result1_text)
        val resultText2: TextView = findViewById(R.id.result2_text)

        val countText: TextView = findViewById(R.id.result_count)
        val totalText: TextView = findViewById(R.id.result1_count)

        val result = Integer.parseInt(resultText.text.toString()) + 1
        val total = Integer.parseInt(resultText.text.toString()) + Integer.parseInt(resultText1.text.toString()) + Integer.parseInt(resultText2.text.toString())
        if( result >= 6)
        {
            countText.text = "6"

        }
        else{
            countText.text = result.toString()
        }

        if(total >=18)
        {
            totalText.text = "18"
        }
        else{
            totalText.text = total.toString()

        }



    }
}
