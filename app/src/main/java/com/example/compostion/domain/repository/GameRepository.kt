package com.example.compostion.domain.repository

import com.example.compostion.domain.entity.GameSettings
import com.example.compostion.domain.entity.Level
import com.example.compostion.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings (level: Level): GameSettings
}