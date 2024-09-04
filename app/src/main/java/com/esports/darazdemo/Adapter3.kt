package com.esports.darazdemo

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.esports.darazdemo.databinding.ItemLayout3Binding
import kotlinx.coroutines.processNextEventInCurrentThread

class Adapter3(private val product: List<ItemData2>): RecyclerView.Adapter<ViewHolder3>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder3 {
        val binding = ItemLayout3Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder3(binding)
    }

    override fun getItemCount(): Int {
        return product.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder3, position: Int) {
        val product = product[position]
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