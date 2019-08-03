package com.example.myfirstappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.random.Random

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNuber()
    }

    companion object {
        const val  TOTAL_COUNT = "total_count"
    }

    fun showRandomNuber(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        //gerar o numero randomico
        val random = Random
        var randomInt = 0
        if(count > 0){
            randomInt = random.nextInt(count + 1)
        }

        findViewById<TextView>(R.id.textViewRandom).text = Integer.toString(randomInt)
        findViewById<TextView>(R.id.textViewLabel).text = getString(R.string.he_is_a_random_number_between_0_and_1d,count)
    }

    }

