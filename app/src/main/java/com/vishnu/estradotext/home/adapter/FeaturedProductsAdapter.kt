package com.vishnu.estradotext.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.vishnu.estradotext.R
import com.vishnu.estradotext.home.viewstate.FeaturedProduct
import kotlinx.android.synthetic.main.row_featured_product.view.*

class FeaturedProductsAdapter :
    RecyclerView.Adapter<FeaturedProductsAdapter.FeatureProductViewHolder>() {

    private val list = mutableListOf<FeaturedProduct>()

    inner class FeatureProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(product: FeaturedProduct) {
            Glide.with(itemView)
                .load(product.prd_image)
                .into(itemView.imgVwProduct)
            itemView.txtVwProductName.text = product.prd_name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeatureProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_featured_product, parent, false)
        return FeatureProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: FeatureProductViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateList(list: List<FeaturedProduct>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }
}
