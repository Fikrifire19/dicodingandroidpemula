package com.example.dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvProduk: RecyclerView
    private var list: ArrayList<Produk> = arrayListOf()
    private var title: String = "Shop"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProduk = findViewById(R.id.rv_shop)
        rvProduk.setHasFixedSize(true)

        setActionBarTitle(title)

        list.addAll(DataProduk.listData)
        showRecyclerShop()

    }

    private fun showRecyclerShop() {
        rvProduk.layoutManager = LinearLayoutManager(this)
        val shopAdapter = Shop(list)
        rvProduk.adapter = shopAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun setMode(selectedMode: Int){
        when (selectedMode) {
            R.id.action_shop -> {
                title = "Shop"
                showRecyclerShop()
            }


            R.id.action_about_developer -> {
                title = "About Developer"
                startActivity(Intent(this@MainActivity, AboutDeveloper::class.java))
            }
        }

        setActionBarTitle(title)
    }
}