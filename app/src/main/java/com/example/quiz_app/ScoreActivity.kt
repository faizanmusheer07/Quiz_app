package com.example.quiz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz_app.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
   private lateinit var binding: ActivityScoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.score.setText("congrats !!! your score is: ${intent.getIntExtra("SCORE",0 )}")
    }
}