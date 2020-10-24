package com.vishnu.core.home.api

data class ApiHomeContent(
    val data: ApiData?,
    val httpcode: Int?,
    val message: String?,
    val status: String?
)

data class ApiData(
    val banner_slider: List<ApiBannerSlider>?,
    val cartcount: Int?,
    val categories: List<ApiCategory>?,
    val featured: List<ApiFeatured>?,
    val logo: String?,
    val profiledata: ApiProfiledata?,
    val regions: List<ApiRegion>?
)

data class ApiBannerSlider(
    val slider_id: String?,
    val slider_image: String?,
    val slider_name: String?
)

data class ApiCategory(
    val category_id: String?,
    val category_image: String?,
    val category_name: String?
)

data class ApiFeatured(
    val currency: String?,
    val current_stock: String?,
    val prd_id: String?,
    val prd_image: String?,
    val prd_name: String?,
    val price: String?,
    val qty: String?,
    val rating: String?,
    val unit: String?
)

data class ApiProfiledata(
    val address1: String?,
    val address2: String?,
    val district: String?,
    val email: String?,
    val image: String?,
    val mobile: String?,
    val name: String?,
    val post: String?,
    val state: String?
)

data class ApiRegion(
    val country_code: String?,
    val country_id: String?,
    val country_name: String?
)
