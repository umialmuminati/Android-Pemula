package com.example.kpoplist.kpop

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.kpoplist.R

class KpopAdapter(val listKpop: ArrayList<Kpop>) : RecyclerView.Adapter<KpopAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KpopAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.layout_item_kpop, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: KpopAdapter.ListViewHolder, position: Int) {
        val kpop = listKpop[position]

        Glide.with(holder.itemView.context)
            .load(kpop.photoLogo)
            .apply(RequestOptions())
            .into(holder.imgPhotoLogo)

        holder.tvName.text = kpop.name
        holder.tvAgencyName.text = kpop.agencyName

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, KpopDetail::class.java)
            moveDetail.putExtra(KpopDetail.EXTRA_NAME, kpop.name)
            moveDetail.putExtra(KpopDetail.EXTRA_PHOTO, kpop.photoGroup)
            moveDetail.putExtra(KpopDetail.EXTRA_DETAIL, kpop.groupDetail)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listKpop.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvAgencyName: TextView = itemView.findViewById(R.id.tv_nama_agensi)
        var imgPhotoLogo: ImageView = itemView.findViewById(R.id.img_item_logo)
    }
}