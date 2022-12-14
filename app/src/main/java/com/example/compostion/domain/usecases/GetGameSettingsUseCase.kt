package com.example.compostion.domain.usecases

import com.example.compostion.domain.entity.GameSettings
import com.example.compostion.domain.entity.Level
import com.example.compostion.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke (level: Level): GameSettings{
        return repository.getGameSettings(level)
    }
}