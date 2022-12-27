package com.example.androidproject.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidproject.R
import com.example.androidproject.model.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_ubah_pass.*
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UbahPassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubah_pass)

        initAction()
    }

    fun initAction() {
        btnEditProfil.setOnClickListener{
            ubahpass()
        }

    }


    fun ubahpass(){
        val request = ChangePassReq()

        request.old_password = textInputEditText3.text.toString().trim()
        request.new_password = editText.text.toString().trim()
        request.confirm_password = editText2.text.toString().trim()

        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
        val token = "Bearer "+ sharePreference.getString("token", null)

        retro.update(token, request).enqueue(object : Callback<ChangePassResponde> {

            override fun onResponse(call: Call<ChangePassResponde>, response: Response<ChangePassResponde>) {

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

            override fun onFailure(call: Call<ChangePassResponde>, t: Throwable) {
                val text = "ERROR!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        })

    }
}