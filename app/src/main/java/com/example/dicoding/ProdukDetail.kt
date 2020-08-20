package com.example.dicoding

import android.app.ActionBar
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProdukDetail: AppCompatActivity() {

    private var list: ArrayList<Produk> = arrayListOf()

    private lateinit var detail_gambar: ImageView
    private lateinit var detail_nama: TextView
    private lateinit var detail_kategori: TextView
    private lateinit var detail_deskripsi: TextView
    private lateinit var detail_harga: TextView
    private lateinit var namaProdukClass: String

    companion object {
        const val DATA_NAMA_PRODUK = ""
        const val DATA_HARGA_PRODUK = ""
        const val DATA_FOTO_PRODUK = ""
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.detail_produk)
        this.setActionBarTitle("Detail Produk")

        namaProdukClass = intent.getStringExtra(DATA_NAMA_PRODUK)
        val hargaProdukDetail = intent.getStringExtra(DATA_HARGA_PRODUK)
        val gambarProdukDetail = intent.getIntExtra(DATA_FOTO_PRODUK, 0)
        detail_gambar = findViewById(R.id.detail_gambar_produk)
        detail_gambar.setImageResource(gambarProdukDetail)

        setDetailInformation(namaProdukClass, hargaProdukDetail)

    }

    private fun setDetailInformation(namaProduk : String, hargaProdukDetail : String) {
        detail_nama = findViewById(R.id.detail_nama_produk)
        detail_nama.text =  namaProduk.toString()

        detail_kategori = findViewById(R.id.detail_kategori_produk)
        detail_kategori.text = DataProduk.kategoriProduk[namaProduk].toString()

        detail_deskripsi = findViewById(R.id.detail_deskripsi_produk)
        detail_deskripsi.text = DataProduk.deskripsiProduk[namaProduk].toString()

        detail_harga = findViewById(R.id.detail_harga_produk)
        detail_harga.text = hargaProdukDetail.toString()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private operator fun <T> Array<T>.get(namaProduk: T): T {
        return namaProduk
    }
}
