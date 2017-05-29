package ericlin.info.kompat.app

import android.app.Service
import android.support.v4.app.ServiceCompat

/**
 * Call through [ServiceCompat.stopForeground]
 */
fun Service.stopForegroundCompat(@ServiceCompat.StopForegroundFlags flags: Int) =
        ServiceCompat.stopForeground(this, flags)