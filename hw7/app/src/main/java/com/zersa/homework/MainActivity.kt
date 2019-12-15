package com.zersa.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "The Call of Cthulhu"
        val card = findViewById<View>(R.id.card)
        val card_detail = findViewById<View>(R.id.card_detail)
        card.setOnClickListener{
            card.visibility = View.GONE
            card_detail.visibility = View.VISIBLE
        }
    }
}
