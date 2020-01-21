package com.example.geodezijavodic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_geodetskinacrt.*

class geodetskinacrt : AppCompatActivity()
{override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_geodetskinacrt)


         button2.setOnClickListener{

            textView10.text=(((((editTextGN.text.toString().toInt())*0.2)+200)+((((editTextGN.text.toString().toInt())*0.2)+200)*0.2)).toString() + " Evrov")
        }
    }
}