package com.example.androidproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list_dan_profil_mahasiswa.view.*
import kotlinx.android.synthetic.main.rv_list_logbokk.view.*

class Adaptor_rv_listProfil (
    var list1 : List<Item_rv_listProfil>
) : RecyclerView.Adapter<Adaptor_rv_listProfil.ListProfilViewHolder>() {

    inner class ListProfilViewHolder  (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListProfilViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_dan_profil_mahasiswa,parent, false)
        return ListProfilViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: ListProfilViewHolder, position: Int) {
        holder.itemView.apply{
            nimmahasiwa1.text = list1[position].nim
            namamahasiswa1.text = list1[position].nama
            this.setOnClickListener {
                if(this.context is ProfilDanListActivity){
                    (this.context as ProfilDanListActivity).itemGetClicked(list1[position])
                }
            }
        }
    }

    //    override fun onBindViewHolder(holder: LogbookViewHolder, position: Int) {
//        holder.apply{
//            tvNumber.text = list1[position].number.toString()
//            tvDescribe.text = list1[position].describe
//            cbListLogBook.isChecked = list1[position].isChecked
//            itemView.setOnClickListener {
//                if(itemView.context is ListLogBook){
//                    (itemView.context as ListLogBook).itemGetClicked()
//                }
//            }
//        }
//    }
}