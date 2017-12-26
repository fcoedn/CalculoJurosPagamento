package com.example.francisco.calculojurospagamento

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        // https://codelabs.developers.google.com/codelabs/build-your-first-android-app-kotlin/index.html?index=..%2F..%2Findex#7

        fun jurosCalcular (view: View) {
            // Create an Intent to start the second activity
            val calculoIntent = Intent(this, MainCalculo::class.java)

            // Get the current value of the text view.
            //val countString = textView.text.toString()

            // Convert the count to an int
            //val count = Integer.parseInt(countString)

            // Add the count to the extras for the Intent.
            randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

            // Start the new activity.
            startActivity(calculoIntent)
        }
    }
}
