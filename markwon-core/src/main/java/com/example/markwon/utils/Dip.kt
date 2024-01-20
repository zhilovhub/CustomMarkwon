package com.example.markwon.utils

import android.content.Context

internal class Dip(density: Float) {

    private var density: Float

    init {
        this.density = density
    }

    internal fun toPx(dp: Float): Int {
        return (dp * density + 5f).toInt()
    }

    companion object {
        internal fun create(context: Context): Dip {
            return Dip(context.resources.displayMetrics.density)
        }

        internal fun create(density: Float): Dip {
            return Dip(density)
        }
    }

}