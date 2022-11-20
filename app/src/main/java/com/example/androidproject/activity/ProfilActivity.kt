package com.example.androidproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject.R
import kotlinx.android.synthetic.main.activity_profil.*

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        ivLogout.setOnClickListener {
            Intent(this, MainActivity :: class.java).also {
                startActivity(it)
            }
        }

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
    }
}