package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var firstImageView : ImageView? = null
    var secondImageView : ImageView? = null

    var array = arrayListOf(R.drawable.ic_dice_1, R.drawable.ic_dice_2, R.drawable.ic_dice_3,
        R.drawable.ic_dice_4, R.drawable.ic_dice_5, R.drawable.ic_dice_6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rollButtonPressed(view: View) {
        firstImageView = findViewById(R.id.firstImageView)
        secondImageView = findViewById(R.id.secondImageView)

        firstImageView!!.setImageResource(array.random())
        secondImageView!!.setImageResource(array.random())

    }
}