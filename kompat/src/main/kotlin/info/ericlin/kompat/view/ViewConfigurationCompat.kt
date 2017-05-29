package info.ericlin.kompat.view

import android.support.v4.view.ViewConfigurationCompat
import android.view.ViewConfiguration

/**
 * Call through [ViewConfigurationCompat.hasPermanentMenuKey]
 */
fun ViewConfiguration.hasPermanentMenuKeyCompat() = ViewConfigurationCompat.hasPermanentMenuKey(this)