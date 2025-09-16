package com.example.thinking.base.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.thinking.base.AttachLifecycleOwner

abstract class ItemBindingViewHolder<M, VB : ViewBinding>(
    val binding: VB
) : ItemViewHolder<M>(binding.root)

abstract class ItemViewHolder<M>(
    itemView: View
) : LifecycleViewHolder(itemView), ItemBinding<M>

open class BindingViewHolder<VB : ViewBinding>(
    val binding: VB
) : LifecycleViewHolder(binding.root)

open class LifecycleViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView),
    AttachLifecycleOwner by AttachLifecycleOwner.Impl() {

    open val itemContext: Context get() = itemView.context
}

interface ItemBinding<M> {
    fun bind(item: M)

    fun unbind() {}
}
