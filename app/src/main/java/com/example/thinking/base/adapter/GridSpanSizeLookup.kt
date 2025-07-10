package com.example.thinking.base.adapter

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GridSpanSizeLookup(
    val manager: GridLayoutManager,
    val adapter: RecyclerView.Adapter<*>,
    val getItem: (position: Int) -> Any?
) : GridLayoutManager.SpanSizeLookup() {
    val defaultSizeLookup: GridLayoutManager.SpanSizeLookup? = manager.spanSizeLookup

    override fun getSpanSize(position: Int): Int {
        return if (position in 0..<adapter.itemCount) {
            val item = getItem(position)
            if (item is GridFullSpan && item.isFullSpan) {
                manager.spanCount
            } else if (item is GridSpanCount && item.spanCount > 0) {
                item.spanCount
            } else {
                defaultSizeLookup?.getSpanSize(position) ?: 1
            }
        } else manager.spanCount
    }
}