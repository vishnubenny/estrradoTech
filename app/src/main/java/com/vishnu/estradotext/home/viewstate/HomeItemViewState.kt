package com.vishnu.estradotext.home.viewstate

interface HomeItemViewState {

    enum class Type {
        BANNER,
        FEATURED,
        CATEGORIES
    }

    fun type(): Type
}
