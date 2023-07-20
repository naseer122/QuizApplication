package com.crown.quizapplication

object Constants {

    fun Questions() : ArrayList<Question>{
        var questions = ArrayList<Question>()

        var q1 = Question(
            1,
            "What is the capital of Pakistan?",
            R.drawable.ic_launcher_foreground,
            "Lahore",
            "Islamabad",
            "Karachi",
            2
        )
        questions.add(q1)

        var q2 = Question(
            2,
            "What is the capital of Pakistan?",
            R.drawable.ic_launcher_foreground,
            "Lahore",
            "Islamabad",
            "Karachi",
            2
        )
        questions.add(q2)





        return questions

    }


}