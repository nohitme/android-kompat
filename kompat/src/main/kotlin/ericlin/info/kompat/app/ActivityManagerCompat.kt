package ericlin.info.kompat.app

import android.app.ActivityManager
import android.support.v4.app.ActivityManagerCompat

/**
 * Call through [ActivityManagerCompat.isLowRamDevice]
 */
fun ActivityManager.isLowRamDeviceCompat() = ActivityManagerCompat.isLowRamDevice(this)