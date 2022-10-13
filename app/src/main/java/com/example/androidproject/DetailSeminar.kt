package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.form_pembatalan.*

class DetailSeminar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_seminar)

        ibBackListLogBook.setOnClickListener{
            Intent(this, detailta::class.java).also {
                finish()
            }
        }
    }
}