package com.example.mypictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class lecturers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecturers)
        var tveNext2=findViewById<TextView>(R.id.tvnext4)
        var btnNext1=findViewById<Button>(R.id.btnpage4)
        btnNext1.setOnClickListener {
            var intent= Intent(baseContext,gradutes::class.java)
            startActivity(intent)
        }
    }
}