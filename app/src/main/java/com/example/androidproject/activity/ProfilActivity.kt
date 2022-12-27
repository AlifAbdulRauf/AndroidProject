package com.example.androidproject.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidproject.R
import com.example.androidproject.model.*
import kotlinx.android.synthetic.main.activity_profil.*
import kotlinx.android.synthetic.main.activity_profil.btnEditProfil
import kotlinx.android.synthetic.main.activity_profil.btnGantiPass
import kotlinx.android.synthetic.main.activity_profil.textView3
import kotlinx.android.synthetic.main.activity_profil_dan_list.*
import kotlinx.android.synthetic.main.activity_ubah_pass.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        initAction()

        btnEditProfil.setOnClickListener {
            Intent(this, UbahProfilActivity :: class.java).also {
                startActivity(it)
            }
            btnGantiPass.setOnClickListener {
                Intent(this, UbahPassActivity :: class.java).also {
                    startActivity(it)

                }
            }
        }

        val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
        val username = sharePreference.getString("username", null)
        val email = sharePreference.getString("email", null)
        val name = sharePreference.getString("name", null)

        editTextTextPersonName.setText(name)
        editTextTextPersonName2.setText(username)
        editTextTextPersonName3.setText(email)
        textView3.setText(name)
        tv_nip.setText(username)

    }

    fun initAction() {
        ivLogout.setOnClickListener{
            logout()
            Intent(this, MainActivity::class.java).also{
                startActivity(it)
            }

        }

    }


    fun logout(){

        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
        val token = "Bearer "+ sharePreference.getString("token", null)

        retro.logout(token).enqueue(object : Callback<LogOutResponse> {

            override fun onResponse(call: Call<LogOutResponse>, response: Response<LogOutResponse>) {

                if (response.body() != null){
                    val user = response.body()
                    val message = user!!.message
                    val duration = Toast.LENGTH_SHORT
                    val toast = Toast.makeText(applicationContext, message, duration);
                    toast.show()

                }
                else{
                    val text = "GAGAL!"
                    val duration = Toast.LENGTH_SHORT
                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()
                }

            }

            override fun onFailure(call: Call<LogOutResponse>, t: Throwable) {
                val text = "ERROR!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        })

    }
}