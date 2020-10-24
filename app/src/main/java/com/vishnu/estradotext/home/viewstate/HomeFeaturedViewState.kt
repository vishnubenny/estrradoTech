package com.vishnu.estradotext.home.viewstate

data class HomeFeaturedViewState(
    val featuredProductList: List<FeaturedProduct>
) : HomeItemViewState {

    override fun type(): HomeItemViewState.Type {
        return HomeItemViewState.Type.FEATURED
    }
}

data class FeaturedProduct(
    val prd_id: String,
    val prd_name: String,
    val prd_image: String,
    val qty: String,
    val unit: String,
    val current_stock: String,
    val price: String,
    val currency: String,
    val rating: String
)
