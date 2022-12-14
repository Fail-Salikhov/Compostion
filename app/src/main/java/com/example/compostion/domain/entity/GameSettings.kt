package com.example.compostion.domain.entity

data class GameSettings (
    val maxSumValue : Int,
    val minCountRightOfAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
)