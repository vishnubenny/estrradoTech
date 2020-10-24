package com.vishnu.estradotext.home.adapter

import com.bumptech.glide.Glide
import com.vishnu.estradotext.home.viewstate.BannerSlider
import ss.com.bannerslider.adapters.SliderAdapter
import ss.com.bannerslider.viewholder.ImageSlideViewHolder

class BannerSliderAdapter(private val list: List<BannerSlider>) : SliderAdapter() {

    override fun getItemCount(): Int {
        return list.size
    }


    override fun onBindImageSlide(position: Int, imageSlideViewHolder: ImageSlideViewHolder?) {
        imageSlideViewHolder?.imageView?.let { imageView ->
            Glide.with(imageView.context)
                .load(list[position].slider_image)
                .into(imageView)
        }
    }
}
