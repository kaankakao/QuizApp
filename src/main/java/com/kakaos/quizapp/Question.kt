package com.kakaos.quizapp

import android.media.Image

data class Question(val id: Int, val question: String, val image: Int, val optionOne: String, val optionTwo: String,
                    val optionThree: String,val optionFour: String,val optionFive: String, val correctAnswer: Int)
