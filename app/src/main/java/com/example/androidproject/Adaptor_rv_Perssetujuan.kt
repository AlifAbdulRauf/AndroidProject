package com.example.androidproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_itemlistjadwal.view.*

class Adaptor_rv_Perssetujuan (
    private var list1 : List<Item_Persetujuan>,
) : RecyclerView.Adapter<Adaptor_rv_Perssetujuan.PersetujuanViewHolder>() {

    inner class PersetujuanViewHolder  (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersetujuanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemlistmahasiswa,parent, false)
        return PersetujuanViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: PersetujuanViewHolder, position: Int) {
        val currentItem = list1[position]
        holder.itemView.apply{
            nimmahasiwa1.text = currentItem.nim.toString()
            namamahasiswa1.text = currentItem.nama
            judulta.text = currentItem.judul

        }
    }
}