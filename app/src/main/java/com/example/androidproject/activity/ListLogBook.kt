package com.example.androidproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidproject.R
import com.example.androidproject.adapter.Adaptor_rv_logbok
import com.example.androidproject.model.Item_logbook
import kotlinx.android.synthetic.main.activity_list_log_book.*
import kotlinx.android.synthetic.main.activity_list_log_book.ibBackListLogBook

class ListLogBook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_log_book)

        var listlogbook = mutableListOf(
            Item_logbook(1, "Initiate Sistem Informasi", false),
            Item_logbook(2, "Planning ", false),
            Item_logbook(3, "Executing Sistem Informasi ", false),
            Item_logbook(4, "Controlling Sistem Informasi ", false),
            Item_logbook(5, "Closing Sistem Informasi ", false),

        )

        val adapter = Adaptor_rv_logbok(listlogbook)
        rvLogbook.adapter = adapter
        rvLogbook.layoutManager = LinearLayoutManager(this)


        ibBackListLogBook.setOnClickListener{
            Intent(this, detailta::class.java).also {
                finish()
            }
        }
    }

    fun itemGetClicked(item: Item_logbook){
        Intent(this, DetailLogBook::class.java).also {
            val persetujuan = item.isChecked
            val penjelasan = item.describe
            it.putExtra("EXRA_PENJELASAN", penjelasan)

            var tulisan : String
            if (persetujuan == true){
                tulisan = "Persetujuan : Disetujui"
            }
            else {
                tulisan = "Persetujuan : Tidak Disetujui"
            }
            it.putExtra("EXRA_PERSETUJUAN",tulisan)


            startActivity(it)
        }
    }


}