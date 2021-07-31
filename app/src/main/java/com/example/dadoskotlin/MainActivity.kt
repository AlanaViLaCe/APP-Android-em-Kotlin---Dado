package com.example.dadoskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() { //abre classe
    override fun onCreate(savedInstanceState: Bundle?) { //abre sobrescrita
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener(){
            //Tudo que acontece no botão
            val randomInt = (1..6).random()
            textView.text = randomInt.toString()
            imageView.setImageResource(R.drawable.dado_1)
            when(randomInt){
                1 -> imageView.setImageResource(R.drawable.dado_1)
                2 -> imageView.setImageResource(R.drawable.dado_2)
                3 -> imageView.setImageResource(R.drawable.dado_3)
                4 -> imageView.setImageResource(R.drawable.dado_4)
                5 -> imageView.setImageResource(R.drawable.dado_5)
                6 -> imageView.setImageResource(R.drawable.dado_6)

                else   -> imageView.setImageResource(R.drawable.dado_vazio)

            }


        } //termina o botão
    } //fecha sobrescrita
} //fecha classe