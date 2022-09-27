package com.example.androidproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterViewAnimator
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_list_logbokk.view.*

class Adaptor_rv_logbok (
    var list1 : List<Item_logbook>
) : RecyclerView.Adapter<Adaptor_rv_logbok.LogbookViewHolder>() {

    inner class LogbookViewHolder  (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LogbookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_list_logbokk,parent, false)
        return LogbookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: LogbookViewHolder, position: Int) {
        holder.itemView.apply{
            tvNumber.text = list1[position].number.toString()
            tvDescribe.text = list1[position].describe
            cbListLogBook.isChecked = list1[position].isChecked
            this.setOnClickListener {
                if(this.context is ListLogBook){
                    (this.context as ListLogBook).itemGetClicked()
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
