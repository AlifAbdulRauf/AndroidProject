package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_log_book.*

class ListLogBook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_log_book)




        var listlogbook = mutableListOf(
            Item_logbook(1, "Analisi Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(2, "Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(3, "Analisi Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(1, "Analisi Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(2, "Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(3, "Analisi Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(1, "Analisi Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(2, "Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(3, "Analisi Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(1, "Analisi Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(2, "Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(3, "Analisi Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(1, "Analisi Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(2, "Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
            Item_logbook(3, "Analisi Bisnis Proses Sistem Informasi Riset Inovasi Pemerintah dan Masyarakat Kabupaten Sragen (SI-RISMA) ", false),
        )

        val adapter = Adaptor_rv_logbok(listlogbook)
        rvLogbook.adapter = adapter
        rvLogbook.layoutManager = LinearLayoutManager(this)

        ibBackListLogBook.setOnClickListener(){
            Intent(this, MainActivity::class.java)
            finish()

        }

    }
    fun itemGetClicked(){
        val intent = Intent(this, DetailLogBook::class.java)
        startActivity(intent)
    }

}