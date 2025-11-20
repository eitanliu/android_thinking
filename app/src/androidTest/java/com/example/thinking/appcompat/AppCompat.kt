package com.example.thinking.appcompat

/**
 * [androidx.appcompat.app.AppCompatDelegateImpl.setContentView]
 * [androidx.appcompat.app.AppCompatDelegateImpl.ensureSubDecor]
 * [androidx.appcompat.app.AppCompatDelegateImpl.createSubDecor]
 *
 * NoTitle
 *
 * - Overlay [androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode]
 *   [androidx.appcompat.widget.FitWindowsFrameLayout]
 *   -> [androidx.appcompat.R.layout.abc_screen_content_include]
 *   -> [androidx.appcompat.R.layout.abc_action_mode_bar]
 * - Simple [androidx.appcompat.R.layout.abc_screen_simple]
 *   -> [androidx.appcompat.R.layout.abc_action_mode_bar]
 *   -> [androidx.appcompat.R.layout.abc_screen_content_include]
 *
 * Title
 *
 * - Floating [androidx.appcompat.R.layout.abc_dialog_title_material]
 *   [androidx.appcompat.widget.FitWindowsFrameLayout]
 *   -> [android.widget.TextView]
 *   -> [androidx.appcompat.R.layout.abc_screen_content_include]
 * - ActionBar [androidx.appcompat.R.layout.abc_screen_toolbar]
 *   [androidx.appcompat.widget.ActionBarOverlayLayout]
 *   -> [androidx.appcompat.R.layout.abc_screen_content_include]
 *   -> [androidx.appcompat.widget.ActionBarContainer]
 *   ->   [androidx.appcompat.widget.Toolbar]
 *   ->   [androidx.appcompat.widget.ActionBarContextView]
 *
 * Final Content Layout
 *
 * layout [androidx.appcompat.R.layout.abc_screen_content_include]
 * type   [androidx.appcompat.widget.ContentFrameLayout]
 */
fun setContentView() {
    com.example.thinking.R.style.AppTheme
}

