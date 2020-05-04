package com.test.coverage.android_coveragetools_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter = Counter()

        decreaseButton.setOnClickListener { labelTxt.text = counter.decrease().toString() }
        increaseButton.setOnClickListener { labelTxt.text = counter.increase().toString() }
    }
}
