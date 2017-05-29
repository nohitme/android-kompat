package ericlin.info.kompat.widget

import android.graphics.drawable.Drawable
import android.support.annotation.DrawableRes
import android.support.annotation.StyleRes
import android.support.v4.widget.TextViewCompat
import android.widget.TextView

/**
 * Call through [TextViewCompat.setCompoundDrawablesRelative]
 */
fun TextView.setCompoundDrawablesRelativeCompat(start: Drawable? = null,
                                                top: Drawable? = null,
                                                end: Drawable? = null,
                                                bottom: Drawable? = null) =
        TextViewCompat.setCompoundDrawablesRelative(this, start, top, end, bottom)

/**
 * Call through [TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds]
 */
fun TextView.setCompoundDrawablesRelativeWithIntrinsicBoundsCompat(start: Drawable? = null,
                                                                   top: Drawable? = null,
                                                                   end: Drawable? = null,
                                                                   bottom: Drawable? = null) =
        TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds(this, start, top, end, bottom)

/**
 * Call through [TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds]
 */
fun TextView.setCompoundDrawablesRelativeWithIntrinsicBoundsCompat(@DrawableRes start: Int = 0,
                                                                   @DrawableRes top: Int = 0,
                                                                   @DrawableRes end: Int = 0,
                                                                   @DrawableRes bottom: Int = 0) =
        TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds(this, start, top, end, bottom)

/**
 * Call through [TextViewCompat.getMaxLines] and [TextView.setMaxLines]
 */
var TextView.maxLinesCompat: Int
    get() = TextViewCompat.getMaxLines(this)
    set(value) {
        this.maxLines = value
    }

/**
 * Call through [TextViewCompat.getMinLines] and [TextView.setMinLines]
 */
var TextView.minLinesCompat: Int
    get() = TextViewCompat.getMinLines(this)
    set(value) {
        this.minLines = value
    }

/**
 * Call through [TextViewCompat.setTextAppearance]
 */
fun TextView.setTextAppearanceCompat(@StyleRes resId: Int) = TextViewCompat.setTextAppearance(this, resId)

/**
 * Call through [TextViewCompat.getCompoundDrawablesRelative]
 */
val TextView.compoundDrawablesRelativeCompat
    get() = TextViewCompat.getCompoundDrawablesRelative(this)
