package com.example.androidproject.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.os.Bundle
import com.example.androidproject.R
import android.content.Intent
import android.view.View
import android.widget.Toast
import com.example.androidproject.activity.profilmahasiswa
import com.example.androidproject.model.*
import kotlinx.android.synthetic.main.activity_inputnilaita.*
import kotlinx.android.synthetic.main.activity_ubah_pass.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class inputnilaita : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputnilaita)
        btnnilai1
        initAction()
    }

    fun initAction() {
        btnnilai1.setOnClickListener{
            inputnilaita()
        }
    }

    fun inputnilaita(){
        val request = NilaiTaReq()

        request.grade = grade.text.toString().trim()

        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
        val token = "Bearer "+ sharePreference.getString("token", null)
        2
        retro.nilaiTa(token, request).enqueue(object : Callback<NilaiTaRes> {

            override fun onResponse(call: Call<NilaiTaRes>, response: Response<NilaiTaRes>) {

                if (response.body() != null){
                    val user = response.body()
                    val status = user!!.status
                    val duration = Toast.LENGTH_SHORT
                    val toast = Toast.makeText(applicationContext, status, duration);
                    toast.show()

                }
                else{
                    val text = "GAGAL!"
                    val duration = Toast.LENGTH_SHORT
                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()
                }

            }

            override fun onFailure(call: Call<NilaiTaRes>, t: Throwable) {
                val text = "ERROR!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        })

    }


}
