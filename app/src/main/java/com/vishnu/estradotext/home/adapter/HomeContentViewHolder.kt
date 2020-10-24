package com.vishnu.estradotext.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.vishnu.estradotext.home.viewstate.HomeItemViewState

abstract class HomeContentViewHolder(
    inflater: LayoutInflater,
    parent: ViewGroup,
    @LayoutRes layoutId: Int
) : RecyclerView.ViewHolder(inflater.inflate(layoutId, parent, false)) {

    abstract fun bind(itemViewState: HomeItemViewState)
}
