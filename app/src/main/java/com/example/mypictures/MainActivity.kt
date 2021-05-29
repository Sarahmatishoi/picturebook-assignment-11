package com.example.mypictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tveNext2=findViewById<TextView>(R.id.tvword1)
        var btnNext1=findViewById<Button>(R.id.btnnext1)

        btnNext1.setOnClickListener {
            var intent=Intent(baseContext,buildings::class.java)
            startActivity(intent)
        }

    }
}