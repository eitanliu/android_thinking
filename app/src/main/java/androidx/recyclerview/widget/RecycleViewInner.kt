package androidx.recyclerview.widget

import android.view.View

fun View.getRecyclerViewHolder(): RecyclerView.ViewHolder? {
    return try {
        RecyclerView.getChildViewHolderInt(this)
    } catch (_: Throwable) {
        null
    }
}