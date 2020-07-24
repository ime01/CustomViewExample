package com.flowz.customviewexample

import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.flowz.customviewexample.customview.EmotionalFaceView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val emotionalFaceView = EmotionalFaceView

        happyButton.setOnClickListener {
           customView.happinessState = EmotionalFaceView.HAPPY
        }

        sadButton.setOnClickListener {
            customView.happinessState = EmotionalFaceView.SAD
        }

    }
}


