package com.example.androidproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_jadwalseminardansidang.*
import kotlinx.android.synthetic.main.activity_list_log_book.*
import kotlinx.android.synthetic.main.form_pembatalan.*
import kotlinx.android.synthetic.main.form_pembatalan.ibBackListLogBook

class JadwalSeminarMahasiswa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jadwalseminardansidang)

        BackButton.setOnClickListener{
            Intent(this, ProfilDanListActivity::class.java).also {
                finish()
            }
        }

        var jadwalSeminarMahasiswa = mutableListOf(
            Item_jadwal("Toni", 2011, "Sistem Informasi A", "20 Oktober 2022"),
            Item_jadwal("Budi", 2011, "Sistem Informasi B", "20 Oktober 2022"),
            Item_jadwal("Wahyu", 2011, "Sistem Informasi C", "20 Oktober 2022"),
            Item_jadwal("Rama", 2011, "Sistem Informasi D", "20 Oktober 2022"),
            Item_jadwal("Tono", 2011, "Sistem Informasi E", "20 Oktober 2022")
            )

        val adapter = Adaptor_rv_JadwalSS(jadwalSeminarMahasiswa)
        rvJadwalSeminar.adapter = adapter
        rvJadwalSeminar.layoutManager = LinearLayoutManager(this)

    }
}