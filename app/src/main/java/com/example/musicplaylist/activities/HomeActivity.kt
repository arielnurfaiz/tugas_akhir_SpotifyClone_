package com.example.musicplaylist.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.musicplaylist.R



class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        intenAct()
    }

    private fun intenAct(){
        val cardView:CardView =findViewById(R.id.cVonrepeat)
        cardView.setOnClickListener{
            val intent = Intent(this@HomeActivity, ListLaguActivity::class.java )
            startActivity(intent)
        }

    }

}