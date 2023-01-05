package com.example.androidproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidproject.model.Item_rv_listProfil
import com.example.androidproject.activity.ProfilDanListActivity
import com.example.androidproject.R
import com.example.androidproject.model.ListProfilRes
import com.example.androidproject.model.ThesesItem
import kotlinx.android.synthetic.main.item_list_dan_profil_mahasiswa.view.*

class Adaptor_rv_listProfil(
    private var list1: List<ThesesItem>

) : RecyclerView.Adapter<Adaptor_rv_listProfil.ListProfilViewHolder>() {

    inner class ListProfilViewHolder  (itemView: View) : RecyclerView.ViewHolder(itemView)
//    {
//             fun bind(profilDanListActivity: profil) {
//                with(itemView) {
//                    val text = "text: ${listlog.progress}"
//                    tvDescribe.text = text

////            }
////        }
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListProfilViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_dan_profil_mahasiswa,parent, false)
        return ListProfilViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: ListProfilViewHolder, position: Int) {
        val currentItem = list1[position]
//        holder.bind(currentItem)
        holder.itemView.apply{
            nimmahasiwa1.text = currentItem.student?.nim.toString()
            namamahasiswa1.text = currentItem.student?.name.toString()

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
//                }



}