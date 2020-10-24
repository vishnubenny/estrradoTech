package com.vishnu.estradotext.common.ui

import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.vishnu.estradotext.home.adapter.HomeContentAdapter
import com.vishnu.estradotext.home.viewstate.HomeItemViewState

object BindingHelper {

    @BindingAdapter("isVisible")
    @JvmStatic
    fun isVisible(view: View, isVisible: Boolean) {
        view.visibility = when {
            isVisible -> VISIBLE
            else -> GONE
        }
    }

    @BindingAdapter("updateList")
    @JvmStatic
    fun updateList(recyclerView: RecyclerView, itemViewStateList: List<HomeItemViewState>) {
        (recyclerView.adapter as HomeContentAdapter?)?.updateList(itemViewStateList)
    }
}
