package ericlin.info.kompat.app

import android.content.Context
import android.support.v4.app.NotificationManagerCompat

/**
 * Call through [NotificationManagerCompat.getEnabledListenerPackages]
 */
val Context.enabledListenerPackages
    get() = NotificationManagerCompat.getEnabledListenerPackages(this)