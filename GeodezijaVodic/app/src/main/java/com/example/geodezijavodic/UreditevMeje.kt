package com.example.geodezijavodic


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ureditevmeje.*

class UreditevMeje : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ureditevmeje)


    

        pozeni.setOnClickListener {

                       Izracun.text =((((editText3.text.toString().toInt()*36)+(editText4.text.toString().toInt()*8)+(editText5.text.toString().toInt()*16)+400)+(((editText3.text.toString().toInt()*36)+(editText4.text.toString().toInt()*8)+(editText5.text.toString().toInt()*16)+400))*0.2).toString() + " Evrov")

        }


    }

}
