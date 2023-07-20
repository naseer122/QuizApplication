package com.crown.quizapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class QuizQuestionActivity : AppCompatActivity() {

    //Declare Variables
    lateinit var Question : TextView
    lateinit var Optiona:TextView
    lateinit var Optionb:TextView
    lateinit var Optionc:TextView
    lateinit var progressBar: ProgressBar
    lateinit var progresstext :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)
        Question = findViewById(R.id.QuestionTV)
        Optiona = findViewById(R.id.Option1Tv)
        Optionb = findViewById(R.id.Option2Tv)
        Optionc = findViewById(R.id.Option3Tv)
        progressBar = findViewById(R.id.progressbar)
        progresstext = findViewById(R.id.QuestionProgressTv)
        var listofQuestions = Constants.Questions()
        Log.e("Questions", listofQuestions.get(0).toString())
        var curentPosition = 0
        progressBar.progress = listofQuestions[curentPosition].id
        Question.text = listofQuestions.get(curentPosition).quesions
        Optiona.text = listofQuestions.get(curentPosition).optionone
        Optionb.text = listofQuestions.get(curentPosition).optiontwo
        Optionc.text = listofQuestions.get(curentPosition).optionthree
        progresstext.text = (listofQuestions.get(curentPosition).id).toString() + "/" + listofQuestions.size


    }
}