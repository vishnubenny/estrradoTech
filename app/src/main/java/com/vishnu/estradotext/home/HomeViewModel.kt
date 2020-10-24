package com.vishnu.estradotext.home

import androidx.lifecycle.MutableLiveData
import com.vishnu.core.base.BaseViewModel
import com.vishnu.estradotext.home.adapter.HomeContentAdapter
import com.vishnu.estradotext.home.viewstate.HomeContentViewState
import com.vishnu.estradotext.home.viewstate.HomeItemViewState
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: HomeRepository,
    val adapter: HomeContentAdapter
) : BaseViewModel<HomeNavigator>() {

    val loading: MutableLiveData<Boolean> = MutableLiveData(false)
    val itemViewStateList = MutableLiveData<List<HomeItemViewState>>(emptyList())

    fun getHomeContent() {
        viewModelScope().launch {
            repository.getHomeContent()
                .collect {
                    loading.postValue(it is HomeContentViewState.Loading)
                    if (it is HomeContentViewState.Success) {
                        itemViewStateList.postValue(it.itemViewStateList)
                    }
                }
        }
    }
}
