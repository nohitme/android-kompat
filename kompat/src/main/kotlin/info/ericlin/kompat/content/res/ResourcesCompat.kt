package info.ericlin.kompat.content.res

import android.content.res.Resources
import android.support.annotation.ColorInt
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.res.ResourcesCompat

/**
 * Call through [ResourcesCompat.getDrawable]
 */
@Throws(Resources.NotFoundException::class)
fun Resources.getDrawableCompat(@DrawableRes id: Int, theme: Resources.Theme? = null) =
        ResourcesCompat.getDrawable(this, id, theme)

/**
 * Call through [ResourcesCompat.getDrawableForDensity]
 */
@Throws(Resources.NotFoundException::class)
fun Resources.getDrawableForDensityCompat(@DrawableRes id: Int,
                                          density: Int,
                                          theme: Resources.Theme? = null) =
        ResourcesCompat.getDrawableForDensity(this, id, density, theme)

/**
 * Call through [ResourcesCompat.getColor]
 */
@ColorInt
@Throws(Resources.NotFoundException::class)
fun Resources.getColorCompat(@ColorRes id: Int, theme: Resources.Theme? = null) =
        ResourcesCompat.getColor(this, id, theme)

/**
 * Call through [ResourcesCompat.getColorStateList]
 */
@Throws(Resources.NotFoundException::class)
fun Resources.getColorStateListCompat(@ColorRes id: Int, theme: Resources.Theme? = null) =
        ResourcesCompat.getColorStateList(this, id, theme)
