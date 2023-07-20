package com.crown.quizapplication

data class Question (
    val id:Int,
    val quesions: String,
    val image : Int,
    val optionone:String,
    val optiontwo:String,
    val optionthree:String,
    val correctans:Int,
)