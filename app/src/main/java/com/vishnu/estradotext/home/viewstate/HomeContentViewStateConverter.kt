package com.vishnu.estradotext.home.viewstate

import com.vishnu.core.home.api.ApiBannerSlider
import com.vishnu.core.home.api.ApiCategory
import com.vishnu.core.home.api.ApiFeatured
import com.vishnu.core.home.api.ApiHomeContent

class HomeContentViewStateConverter {

    fun apply(apiHomeContent: ApiHomeContent): HomeContentViewState {
        val logo = getString(apiHomeContent.data?.logo)
        val itemViewStateList = mutableListOf<HomeItemViewState>()
        itemViewStateList.add(homeBannerViewState(apiHomeContent.data?.banner_slider))
        itemViewStateList.add(homeFeaturedViewState(apiHomeContent.data?.featured))
        itemViewStateList.add(homeCategoriesViewState(apiHomeContent.data?.categories))
        return HomeContentViewState.Success(logo, itemViewStateList)
    }

    private fun homeCategoriesViewState(categories: List<ApiCategory>?): HomeCategoriesViewState {
        val homeCategoryList = mutableListOf<HomeCategory>()
        categories?.forEach { homeCategoryList.add(homeCategory(it)) }
        return HomeCategoriesViewState(homeCategoryList)
    }

    private fun homeCategory(it: ApiCategory): HomeCategory {
        return HomeCategory(
            getString(it.category_id),
            getString(it.category_image),
            getString(it.category_name)
        )
    }

    private fun homeFeaturedViewState(featured: List<ApiFeatured>?): HomeFeaturedViewState {
        val featuredProductList = mutableListOf<FeaturedProduct>()
        featured?.forEach { featuredProductList.add(featuredProduct(it)) }
        return HomeFeaturedViewState(featuredProductList)
    }

    private fun featuredProduct(apiFeatured: ApiFeatured): FeaturedProduct {
        return FeaturedProduct(
            getString(apiFeatured.prd_id),
            getString(apiFeatured.prd_name),
            getString(apiFeatured.prd_image),
            getString(apiFeatured.qty),
            getString(apiFeatured.unit),
            getString(apiFeatured.current_stock),
            getString(apiFeatured.price),
            getString(apiFeatured.currency),
            getString(apiFeatured.rating)
        )
    }

    private fun homeBannerViewState(bannerSlider: List<ApiBannerSlider>?): HomeBannerViewState {
        val bannerList = mutableListOf<BannerSlider>()
        bannerSlider?.forEach { bannerList.add(bannerSlider(it)) }
        return HomeBannerViewState(bannerList)
    }

    private fun bannerSlider(it: ApiBannerSlider): BannerSlider {
        return BannerSlider(
            getString(it.slider_id),
            getString(it.slider_name),
            getString(it.slider_image)
        )
    }

    private fun getString(value: String?): String {
        return value ?: ""
    }
}
