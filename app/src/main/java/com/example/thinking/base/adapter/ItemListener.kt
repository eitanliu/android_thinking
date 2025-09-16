package com.example.thinking.base.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView


typealias OnItemBindListener<VH> = RecyclerView.Adapter<VH>.(holder: VH, position: Int) -> Unit

typealias ItemClickListener = (view: View, position: Int) -> Unit