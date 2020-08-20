package com.example.dicoding

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class Shop(private val listProduk: ArrayList<Produk>): RecyclerView.Adapter<Shop.ShopViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ShopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.gambar_produk)
        var tvNameProduk: TextView = itemView.findViewById(R.id.nama_item)
        var tvHarga: TextView = itemView.findViewById(R.id.harga_item)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
        var btnBeli: Button = itemView.findViewById(R.id.btn_beli)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ShopViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_shop, viewGroup, false)
        return ShopViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        val produk = listProduk[position]

        Glide.with(holder.itemView.context)
            .load(produk.foto_produk)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvNameProduk.text = produk.nama_produk
        holder.tvHarga.text = produk.harga_produk.toString()

        holder.btnDetail.setOnClickListener {
            val context = holder.btnDetail.context
            val produkDetailActivity = Intent(context, ProdukDetail::class.java)

            produkDetailActivity.putExtra(ProdukDetail.DATA_NAMA_PRODUK, produk.nama_produk)
            produkDetailActivity.putExtra(ProdukDetail.DATA_HARGA_PRODUK, produk.harga_produk)
            produkDetailActivity.putExtra(ProdukDetail.DATA_FOTO_PRODUK, produk.foto_produk)
            context.startActivity(produkDetailActivity)
        }
        holder.btnBeli.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Beli" + listProduk[holder.adapterPosition].nama_produk,
                Toast.LENGTH_SHORT
            ).show()
        }

        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Kamu memilih" + listProduk[holder.adapterPosition].nama_produk,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return listProduk.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Produk)
    }
}