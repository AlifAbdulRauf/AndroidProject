package com.example.androidproject.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidproject.R
import com.example.androidproject.model.DetailLogRes
import com.example.androidproject.model.LogOutResponse
import com.example.androidproject.model.Retro
import com.example.androidproject.model.UserApi
import kotlinx.android.synthetic.main.activity_detail_log_book.*
import kotlinx.android.synthetic.main.activity_detail_log_book.ibBackListLogBook
import kotlinx.android.synthetic.main.activity_detail_log_book.tvJudul
import kotlinx.android.synthetic.main.activity_profil.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailLogBook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_log_book)

        initAction()

        ibBackListLogBook.setOnClickListener{
            Intent(this, ListLogBook::class.java).also {
                finish()
            }
        }
    }

    fun initAction() {
        detail()


    }


    fun detail(){

        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
        val token = "Bearer "+ sharePreference.getString("token", null)

        var id = intent.getIntExtra("EXRA_ID", 0)
        retro.detailLog(id,token).enqueue(object : Callback<DetailLogRes> {

            override fun onResponse(call: Call<DetailLogRes>, response: Response<DetailLogRes>) {

                if (response.body() != null){
                    val user = response.body()
                    tvJudul.text = user!!.progress.toString()
                    tv_kendala.text = user!!.problem.toString()

                }
                else{
                    val text = "GAGAL!"
                    val duration = Toast.LENGTH_SHORT
                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()
                }
            }

            override fun onFailure(call: Call<DetailLogRes>, t: Throwable) {
                val text = "ERROR!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        })

    }
}