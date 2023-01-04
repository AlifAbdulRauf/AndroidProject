package com.example.androidproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidproject.R
import com.example.androidproject.activity.ListLogBook
import com.example.androidproject.model.*
import kotlinx.android.synthetic.main.activity_list_log_book.view.*
import kotlinx.android.synthetic.main.rv_list_logbokk.view.*

class Adaptor_rv_logbok (

    private var list1 : List<LogbooksItem>,

) : RecyclerView.Adapter<Adaptor_rv_logbok.LogbookViewHolder>() {

    inner class LogbookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LogbookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_list_logbokk, parent, false)
        return LogbookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: LogbookViewHolder, position: Int) {
        val currentItem = list1[position]
//        holder.bind(currentItem)
        holder.itemView.apply {
            tvDescribe.text = currentItem.progress
            tv_nomor.text = currentItem.id.toString()

            this.setOnClickListener {
                if(this.context is ListLogBook){
                    (this.context as ListLogBook).itemGetClicked(currentItem)

                }
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


//
//package com.example.androidproject.adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.androidproject.model.Item_logbook
//import com.example.androidproject.activity.ListLogBook
//import com.example.androidproject.R
//import kotlinx.android.synthetic.main.rv_list_logbokk.view.*
//
//class Adaptor_rv_logbok (
//    private var list1 : List<Item_logbook>,
//) : RecyclerView.Adapter<Adaptor_rv_logbok.LogbookViewHolder>() {
//
//    inner class LogbookViewHolder  (itemView: View) : RecyclerView.ViewHolder(itemView)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int): LogbookViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_list_logbokk,parent, false)
//        return LogbookViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        return list1.size
//    }
//
//    override fun onBindViewHolder(holder: LogbookViewHolder, position: Int) {
//        val currentItem = list1[position]
//        holder.itemView.apply{
//            tvNumber.text = currentItem.number.toString()
//            tvDescribe.text = currentItem.describe
//            cbListLogBook.isChecked = currentItem.isChecked
//
//
//            this.setOnClickListener {
//                currentItem.isChecked = cbListLogBook.isChecked
//                if(this.context is ListLogBook){
//                    (this.context as ListLogBook).itemGetClicked(currentItem)
//
//                }
//            }
//        }
//    }
//
//
//
//    //    override fun onBindViewHolder(holder: LogbookViewHolder, position: Int) {
////        holder.apply{
////            tvNumber.text = list1[position].number.toString()
////            tvDescribe.text = list1[position].describe
////            cbListLogBook.isChecked = list1[position].isChecked
////            itemView.setOnClickListener {
////                if(itemView.context is ListLogBook){
////                    (itemView.context as ListLogBook).itemGetClicked()
////                }
////            }
////        }
////    }
//
//
//}

