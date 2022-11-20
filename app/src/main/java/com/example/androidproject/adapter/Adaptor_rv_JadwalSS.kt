package com.example.androidproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidproject.model.Item_jadwal
import com.example.androidproject.R
import kotlinx.android.synthetic.main.activity_itemlistjadwal.view.*

class Adaptor_rv_JadwalSS (
    private var list1 : List<Item_jadwal>,
) : RecyclerView.Adapter<Adaptor_rv_JadwalSS.JadwalViewHolder>() {

    inner class JadwalViewHolder  (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JadwalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_itemlistjadwal,parent, false)
        return JadwalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: JadwalViewHolder, position: Int) {
        val currentItem = list1[position]
        holder.itemView.apply{
            nimmahasiwa1.text = currentItem.nim.toString()
            namamahasiswa1.text = currentItem.nama
            tanggal.text = currentItem.tanggal
            judulta.text = currentItem.judulTA

        }
    }
}