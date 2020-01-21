package com.example.geodezijavodic

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_izravnavameje.*

@SuppressLint("Registered")
class izravnavameje : AppCompatActivity()
{override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_izravnavameje)

    button4.setOnClickListener {

        textView21.text=((((editText6.text.toString().toInt()*40)+190)+(((editText6.text.toString().toInt()*40)+190))*0.2).toString()+ " Evrov")
    }

    }
}