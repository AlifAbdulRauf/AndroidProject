package com.example.androidproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject.R
import kotlinx.android.synthetic.main.activity_detail_log_book.*
import kotlinx.android.synthetic.main.activity_detail_log_book.ibBackListLogBook
import kotlinx.android.synthetic.main.activity_detail_log_book.tvJudul

class DetailLogBook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_log_book)

        var judul = intent.getStringExtra("EXRA_PENJELASAN")
        tvJudul.text = judul

        var persetujuan = intent.getStringExtra("EXRA_PERSETUJUAN")
        tvPersetujuan.text = persetujuan

        ibBackListLogBook.setOnClickListener{
            Intent(this, ListLogBook::class.java).also {
                finish()
            }
        }
    }
}