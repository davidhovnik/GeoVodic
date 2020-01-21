package com.example.geodezijavodic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_katasterskivpis.*

class katasterskivpis : AppCompatActivity()
{override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_katasterskivpis)


    button7.setOnClickListener {
        textView16.text=((((editText.text.toString().toInt()*0.28)+ (editText2.text.toString().toInt()*19.2)+352)+(((editText.text.toString().toInt()*0.28)+ (editText2.text.toString().toInt()*19.2)+352))*0.2).toString()+ " Evrov")


    }



    }
}