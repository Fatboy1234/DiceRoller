package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*



class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setting target to be assign
        diceImage = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)
        val resetButton: Button = findViewById(R.id.Reset_button)
        //Action for dice
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener { getRandomDiceImage() }
        resetButton.setOnClickListener{resetDice()}

        }
    private fun rollDice() {
        val drawableResource = getRandomDiceImage()
        diceImage.setImageResource(drawableResource)




    }
    private fun getRandomDiceImage() : Int
    {

        val drawableResource = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        return drawableResource
    }

    private fun resetDice(){
        val diceImage: ImageView = findViewById(R.id.dice_image)

        diceImage.setImageResource(R.drawable.empty_dice)

    }

    private fun countDice() {


        //Getting Dice Random Value
        val diceImage: ImageView = findViewById(R.id.dice_image)

        //Convert Dice Random Value to Integer for + 1



        //Plus 1 for the dice Value
        val result = Integer.parseInt(diceImage.toString()) + 1




        

    }
}
