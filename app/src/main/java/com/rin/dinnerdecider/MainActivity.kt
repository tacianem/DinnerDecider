package com.rin.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() { //extending AppCompatActivity

    val foodList = arrayListOf("Chinese", "Yakisoba", "Temaki YAY", "Mexican", "Lazanhaaa", "Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = Random()
            val randomindex = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomindex]
        }

        addFoodButton.setOnClickListener {
            val newFood = addFoodText.text.toString()
            if (!newFood.isEmpty()) {
                foodList.add(newFood)
            }
            addFoodText.text.clear() //NEAT
        }
    }
}