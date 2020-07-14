package com.sunday.groupie

import androidx.annotation.ColorInt
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_fancy.*

class FancyItem(@ColorInt private val color: Int,
               private val number: Int)
    :Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.item_fancy_cardView.setBackgroundColor(color)
        viewHolder.item_fancy_number.text = number.toString()
    }

    override fun getLayout() = R.layout.item_fancy

    override fun getSpanSize(spanCount: Int, position: Int) = spanCount / 3
}
