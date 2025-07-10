package com.example.thinking.base.adapter

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.thinking.base.AttachLifecycleOwner

abstract class ItemViewHolder<VB : ViewBinding, M>(
    binding: VB
) : ViewHolderBinding<VB>(binding), ItemBinding<M>

open class ViewHolderBinding<VB : ViewBinding>(
    val binding: VB
) : RecyclerView.ViewHolder(binding.root),
    AttachLifecycleOwner by AttachLifecycleOwner.Impl() {
}


interface ItemBinding<M> {
    fun bind(item: M)

    fun unbind() {}
}
