package com.crown.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {
   lateinit var start : Button
   lateinit var name : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start = findViewById(R.id.startBtn);
        name = findViewById(R.id.ETName);
        var Name = name.text

        start.setOnClickListener {
            if (name.text.isNotEmpty()){
                var star = Intent(this,QuizQuestionActivity::class.java)
                startActivity(star)
                finish()
            } else{
                Toast.makeText(this,"Please Enter Your Name to Start the Quiz",Toast.LENGTH_SHORT).show()
            }

        }
    }
}