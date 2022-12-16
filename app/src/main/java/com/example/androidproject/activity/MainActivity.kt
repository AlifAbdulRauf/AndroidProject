package com.example.androidproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.androidproject.R
import com.example.androidproject.model.Retro
import com.example.androidproject.model.UserApi
import com.example.androidproject.model.UserRequest
import com.example.androidproject.model.UserResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAction()
        }

        fun initAction() {
            btnLogin.setOnClickListener{
                login()
                Intent(this, ProfilDanListActivity::class.java).also {
                    startActivity(it)
                }
            }
        }


        fun login(){
            val request =UserRequest()
            request.username = ti_nip.text.toString().trim()
            request.password = ti_password.text.toString().trim()

            val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
            retro.login(request).enqueue(object : Callback<UserResponse>{

                override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse> ) {
                    val user = response.body()
                    val text = "Token anda : " + user!!.authorisation?.token
                    val duration = Toast.LENGTH_SHORT
                    val token = user!!.authorisation?.token

                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()

                }

                override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                    val text = "Gagal Login  NT!"
                    val duration = Toast.LENGTH_SHORT

                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()
                }

            })

        }
}