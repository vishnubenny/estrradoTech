package com.vishnu.estradotext.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.vishnu.estradotext.R
import com.vishnu.estradotext.home.viewstate.HomeBannerViewState
import com.vishnu.estradotext.home.viewstate.HomeItemViewState
import kotlinx.android.synthetic.main.row_home_banner.view.*

class HomeBannerViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    HomeContentViewHolder(inflater, parent, R.layout.row_home_banner) {

    override fun bind(itemViewState: HomeItemViewState) {
        val viewState = itemViewState as HomeBannerViewState
        val adapter = BannerSliderAdapter(viewState.bannerList)
        itemView.sliderHomeBanner.setAdapter(adapter)
    }

}
