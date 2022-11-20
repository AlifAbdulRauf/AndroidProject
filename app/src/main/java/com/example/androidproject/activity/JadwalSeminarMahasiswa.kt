package com.example.androidproject.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidproject.R
import com.example.androidproject.adapter.Adaptor_rv_JadwalSS
import com.example.androidproject.model.Item_jadwal
import kotlinx.android.synthetic.main.activity_jadwalseminardansidang.*

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