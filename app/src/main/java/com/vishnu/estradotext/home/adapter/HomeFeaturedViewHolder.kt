package com.vishnu.estradotext.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.vishnu.estradotext.R
import com.vishnu.estradotext.home.viewstate.HomeFeaturedViewState
import com.vishnu.estradotext.home.viewstate.HomeItemViewState
import kotlinx.android.synthetic.main.row_home_featured.view.*

class HomeFeaturedViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    HomeContentViewHolder(inflater, parent, R.layout.row_home_featured) {

    private val featuredProductsAdapter = FeaturedProductsAdapter()

    init {
        itemView.rcVwFeaturesProducts.adapter = featuredProductsAdapter
    }

    override fun bind(itemViewState: HomeItemViewState) {
        val viewState = itemViewState as HomeFeaturedViewState
        featuredProductsAdapter.updateList(viewState.featuredProductList)
    }
}
