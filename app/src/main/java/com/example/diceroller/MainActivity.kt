package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn: Button = findViewById(R.id.btn_roll)


        rollBtn.setOnClickListener {
//            val toast = Toast.makeText(this, "Dice rolled", Toast.LENGTH_SHORT)
//            toast.show()
//            Toast.makeText(this, "Dice rolled", Toast.LENGTH_SHORT).show()
//            val resultText: TextView = findViewById(R.id.textView)
//            resultText.text = "6"
            rollDice()

        }
    }

    private fun rollDice() {
        val obj1 = Dice(6)
        val obj2 = Dice(6)
        val diceRoll = obj1.roll()
        val diceRoll2 = obj2.roll()
//        val resultText: TextView = findViewById(R.id.textView2)
//        resultText.text = obj1.roll().toString()
        val diceImg: ImageView = findViewById(R.id.imageView)
         diceImg.setImageResource(R.drawable.dice_2)
        val diceImg2: ImageView = findViewById(R.id.imageView2)
        diceImg.setImageResource(R.drawable.dice_2)

//       when(diceRoll) {
//           1 -> diceImg.setImageResource(R.drawable.dice_1)
//           2 -> diceImg.setImageResource(R.drawable.dice_2)
//           3 -> diceImg.setImageResource(R.drawable.dice_3)
//           4 -> diceImg.setImageResource(R.drawable.dice_4)
//           5 -> diceImg.setImageResource(R.drawable.dice_5)
//           6 -> diceImg.setImageResource(R.drawable.dice_6)
//       }
        val resultText: TextView = findViewById(R.id.textView2)
        val resultText2: TextView = findViewById(R.id.textView3)
          val drawableRes = when(diceRoll) {
           1 -> R.drawable.dice_1
           2 -> R.drawable.dice_2
           3 -> R.drawable.dice_3
           4 -> R.drawable.dice_4
           5 -> R.drawable.dice_5
              else -> R.drawable.dice_6



       }
        diceImg.setImageResource(drawableRes)
        resultText2.text = obj2.roll().toString()
        val drawableResources = when(diceRoll2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImg2.setImageResource(drawableResources)
        resultText2.text = obj2.roll().toString()
    }
}

class Dice(val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}