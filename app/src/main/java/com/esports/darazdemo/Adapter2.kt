package com.esports.darazdemo

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.esports.darazdemo.databinding.ItemLayout2Binding

class Adapter2(val products: List<ItemData2>): RecyclerView.Adapter<ViewHolder2>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder2 {
        val binding =  ItemLayout2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder2(binding)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder2, position: Int) {
        val product = products[position]
        holder.binding.apply {
            tvName.text = product.name
            tvType.text = product.type
            tvTime.text = "${product.time} min"
            tvPrise.text = product.price
            tvOffer.text = product.offer
            ivDinnerImage.load(product.productImage)
        }
    }
}