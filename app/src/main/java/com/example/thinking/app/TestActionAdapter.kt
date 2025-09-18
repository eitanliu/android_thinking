package com.example.thinking.app

import android.view.ViewGroup
import com.example.thinking.base.adapter.ItemBindingViewHolder
import com.example.thinking.base.adapter.ItemListAdapter
import com.example.thinking.databinding.SimpleListItemBinding
import com.example.thinking.util.inflater

class TestActionAdapter : ItemListAdapter<TestActionData, TestActionAdapter.Holder>() {

    class Holder(
        parent: ViewGroup
    ) : ItemBindingViewHolder<TestActionData, SimpleListItemBinding>(
        SimpleListItemBinding.inflate(parent.inflater, parent, false)
    ) {
        override fun bind(item: TestActionData) {
            binding.title.text = item.name
            itemView.setOnClickListener {
                item.action()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(parent)
    }
}