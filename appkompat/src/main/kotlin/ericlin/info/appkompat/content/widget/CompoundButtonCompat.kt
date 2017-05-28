package ericlin.info.appkompat.content.widget

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.support.v4.widget.CompoundButtonCompat
import android.widget.CompoundButton

/**
 * Call through [CompoundButtonCompat.getButtonTintList] and [CompoundButtonCompat.setButtonTintList]
 */
var CompoundButton.buttonTintListCompat: ColorStateList?
    get() = CompoundButtonCompat.getButtonTintList(this)
    set(value) = CompoundButtonCompat.setButtonTintList(this, value)

/**
 * Call through [CompoundButtonCompat.getButtonTintMode] and [CompoundButtonCompat.setButtonTintMode]
 */
var CompoundButton.buttonTintModeCompat: PorterDuff.Mode?
    get() = CompoundButtonCompat.getButtonTintMode(this)
    set(value) = CompoundButtonCompat.setButtonTintMode(this, value)

/**
 * Call through [CompoundButtonCompat.getButtonDrawable] and [CompoundButton.setButtonDrawable]
 */
var CompoundButton.buttonDrawableCompat: Drawable?
    get() = CompoundButtonCompat.getButtonDrawable(this)
    set(value) {
        this.buttonDrawable = value
    }


