package com.example.myfirstappkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Hello Toast!!", Toast.LENGTH_SHORT)
        myToast.show();
    }

    fun countMe(view: View){
        val showCountTextView = findViewById<TextView>(R.id.textView)
        val countString = showCountTextView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count ++

        showCountTextView.text = count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, secondActivity::class.java)

        val countString = textView.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(secondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)

    }
}
