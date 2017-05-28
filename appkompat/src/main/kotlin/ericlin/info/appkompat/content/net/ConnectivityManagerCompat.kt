package ericlin.info.appkompat.content.net

import android.content.Intent
import android.net.ConnectivityManager
import android.support.v4.net.ConnectivityManagerCompat

/**
 * Call through [ConnectivityManagerCompat.isActiveNetworkMetered]
 */
fun ConnectivityManager.isActiveNetworkMeteredCompat() = ConnectivityManagerCompat.isActiveNetworkMetered(this)

/**
 * Call through [ConnectivityManagerCompat.getNetworkInfoFromBroadcast]
 */
fun ConnectivityManager.getNetworkInfoFromBroadcastCompat(intent: Intent) = ConnectivityManagerCompat.getNetworkInfoFromBroadcast(this, intent)

/**
 * Call through [ConnectivityManagerCompat.getRestrictBackgroundStatus]
 */
@ConnectivityManagerCompat.RestrictBackgroundStatus
fun ConnectivityManager.restrictBackgroundStatusCompat() = ConnectivityManagerCompat.getRestrictBackgroundStatus(this)