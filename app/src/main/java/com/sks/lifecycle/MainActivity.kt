package com.sks.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var result: TextView
    private lateinit var incrementButton: Button
    private lateinit var gotoButton: Button

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.resultTextView)
        incrementButton = findViewById(R.id.incrementButton)
        gotoButton = findViewById(R.id.gotoButton)

        incrementButton.setOnClickListener {
            counter += 1
            result.text = counter.toString()
        }

        gotoButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

        Log.d("Message", "1st activity onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "1st activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "1st activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "1st activity onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "1st activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "1st activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "1st activity onDestroy")
    }
}