package com.example.androidproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidproject.R
import com.example.androidproject.adapter.Adapter_rv_detailSeminar
import com.example.androidproject.model.item_detailSeminar
import kotlinx.android.synthetic.main.activity_detail_seminar.*
import kotlinx.android.synthetic.main.form_pembatalan.ibBackListLogBook

class DetailSeminar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_seminar)

        ibBackListLogBook.setOnClickListener{
            Intent(this, detailta::class.java).also {
                finish()
            }
        }

        var listProfill = mutableListOf(
            item_detailSeminar("Alif", "2020", "2011522024" ),
            item_detailSeminar("Abdul", "2021", "2111522024" ),
            item_detailSeminar("Doni", "2022", "2211522024" ),
            item_detailSeminar("Rara", "2020", "2011522023" ),
            item_detailSeminar("Andi", "2019", "1911522024" ),
            item_detailSeminar("Budi", "2018", "1811522024" ),
        )

        val adapter = Adapter_rv_detailSeminar(listProfill)
        rv_detail_seminar.adapter = adapter
        rv_detail_seminar.layoutManager = LinearLayoutManager(this)

    }
}
