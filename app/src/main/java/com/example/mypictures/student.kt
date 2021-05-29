package com.example.mypictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        var tveNext2=findViewById<TextView>(R.id.tvpage3)
        var btnNext1=findViewById<Button>(R.id.btnnext3)
        btnNext1.setOnClickListener {
            var intent= Intent(baseContext,lecturers::class.java)
            startActivity(intent)
        }
    }
}