package com.example.thinking.base.adapter

import androidx.recyclerview.widget.DiffUtil

open class AlwaysDiff<T> : DiffUtil.ItemCallback<T>() {
    companion object AnyType : AlwaysDiff<Any?>()

    override fun areItemsTheSame(oldItem: T & Any, newItem: T & Any): Boolean {
        return false
    }

    override fun areContentsTheSame(oldItem: T & Any, newItem: T & Any): Boolean {
        return false
    }
}
