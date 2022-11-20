package com.example.androidproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidproject.R
import com.example.androidproject.model.item_detailSeminar
import kotlinx.android.synthetic.main.activity_itemlistjadwal.view.*
import kotlinx.android.synthetic.main.item_detail_seminar.view.*

class Adapter_rv_detailSeminar (
    private var list1 : List<item_detailSeminar>,
) : RecyclerView.Adapter<Adapter_rv_detailSeminar.DetailSeminarViewHolder>() {

    inner class DetailSeminarViewHolder  (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailSeminarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail_seminar,parent, false)
        return DetailSeminarViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: DetailSeminarViewHolder, position: Int) {
        val currentItem = list1[position]
        holder.itemView.apply{
            nimmdetail.text = currentItem.nim.toString()
            namadetail.text = currentItem.nama
            angkatan.text = currentItem.angkatan



        }
    }
}

