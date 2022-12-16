package com.example.compostion.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.compostion.R
import com.example.compostion.databinding.FragmentGameFinishedBinding
import com.example.compostion.domain.entity.GameResult
import com.example.compostion.domain.entity.Level

class GameFinishedFragment : Fragment() {

    private val args by navArgs<GameFinishedFragmentArgs>()



    private var _binding: FragmentGameFinishedBinding? = null
    private val binding: FragmentGameFinishedBinding
        get() = _binding ?: throw RuntimeException("FragmentGameFinishedBinding == null")



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGameFinishedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonRetry.setOnClickListener {
            retryGame()
        }
        bindViews()
    }

    private fun bindViews() {
        binding.gameResult = args.gameResult

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun retryGame () {
        findNavController().popBackStack()
    }
}