package com.vishnu.estradotext.home

import android.os.Bundle
import com.vishnu.core.base.BaseActivity
import com.vishnu.estradotext.BR
import com.vishnu.estradotext.R
import com.vishnu.estradotext.databinding.ActivityHomeBinding
import org.koin.android.viewmodel.ext.android.viewModel

class HomeActivity : BaseActivity<HomeViewModel, ActivityHomeBinding, HomeNavigator>() {

    private val homeViewModel: HomeViewModel by viewModel()

    private val listener = object : HomeNavigator {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeViewModel.getHomeContent()
    }

    override fun getLayoutResId(): Int = R.layout.activity_home

    override fun getNavigator(): HomeNavigator = listener

    override fun getViewModel(): HomeViewModel = homeViewModel

    override fun getBindingVariable(): Int = BR.viewModel
}
