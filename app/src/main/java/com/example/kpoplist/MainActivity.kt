package com.example.kpoplist

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kpoplist.about.About
import com.example.kpoplist.kpop.Kpop
import com.example.kpoplist.kpop.KpopAdapter
import com.example.kpoplist.kpop.KpopData

class MainActivity : AppCompatActivity() {
    private lateinit var rvKpop: RecyclerView
    private var list: ArrayList<Kpop> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Profile Section
        val actionBar = supportActionBar
        actionBar!!.title = "K-Pop"

        rvKpop = findViewById(R.id.rv_kpop)
        rvKpop.setHasFixedSize(true)

        list.addAll(KpopData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvKpop.layoutManager = LinearLayoutManager(this)
        val listKpopAdapter = KpopAdapter(list)
        rvKpop.adapter = listKpopAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.my_profile -> {
                val myProfile = Intent(this@MainActivity, About::class.java)
                startActivity(myProfile)
            }
        }
    }
}