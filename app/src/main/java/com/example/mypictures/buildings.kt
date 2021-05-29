package com.example.mypictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class buildings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buildings)
        var tveNext2=findViewById<TextView>(R.id.tvnext2)
        var btnNext1=findViewById<Button>(R.id.btnpage2)
        btnNext1.setOnClickListener {
            var intent= Intent(baseContext,student::class.java)
            startActivity(intent)
        }
    }
}