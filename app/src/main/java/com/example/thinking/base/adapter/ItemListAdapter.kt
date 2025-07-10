package com.example.thinking.base.adapter

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

abstract class ItemListAdapter<T, VH : ViewHolderBinding<*>>(
    diffCallback: DiffUtil.ItemCallback<T> = ItemsSameDiff()
) : ListAdapter<T, VH>(diffCallback) {

    private var itemClickListener: ItemClickListener? = null
    private var itemOnBindListener: ItemOnBindListener<VH>? = null

    open operator fun get(position: Int): T = getItem(position)

    open fun getItemOrNull(position: Int): T? =
        if (position < itemCount) getItem(position) else null

    public override fun getItem(position: Int): T {
        return super.getItem(position)
    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        if (item is MultiItemType) return item.itemType
        return super.getItemViewType(position)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onAttachedLifecycle()
        if (itemClickListener != null) {
            holder.binding.root.setOnClickListener { itemClickListener?.invoke(it, position) }
        }
        if (holder is ItemBinding<*>) {
            @Suppress("UNCHECKED_CAST")
            (holder as ItemBinding<T>).bind(getItem(position))
        }
        itemOnBindListener?.invoke(this, holder, position)
    }

    override fun onViewRecycled(holder: VH) {
        holder.onDetachedLifecycle()
        if (holder is ItemBinding<*>) {
            holder.unbind()
        }
    }

    override fun onViewAttachedToWindow(holder: VH) {
        super.onViewAttachedToWindow(holder)
        val lp = holder.itemView.layoutParams
        val position = holder.bindingAdapterPosition
        if (lp is StaggeredGridLayoutManager.LayoutParams) {
            if (position in 0..<itemCount) {
                val item = getItem(position)
                if (item is GridFullSpan && lp.isFullSpan != item.isFullSpan) {
                    lp.isFullSpan = item.isFullSpan
                }
            }
        }
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        val manager = recyclerView.layoutManager
        if (manager is GridLayoutManager) {
            val spanSizeLookup = manager.spanSizeLookup
            if (spanSizeLookup !is GridSpanSizeLookup) {
                manager.spanSizeLookup = GridSpanSizeLookup(manager, this, ::getItemOrNull)
            }
        }
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        val manager = recyclerView.layoutManager
        if (manager is GridLayoutManager) {
            val spanSizeLookup = manager.spanSizeLookup
            if (spanSizeLookup is GridSpanSizeLookup) {
                manager.spanSizeLookup = spanSizeLookup.defaultSizeLookup
            }
        }
    }

    fun setOnItemClickListener(listener: ((position: Int) -> Unit)?) = apply {
        itemClickListener = if (listener != null) { _, position ->
            listener.invoke(position)
        } else null
    }

    fun setOnItemClickListener(listener: ItemClickListener?) = apply {
        itemClickListener = listener
    }

    fun setOnItemBindListener(listener: ItemOnBindListener<VH>?) = apply {
        itemOnBindListener = listener
    }

}