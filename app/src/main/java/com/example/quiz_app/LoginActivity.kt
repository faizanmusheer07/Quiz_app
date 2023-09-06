package com.example.quiz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quiz_app.databinding.ActivityLoginBinding
import com.example.quiz_app.databinding.ActivityMainBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            Firebase.auth.createUserWithEmailAndPassword(
                binding.email.editText?.text.toString(),
                binding.password.editText?.text.toString())
                .addOnCompleteListener{
                    if (it.isSuccessful){
                        Toast.makeText(this, "User Crested", Toast.LENGTH_SHORT).show()
                    }else
                    {
                        Toast.makeText(this, "User isn't Created", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}