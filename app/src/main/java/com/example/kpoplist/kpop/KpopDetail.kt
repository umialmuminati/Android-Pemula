package com.example.kpoplist.kpop

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.kpoplist.R

class KpopDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_detail)

        val actionBar = supportActionBar
        actionBar!!.title = "Detail Grup Kpop"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val namaGrup: TextView = findViewById(R.id.nama_grup)
        val imgGrupPhoto: ImageView = findViewById(R.id.img_item_photo_group)
        val detailGrup: TextView = findViewById(R.id.tv_set_detail)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        namaGrup.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgGrupPhoto)
        detailGrup.text = detail
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
