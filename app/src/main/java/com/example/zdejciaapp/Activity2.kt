package com.example.zdejciaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Activity2 : AppCompatActivity() {

    var x: Int? = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        val secondActButton = findViewById<Button>(R.id.second_button)
        secondActButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val clickme2 = findViewById<ImageView>(R.id.imageChange)
        clickme2.setOnClickListener {
            //clickme2.setBackgroundColor(Color.RED)
            myMessage()
        }
    }
        private fun myMessage(){
            val clickme2 = findViewById<ImageView>(R.id.imageChange)
            if (x==0){
                clickme2.setImageResource(R.drawable.marcin1)
                x=1
            }
            else if (x==1){
                clickme2.setImageResource(R.drawable.marcin2)
                x=0
            }
        }

    }
