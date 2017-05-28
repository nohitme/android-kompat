package ericlin.info.appkompat.content.view

import android.support.v4.view.ViewConfigurationCompat
import android.view.ViewConfiguration

/**
 * Call through [ViewConfigurationCompat.hasPermanentMenuKey]
 */
val ViewConfiguration.hasPermanentMenuKeyCompat get() = ViewConfigurationCompat.hasPermanentMenuKey(this)