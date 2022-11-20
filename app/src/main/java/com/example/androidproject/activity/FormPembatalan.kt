package com.example.androidproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject.R
import kotlinx.android.synthetic.main.form_pembatalan.*

class FormPembatalan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form_pembatalan)

        btnBatal.setOnClickListener{
            Intent(this, detailta::class.java).also {
                startActivity(it)
            }
        }

        ibBackListLogBook.setOnClickListener{
            Intent(this, detailta::class.java).also {
                finish()
            }
        }
    }
}