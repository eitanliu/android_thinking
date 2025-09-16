package com.example.thinking.app

import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.thinking.R
import com.example.thinking.base.adapter.ItemListAdapter
import com.example.thinking.base.adapter.ItemBindingViewHolder
import com.example.thinking.databinding.ActivityTestBinding
import com.example.thinking.databinding.SimpleListItemBinding
import com.example.thinking.util.Logcat
import com.example.thinking.util.inflater
import com.example.thinking.util.rootWindowInsetsCompat
import com.example.thinking.util.startActivity
import com.example.thinking.util.statusBarHeight
import kotlin.math.max

class TestActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityTestBinding.inflate(layoutInflater)
    }

    val windowInsetsController by lazy {
        WindowInsetsControllerCompat(window, window.decorView)
    }

    val rootWindowInsetsCompat get() = binding.root.rootWindowInsetsCompat

    val actionList by lazy {
        listOf(
            ActionData("DisplayActivity") {
                startActivity<DisplayActivity>()
            },
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            val statusBarHeight = application.resources.statusBarHeight
            Logcat.msg("statusBarHeight: $statusBarHeight, ${systemBars.top}")
            val left = systemBars.left
            val right = systemBars.right
            val top = max(statusBarHeight, systemBars.top)
            val bottom = systemBars.bottom
            v.setPadding(left, top, right, bottom)
            insets
        }
        binding.btnStatusBar.setOnClickListener {
            val windowInsetsCompat = rootWindowInsetsCompat
            if (windowInsetsCompat != null) {
                if (windowInsetsCompat.isVisible(WindowInsetsCompat.Type.statusBars())) {
                    windowInsetsController.hide(WindowInsetsCompat.Type.statusBars())
                } else {
                    windowInsetsController.show(WindowInsetsCompat.Type.statusBars())
                }
            } else {
                windowInsetsController.hide(WindowInsetsCompat.Type.statusBars())
            }
        }
        binding.list.adapter = Adapter().apply {
            submitList(actionList)
        }
    }

    class ActionData(val name: String, val action: () -> Unit)

    class Adapter : ItemListAdapter<ActionData, Adapter.Holder>() {

        class Holder(
            parent: ViewGroup
        ) : ItemBindingViewHolder<ActionData, SimpleListItemBinding>(
            SimpleListItemBinding.inflate(parent.inflater, parent, false)
        ) {
            override fun bind(item: ActionData) {
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
}