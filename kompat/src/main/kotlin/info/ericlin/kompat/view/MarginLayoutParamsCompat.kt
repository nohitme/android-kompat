package info.ericlin.kompat.view

import android.support.v4.view.MarginLayoutParamsCompat
import android.view.ViewGroup

var ViewGroup.MarginLayoutParams.marginStartCompat: Int
    get() = MarginLayoutParamsCompat.getMarginStart(this)
    set(value) = MarginLayoutParamsCompat.setMarginEnd(this, value)

var ViewGroup.MarginLayoutParams.marginEndCompat: Int
    get() = MarginLayoutParamsCompat.getMarginEnd(this)
    set(value) = MarginLayoutParamsCompat.setMarginEnd(this, value)

val ViewGroup.MarginLayoutParams.isMarginRelativeCompat: Boolean
    get() = MarginLayoutParamsCompat.isMarginRelative(this)

var ViewGroup.MarginLayoutParams.layoutDirectionCompat: Int
    get() = MarginLayoutParamsCompat.getLayoutDirection(this)
    set(value) = MarginLayoutParamsCompat.setLayoutDirection(this, value)

fun ViewGroup.MarginLayoutParams.resolveLayoutDirectionCompat(layoutDirection: Int) =
        MarginLayoutParamsCompat.resolveLayoutDirection(this, layoutDirection)