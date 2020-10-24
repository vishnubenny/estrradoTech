package com.vishnu.estradotext.home.viewstate

data class HomeCategoriesViewState(val homeCategoryList: List<HomeCategory>) : HomeItemViewState {

    override fun type(): HomeItemViewState.Type {
        return HomeItemViewState.Type.CATEGORIES
    }
}

data class HomeCategory(
    val category_id: String,
    val category_image: String,
    val category_name: String
)
