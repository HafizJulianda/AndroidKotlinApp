package com.example.exampleawalkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button
    private lateinit var btnKurangNumber: Button
    private lateinit var btnResetNumber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        btnKurangNumber = findViewById(R.id.btnKurangNumber)
        btnResetNumber = findViewById(R.id.btnResetNumber)

        tvCounter.text = "0"
    }

    fun addNumber(v: View) {
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        tvCounter.text = nextVal.toString()
    }

    fun kurangNumber(v: View) {
        if (tvCounter.text == "0") {
            tvCounter.text = "0"
        } else {

            val currVal = tvCounter.text.toString().toInt()
            val nextVal = currVal - 1
            tvCounter.text = nextVal.toString()
        }
    }
        fun resetNumber(v: View) {
            tvCounter.text = "0"
        }
    }
