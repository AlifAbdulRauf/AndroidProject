package com.example.androidproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidproject.R
import com.example.androidproject.adapter.Adaptor_rv_listProfil
import com.example.androidproject.model.Item_rv_listProfil
import kotlinx.android.synthetic.main.activity_profil.ivProfill
import kotlinx.android.synthetic.main.activity_profil_dan_list.*

class ProfilDanListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_dan_list)

        ivProfill.setOnClickListener {
            Intent(this, ProfilActivity :: class.java).also {
                startActivity(it)
            }
        }
        btnKeJadwal.setOnClickListener{
            Intent(this, JadwalSeminarMahasiswa ::class.java).also{
                startActivity(it)
            }
        }

        btnKedetailTA.setOnClickListener{
            Intent(this, detailta :: class.java).also{
                startActivity(it)
            }
        }

        imageButton.setOnClickListener{
            Intent(this, PersetujuanBimbingan ::class.java ).also {
                startActivity(it)
            }
        }

        var listProfill = mutableListOf(
            Item_rv_listProfil("2011520", "UDIN1", "Padang", "Padang" ),
            Item_rv_listProfil("2011521", "UDIN2", "Padang panjang", "Padang panjang"),
            Item_rv_listProfil("2011522", "UDIN3","Solok", "Padang"),
            Item_rv_listProfil("2011523", "UDIN4","padang", "Medan"),
            Item_rv_listProfil("2011524", "UDIN5","Padang", "Padang"),
            Item_rv_listProfil("2011525", "UDIN6","Padang", "Padang"),
            Item_rv_listProfil("2011526", "UDIN7","Padang", "Padang"),
            Item_rv_listProfil("2011527", "UDIN8","Padang", "Padang"),
            Item_rv_listProfil("2011528", "UDIN9","Padang", "Padang"),
            Item_rv_listProfil("2011529", "UDIN10","Padang", "Padang"),
            Item_rv_listProfil("2011530", "UDIN11","Padang", "Padang"),
            Item_rv_listProfil("2011531", "UDIN12","Padang", "Padang"),
            Item_rv_listProfil("2011532", "UDIN13","Padang", "Padang"),
            Item_rv_listProfil("2011533", "UDIN14","Padang", "Padang"),
            Item_rv_listProfil("2011534", "UDIN15", "Padang", "Padang"),
        )

        val adapter = Adaptor_rv_listProfil(listProfill)
        rvProfilMahasiswa.adapter = adapter
        rvProfilMahasiswa.layoutManager = LinearLayoutManager(this)

    }

//    fun itemGetClicked(){
//        val intent = Intent(this, profilmahasiswa::class.java)
//        startActivity(intent)
//    }

    fun itemGetClicked(item: Item_rv_listProfil) {
        Intent(this, profilmahasiswa::class.java).also {
//            val q = tvprofilmahasiswa.text.toString()
            val nama = item.nama
            it.putExtra("EXRA_NAMA", nama)

            val nim = item.nim
            it.putExtra("EXRA_NIM", nim)

            val alamat = item.alamat
            it.putExtra("EXRA_ALAMAT", alamat)

            val ttl = item.ttl
            it.putExtra("EXRA_TTL", ttl)

            startActivity(it)
        }
    }

}