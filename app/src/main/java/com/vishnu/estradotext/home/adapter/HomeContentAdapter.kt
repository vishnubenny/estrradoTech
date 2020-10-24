package com.vishnu.estradotext.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnu.estradotext.home.viewstate.HomeItemViewState

class HomeContentAdapter : RecyclerView.Adapter<HomeContentViewHolder>() {
    private val list = mutableListOf<HomeItemViewState>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeContentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (HomeItemViewState.Type.values()[viewType]) {
            HomeItemViewState.Type.BANNER -> HomeBannerViewHolder(inflater, parent)
            HomeItemViewState.Type.FEATURED -> HomeFeaturedViewHolder(inflater, parent)
            HomeItemViewState.Type.CATEGORIES -> HomeCategoryViewHolder(inflater, parent)
        }
    }

    override fun onBindViewHolder(holder: HomeContentViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].type().ordinal
    }

    fun updateList(list: List<HomeItemViewState>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

}
