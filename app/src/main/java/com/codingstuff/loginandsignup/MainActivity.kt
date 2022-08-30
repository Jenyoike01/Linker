package com.codingstuff.loginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var mAuth:FirebaseAuth
    var buttonLogout:Button ?= null
    lateinit var cv_work:CardView
    lateinit var cv_fitness:CardView
    lateinit var cv_education:CardView
    lateinit var cv_gaming:CardView
    lateinit var cv_medical:CardView
    lateinit var cv_setting:CardView
   lateinit var cv_start_up:CardView
    lateinit var cv_travel:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cv_work=findViewById(R.id.cv_work)
        cv_fitness=findViewById(R.id.cv_fitness)
        cv_education=findViewById(R.id.cv_education)
        cv_gaming=findViewById(R.id.cv_gaming)
        cv_medical=findViewById(R.id.cv_medical)
        cv_setting=findViewById(R.id.cv_setting)
        cv_start_up=findViewById(R.id.cv_start_up)
        cv_travel=findViewById(R.id.cv_travel)


        buttonLogout = findViewById(R.id.Logout)
        mAuth = FirebaseAuth.getInstance()
        buttonLogout!!.setOnClickListener {
            mAuth!!.signOut()
            var gotoSignin=Intent(applicationContext,SignInActivity::class.java)
            startActivity(gotoSignin)
        }

        cv_work.setOnClickListener{
            Toast.makeText(applicationContext,"Work", Toast.LENGTH_SHORT).show()
        }

        cv_education.setOnClickListener{
            Toast.makeText(applicationContext,"Education", Toast.LENGTH_SHORT).show()
        }

        cv_fitness.setOnClickListener {
            Toast.makeText(applicationContext,"Fitness", Toast.LENGTH_SHORT).show()
        }


        cv_gaming.setOnClickListener{
            Toast.makeText(applicationContext,"Gaming", Toast.LENGTH_SHORT).show()
        }

        cv_medical.setOnClickListener{
            Toast.makeText(applicationContext,"Medical", Toast.LENGTH_SHORT).show()
        }

        cv_setting.setOnClickListener{
            Toast.makeText(applicationContext,"Settings", Toast.LENGTH_SHORT).show()
        }

        cv_start_up.setOnClickListener{
            Toast.makeText(applicationContext,"Start Up", Toast.LENGTH_SHORT).show()
        }

        cv_travel.setOnClickListener{
            Toast.makeText(applicationContext,"Travel", Toast.LENGTH_SHORT).show()
        }

    }
}