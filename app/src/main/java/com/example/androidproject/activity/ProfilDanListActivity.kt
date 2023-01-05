package com.example.androidproject.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidproject.R
import com.example.androidproject.adapter.Adaptor_rv_listProfil
import com.example.androidproject.model.*
import kotlinx.android.synthetic.main.activity_profil.ivProfill
import kotlinx.android.synthetic.main.activity_profil_dan_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProfilDanListActivity : AppCompatActivity() {

    private  val list = ArrayList<ThesesItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_dan_list)

        rvProfilMahasiswa.setHasFixedSize(true)
        rvProfilMahasiswa.layoutManager = LinearLayoutManager(this)

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
            initAction()
        }

        val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)

        val username = sharePreference.getString("username", null)
        val email = sharePreference.getString("email", null)
        val name = sharePreference.getString("name", null)

        tv_nama.setText(name)
        tvnama.setText(username)

//        var listProfill = mutableListOf(
//            Item_rv_listProfil("2011520", "UDIN1", "Padang", "Padang" ),
//            Item_rv_listProfil("2011521", "UDIN2", "Padang panjang", "Padang panjang"),
//            Item_rv_listProfil("2011522", "UDIN3","Solok", "Padang"),
//            Item_rv_listProfil("2011523", "UDIN4","padang", "Medan"),
//            Item_rv_listProfil("2011524", "UDIN5","Padang", "Padang"),
//            Item_rv_listProfil("2011525", "UDIN6","Padang", "Padang"),
//            Item_rv_listProfil("2011526", "UDIN7","Padang", "Padang"),
//            Item_rv_listProfil("2011527", "UDIN8","Padang", "Padang"),
//            Item_rv_listProfil("2011528", "UDIN9","Padang", "Padang"),
//            Item_rv_listProfil("2011529", "UDIN10","Padang", "Padang"),
//            Item_rv_listProfil("2011530", "UDIN11","Padang", "Padang"),
//            Item_rv_listProfil("2011531", "UDIN12","Padang", "Padang"),
//            Item_rv_listProfil("2011532", "UDIN13","Padang", "Padang"),
//            Item_rv_listProfil("2011533", "UDIN14","Padang", "Padang"),
//            Item_rv_listProfil("2011534", "UDIN15", "Padang", "Padang"),
//        )

//        val adapter = Adaptor_rv_listProfil(listProfill)
//        rvProfilMahasiswa.adapter = adapter
//        rvProfilMahasiswa.layoutManager = LinearLayoutManager(this)

    }

//    fun itemGetClicked(){
//        val intent = Intent(this, profilmahasiswa::class.java)
//        startActivity(intent)
//    }

//    fun itemGetClicked(item: Item_rv_listProfil) {
//        Intent(this, profilmahasiswa::class.java).also {
////            val q = tvprofilmahasiswa.text.toString()
//            val nama = item.nama
//            it.putExtra("EXRA_NAMA", nama)
//
//            val nim = item.nim
//            it.putExtra("EXRA_NIM", nim)
//
//            val alamat = item.alamat
//            it.putExtra("EXRA_ALAMAT", alamat)
//
//            val ttl = item.ttl
//            it.putExtra("EXRA_TTL", ttl)
//
//            startActivity(it)
//        }
//
//    }

    fun initAction() {
        listProfil()
    }

    fun listProfil(){
        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        val sherePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
        val token =  "Bearer "+ sherePreference.getString("token", null)

        retro.getAdvisors(token).enqueue(object : Callback<com.example.androidproject.model.ListProfilRes>
        {
            override fun onResponse(
                call: Call<com.example.androidproject.model.ListProfilRes>,
                response: Response<com.example.androidproject.model.ListProfilRes>
            ) {
                if (response.body() != null){
                    response.body()?.let{list.addAll(list)}
                    val listprofil= response.body()

                    val awal:List<ThesesItem> = listprofil!!.theses
                    Log.d("A", awal.toString())
                    Log.d("A", response.body().toString())

                    val adapter = Adaptor_rv_listProfil(awal)
                    rvProfilMahasiswa.adapter = adapter

                    val sharePreference = getSharedPreferences("simpan", MODE_PRIVATE)
                    val editor = sharePreference.edit()
                }
                else{
                    val text = "NT!"
                    val duration = Toast.LENGTH_SHORT
                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()
                }

            }

            override fun onFailure(call: Call<com.example.androidproject.model.ListProfilRes>, t: Throwable) {
                val text = "NT!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }

        })
    }

    fun itemGetClicked(currentItem: ThesesItem) {

    }


}