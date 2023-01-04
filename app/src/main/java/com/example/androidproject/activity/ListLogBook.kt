package com.example.androidproject.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidproject.R
import com.example.androidproject.adapter.Adaptor_rv_logbok
import com.example.androidproject.model.*
import kotlinx.android.synthetic.main.activity_list_log_book.*
import kotlinx.android.synthetic.main.activity_list_log_book.ibBackListLogBook
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListLogBook : AppCompatActivity() {

    private val list = ArrayList<LogbooksItem>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_log_book)

        rvLogbook.setHasFixedSize(true)
        rvLogbook.layoutManager = LinearLayoutManager(this)

//        var listlogbook = mutableListOf(
//            Item_logbook(1, "Initiate Sistem Informasi", false),
//            Item_logbook(2, "Planning ", false),
//            Item_logbook(3, "Executing Sistem Informasi ", false),
//            Item_logbook(4, "Controlling Sistem Informasi ", false),
//            Item_logbook(5, "Closing Sistem Informasi ", false),
//
//        )

        ibBackListLogBook.setOnClickListener{
            Intent(this, detailta::class.java).also {
                finish()
            }
        }

        initAction()
    }

    fun initAction() {
        listlog()

    }



    fun listlog(){
        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
        val token = "Bearer "+ sharePreference.getString("token", null)

        retro.listLog(token).enqueue(object : Callback<com.example.androidproject.model.Response> {
            override fun onResponse(
                call: Call<com.example.androidproject.model.Response>,
                response: Response<com.example.androidproject.model.Response>
            ) {

                if (response.body() != null){

                    response.body()?.let{list.addAll(list)}
                    val listlogbook = response.body()

                    val awal:List<LogbooksItem> = listlogbook!!.logbooks
                    Log.d("Abdul", awal.toString())
                    Log.d("ALIF", response.body().toString())
//                    for(i in 1..10){
//                        Log.d("Bro", awal[i].progress.toString())
//                    }

//                    var list2 = mutableListOf(
//                        LogbooksItem("sdsd"),
//                        LogbooksItem("sdsd"),
//                        LogbooksItem("sdsd"),
//                        LogbooksItem("sdsd")
//                    )

                    val adapter = Adaptor_rv_logbok(awal)
                    rvLogbook.adapter = adapter

                    val sharePreference = getSharedPreferences("simpan", Context.MODE_PRIVATE)
                    val editor = sharePreference.edit()




//                    intent = Intent(this@ListLogBook, ProfilDanListActivity::class.java)
//                    startActivity(intent)
                }
                else{
                    val text = "NT!"
                    val duration = Toast.LENGTH_SHORT
                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()
                }

            }

            override fun onFailure(call: Call<com.example.androidproject.model.Response>, t: Throwable) {
                val text = "NT!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        })

    }


    fun itemGetClicked(item: LogbooksItem){
        Intent(this, DetailLogBook::class.java).also {
            val id = item.id
            val progress = item.progress
            it.putExtra("EXRA_ID", id)

            startActivity(it)
        }
    }


}