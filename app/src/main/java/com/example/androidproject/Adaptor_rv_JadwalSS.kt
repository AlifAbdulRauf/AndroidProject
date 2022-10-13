package com.example.androidproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_itemlistjadwal.view.*
import kotlinx.android.synthetic.main.rv_list_logbokk.view.*

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