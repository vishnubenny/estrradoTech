package com.vishnu.estradotext.home.viewstate

sealed class HomeContentViewState {

    object Loading : HomeContentViewState()

    data class Success(
        val toolbarLogo: String,
        val itemViewStateList: List<HomeItemViewState>
    ) : HomeContentViewState()

    object Error : HomeContentViewState()
}
