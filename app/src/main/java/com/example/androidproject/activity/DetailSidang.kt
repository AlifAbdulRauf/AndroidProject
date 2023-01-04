package com.example.androidproject.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidproject.R
import com.example.androidproject.model.*
import kotlinx.android.synthetic.main.activity_detail_log_book.*
import kotlinx.android.synthetic.main.activity_detail_log_book.tvPersetujuan
import kotlinx.android.synthetic.main.activity_detail_sidang.*
import kotlinx.android.synthetic.main.form_pembatalan.*
import kotlinx.android.synthetic.main.form_pembatalan.ibBackListLogBook
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailSidang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sidang)

        ibBackListLogBook.setOnClickListener{
            Intent(this, detailta::class.java).also {
                finish()
            }
        }
        initAction()
    }

    fun initAction() {
        detailSidang()

    }

    fun detailSidang(){

        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
        val token = "Bearer "+ sharePreference.getString("token", null)

        retro.detaiSidang(token).enqueue(object : Callback<DetailSidangRes> {

            override fun onResponse(call: Call<DetailSidangRes>, response: Response<DetailSidangRes>) {

                if (response.body() != null){
                    val user = response.body()
                    val awal:List<ExaminersItem> = user!!.examiners
                    tvPersetujuan3.text = user!!.grade
                    tvPersetujuan7.text = user!!.id.toString()

                    tvPersetujuan.text = awal[0].name + "\n" + awal[1].name




                }
                else{
                    val text = "GAGAL!"
                    val duration = Toast.LENGTH_SHORT
                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()
                }
            }

            override fun onFailure(call: Call<DetailSidangRes>, t: Throwable) {
                val text = "ERROR!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        })


    }
}