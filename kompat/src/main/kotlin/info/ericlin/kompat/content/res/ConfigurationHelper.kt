package info.ericlin.kompat.content.res

import android.content.res.Resources
import android.support.v4.content.res.ConfigurationHelper

/**
 * Call through [ConfigurationHelper.getScreenHeightDp]
 */
val Resources.screenHeightDpCompat
    get() = ConfigurationHelper.getScreenHeightDp(this)

/**
 * Call through [ConfigurationHelper.getScreenWidthDp]
 */
val Resources.screenWidthDpCompat
    get() = ConfigurationHelper.getScreenWidthDp(this)

/**
 * Call through [ConfigurationHelper.getSmallestScreenWidthDp]
 */
val Resources.smallestScreenWidthDpCompat
    get() = ConfigurationHelper.getSmallestScreenWidthDp(this)

/**
 * Call through [ConfigurationHelper.getDensityDpi]
 */
val Resources.densityDpiCompat
    get() = ConfigurationHelper.getDensityDpi(this)