package com.example.androidproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail_log_book.*
import kotlinx.android.synthetic.main.activity_jadwalseminardansidang.*
import kotlinx.android.synthetic.main.activity_persetujuannimbingan_ta.*

class PersetujuanBimbingan : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persetujuannimbingan_ta)

        ibBackListLogBook.setOnClickListener{
            Intent(this, ListLogBook::class.java).also {
                finish()
            }
        }

        var listpersetujuan = mutableListOf(
            Item_Persetujuan("Toni", 2011, "Sistem Informasi A"),
            Item_Persetujuan("Budi", 2011, "Sistem Informasi B"),
            Item_Persetujuan("Wahyu", 2011, "Sistem Informasi C"),
            Item_Persetujuan("Rama", 2011, "Sistem Informasi D"),
            Item_Persetujuan("Tono", 2011, "Sistem Informasi E")
        )

        val adapter = Adaptor_rv_Perssetujuan(listpersetujuan)
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }
}