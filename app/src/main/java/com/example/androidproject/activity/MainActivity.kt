package com.example.androidproject.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.androidproject.R
import com.example.androidproject.model.*
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
        }

    }

    fun login(){
        val request =UserRequest()
        request.username = ti_nip.text.toString().trim()
        request.password = ti_password.text.toString().trim()

        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        retro.login(request).enqueue(object : Callback<UserResponse>{

            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse> ) {

                if (response.body() != null){
                    val user = response.body()
                    val text = "Token anda : " + user!!.authorisation?.token
                    val duration = Toast.LENGTH_SHORT
                    val token = user!!.authorisation?.token
                    val name = user!!.identitas?.name
                    val email = user!!.identitas?.email
                    val username = user!!.identitas?.username
                    val toast = Toast.makeText(applicationContext, text, duration);
                    toast.show()

                    val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
                    val editor = sharePreference.edit()
                    editor.apply{
                        putString("token", token)
                        putString("name", name)
                        putString("email", email)
                        putString("username", username)
                        apply()
                    }

                    intent = Intent(this@MainActivity, ProfilDanListActivity::class.java)
                    startActivity(intent)
                }
                else{
                    val text = "Gagal Login  NT!"
                    val duration = Toast.LENGTH_SHORT
                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()
                }

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