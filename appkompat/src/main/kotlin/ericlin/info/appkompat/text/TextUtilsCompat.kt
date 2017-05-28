package ericlin.info.appkompat.text

import android.support.v4.text.TextUtilsCompat
import java.util.*

/**
 * Call through [TextUtilsCompat.htmlEncode]
 */
fun String.htmlEncodeCompat() = TextUtilsCompat.htmlEncode(this)

/**
 * Call through [TextUtilsCompat.getLayoutDirectionFromLocale]
 */
val Locale?.layoutDirectionFromLocaleCompat get() = TextUtilsCompat.getLayoutDirectionFromLocale(this)