package com.example.quiz_app

import android.content.Intent
import android.media.MediaCodec.MetricsConstants.MODE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.quiz_app.databinding.ActivityMainBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler(Looper.getMainLooper()).postDelayed({
if (Firebase.auth.currentUser!=null){
    startActivity(Intent(this, QuizActivity::class.java))
    finish()
}
          else{
    startActivity(Intent(this, LoginActivity::class.java))
    intent.putExtra("MODE","SIGNUP")
}
        }, 300)
        finish()
    }
}