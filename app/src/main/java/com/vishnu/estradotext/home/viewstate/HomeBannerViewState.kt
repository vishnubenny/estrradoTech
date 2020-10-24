package com.vishnu.estradotext.home.viewstate

data class HomeBannerViewState(val bannerList: List<BannerSlider>) : HomeItemViewState {

    override fun type(): HomeItemViewState.Type {
        return HomeItemViewState.Type.BANNER
    }
}

data class BannerSlider(
    val slider_id: String,
    val slider_name: String,
    val slider_image: String
)
