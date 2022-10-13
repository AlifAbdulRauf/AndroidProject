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
            Item_rv_listProfil(2011520, "UDIN1"),
            Item_rv_listProfil(2011521, "UDIN2"),
            Item_rv_listProfil(2011522, "UDIN3"),
            Item_rv_listProfil(2011523, "UDIN4"),
            Item_rv_listProfil(2011524, "UDIN5"),
            Item_rv_listProfil(2011525, "UDIN6"),
            Item_rv_listProfil(2011526, "UDIN7"),
            Item_rv_listProfil(2011527, "UDIN8"),
            Item_rv_listProfil(2011528, "UDIN9"),
            Item_rv_listProfil(2011529, "UDIN10"),
            Item_rv_listProfil(2011530, "UDIN11"),
            Item_rv_listProfil(2011531, "UDIN12"),
            Item_rv_listProfil(2011532, "UDIN13"),
            Item_rv_listProfil(2011533, "UDIN14"),
            Item_rv_listProfil(2011534, "UDIN15"),
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