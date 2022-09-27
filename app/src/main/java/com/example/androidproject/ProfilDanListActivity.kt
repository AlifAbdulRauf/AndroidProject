package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profil.*

class ProfilDanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_dan_list)

        ivProfil.setOnClickListener {
            Intent(this,ProfilActivity :: class.java).also {
                startActivity(it)
            }
        }
    }
}