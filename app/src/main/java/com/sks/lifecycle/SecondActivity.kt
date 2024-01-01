package com.sks.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        backButton = findViewById(R.id.backButton)

        backButton.setOnClickListener {
            val intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }

        Log.d("Message", "2nd activity onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "2nd activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "2nd activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "2nd activity onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "2nd activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "2nd activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "2nd activity onDestroy")
    }
}