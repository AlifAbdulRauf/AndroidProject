package com.example.androidproject.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject.R
import android.content.Intent
import android.widget.Button
import android.widget.Toast
import com.example.androidproject.model.Retro
import com.example.androidproject.model.UserApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class profilmahasiswa : AppCompatActivity() {
    var btnNilai: Button? = null
    var btnEdit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilmahasiswa)
        btnNilai!!.setOnClickListener {
            Intent(this, inputnilaita::class.java).also {
                startActivity(it)
            }
        }
        btnEdit!!.setOnClickListener {
            Intent(this, editnilaita::class.java).also {
                startActivity(it)
            }
        }
//        initAction()
//    }
////    fun initAction(){
////        profilMahasiswa()
//    }

//    fun profilMahasiswa(){
//        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
//        val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
//        val token = "Bearer "+ sharePreference.getString("token", null)
//
//        retro.profilMahasiswa(token).enqueue(object : Callback<ProfilMahasiswaRes> {
//            override fun onResponse(
//                call: Call<ProfilMahasiswaRes>,
//                response: Response<ProfilMahasiswaRes>
//            ) {
//                if (response.body() != null){
//                    val user = response.body()
//                    val awal:List<ExaminersIt> = user!!.examiners
//
//
//
//
//
//                }
//                else{
//                    val text = "GAGAL!"
//                    val duration = Toast.LENGTH_SHORT
//                    val toast = Toast.makeText(applicationContext, text, duration)
//                    toast.show()
//                }
//            }
//            }

//            override fun onFailure(call: Call<ProfilMahasiswaRes>, t: Throwable) {
//                val text = "ERROR!"
//                val duration = Toast.LENGTH_SHORT
//                val toast = Toast.makeText(applicationContext, text, duration)
//                toast.show()

//        })

    }
}

