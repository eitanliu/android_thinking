package com.example.thinking.base.adapter

import androidx.recyclerview.widget.DiffUtil

open class ItemsSameDiff<T>(
    private var areContentsTheSame: ((oldItem: T & Any, newItem: T & Any) -> Boolean)? = null
) : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T & Any, newItem: T & Any): Boolean {
        if (newItem is ItemsSameEquals) {
            return newItem.equalsItemSame(oldItem)
        }
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: T & Any, newItem: T & Any): Boolean {
        val diffContexts = areContentsTheSame
        if (diffContexts != null) {
            return diffContexts(oldItem, newItem)
        } else if (newItem is ItemsSameEquals) {
            return newItem.equalsContentSame(oldItem)
        }
        return oldItem == newItem
    }
}