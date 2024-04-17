package com.example.loginfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import android.widget.Toast

import com.example.loginfirebase.databinding.ActivitySingInBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class SingInActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivitySingInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)

        binding = ActivitySingInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth

        binding.welcomeTextView.text = "Hola, bienvenido"
        binding.catImageView.setImageResource(R.drawable.profile_photo)

    }
}