package com.example.thinking.base.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.thinking.base.AttachLifecycleOwner

abstract class ModelBindingViewHolder<M, VB : ViewBinding>(
    val binding: VB
) : ModelViewHolder<M>(binding.root)

open class BindingViewHolder<VB : ViewBinding>(
    val binding: VB
) : ItemViewHolder(binding.root)

abstract class ModelViewHolder<M>(
    itemView: View
) : ItemViewHolder(itemView), ItemModelBinding<M>

open class ItemViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView),
    AttachLifecycleOwner by AttachLifecycleOwner.Impl()


interface ItemModelBinding<M> {
    fun bind(item: M)

    fun unbind() {}
}
