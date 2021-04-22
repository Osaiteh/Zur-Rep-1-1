package com.osaiteh.Zuri.zur_rep_1_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton: Button = findViewById(R.id.button)
        clickButton.setOnClickListener { incrementNum() }
    }

private fun incrementNum() {
    val displayNumber : TextView = findViewById(R.id.viewNumber)
    num++
    displayNumber.text = num.toString()

}
}