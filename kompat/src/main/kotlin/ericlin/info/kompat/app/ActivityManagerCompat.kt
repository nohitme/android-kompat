package ericlin.info.kompat.app

import android.app.ActivityManager
import android.support.v4.app.ActivityManagerCompat

/**
 * Call through [ActivityManagerCompat.isLowRamDevice]
 */
val ActivityManager.isLowRamDeviceCompat
    get() = ActivityManagerCompat.isLowRamDevice(this)