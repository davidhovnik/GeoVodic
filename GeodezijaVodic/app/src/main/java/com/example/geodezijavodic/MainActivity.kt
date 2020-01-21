package com.example.geodezijavodic

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.geodezijavodic.ui.AboutMe
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView.setOnClickListener {
        Snackbar.make(container, "Namen aplikacije je pomoč pri ocenitvni stroškov geodetskih storitev.", Snackbar.LENGTH_LONG).show()
    }
        button.setOnClickListener {
        startActivity(Intent(this,UreditevMeje::class.java))  }


        button3.setOnClickListener {
            startActivity(Intent(this,izravnavameje::class.java))}


        button5.setOnClickListener{
            startActivity(Intent(this,geodetskinacrt::class.java))
        }
        button6.setOnClickListener{
            startActivity(Intent(this,katasterskivpis::class.java))
        }
        }
    }

