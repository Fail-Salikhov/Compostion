package com.example.compostion.domain.usecases

import com.example.compostion.domain.entity.Question
import com.example.compostion.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke (maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    companion object{

        private const val COUNT_OF_OPTIONS = 6
    }
}