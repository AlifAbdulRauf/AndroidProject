package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_log_book.*
import kotlinx.android.synthetic.main.activity_profil.ivProfill
import kotlinx.android.synthetic.main.activity_profil_dan_list.*

class ProfilDanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_dan_list)

        ivProfill.setOnClickListener {
            Intent(this,ProfilActivity :: class.java).also {
                startActivity(it)
            }
        }
        btnKeJadwal.setOnClickListener{
            Intent(this, jadwalseminardansidang ::class.java).also{
                startActivity(it)
            }
        }

        btnKedetailTA.setOnClickListener{
            Intent(this, detailta :: class.java).also{
                startActivity(it)
            }
        }

        imageButton.setOnClickListener{
            Intent(this, persetujuanbimbinganta ::class.java ).also {
                startActivity(it)
            }
        }

        var listProfill = mutableListOf(
            Item_rv_listProfil(2011522, "AA"),
            Item_rv_listProfil(2011523, "AB"),
            Item_rv_listProfil(2011524, "AA"),
            Item_rv_listProfil(2011522, "AA"),
            Item_rv_listProfil(2011522, "AC"),
            Item_rv_listProfil(2011522, "AA"),
            Item_rv_listProfil(2011522, "AC"),
            Item_rv_listProfil(2011522, "AA"),
            Item_rv_listProfil(2011522, "AC"),
            Item_rv_listProfil(2011522, "AA"),
            Item_rv_listProfil(2011522, "AC"),
            Item_rv_listProfil(2011522, "AA"),
            Item_rv_listProfil(2011522, "AC"),
            Item_rv_listProfil(2011522, "AA"),
            Item_rv_listProfil(2011522, "AC"),
        )

        val adapter = Adaptor_rv_listProfil(listProfill)
        rvProfilMahasiswa.adapter = adapter
        rvProfilMahasiswa.layoutManager = LinearLayoutManager(this)

    }

    fun itemGetClicked(){
        val intent = Intent(this, profilmahasiswa::class.java)
        startActivity(intent)
    }

}