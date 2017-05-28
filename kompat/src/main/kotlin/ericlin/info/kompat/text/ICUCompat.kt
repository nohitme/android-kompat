package ericlin.info.kompat.text

import android.support.v4.text.ICUCompat
import java.util.*

/**
 * Call through [ICUCompat.maximizeAndGetScript]
 */
fun Locale.maximizeAndGetScriptCompat() = ICUCompat.maximizeAndGetScript(this)