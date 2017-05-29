package ericlin.info.kompat.app

import android.app.Activity
import android.content.Intent
import android.content.IntentSender
import android.os.Bundle
import android.support.annotation.IntRange
import android.support.v4.app.ActivityCompat
import android.support.v4.app.SharedElementCallback

/**
 * Call through [ActivityCompat.invalidateOptionsMenu]
 */
fun Activity.invalidateOptionsMenuCompat() = ActivityCompat.invalidateOptionsMenu(this)

/**
 * Call through [ActivityCompat.startActivityForResult]
 */
fun Activity.startActivityForResultCompat(intent: Intent, requestCode: Int, options: Bundle? = null) =
        ActivityCompat.startActivityForResult(this, intent, requestCode, options)

/**
 * Call through [ActivityCompat.startIntentSenderForResult]
 */
@Throws(IntentSender.SendIntentException::class)
fun Activity.startIntentSenderForResultCompat(intent: IntentSender,
                                              requestCode: Int,
                                              fillInIntent: Intent,
                                              flagMask: Int,
                                              flagValues: Int,
                                              extraFlags: Int,
                                              options: Bundle? = null) =
        ActivityCompat.startIntentSenderForResult(this, intent, requestCode, fillInIntent, flagMask, flagValues, extraFlags, options)

/**
 * Call through [ActivityCompat.finishAffinity]
 */
fun Activity.finishAffinityCompat() = ActivityCompat.finishAffinity(this)

/**
 * Call through [ActivityCompat.finishAfterTransition]
 */
fun Activity.finishAfterTransitionCompat() = ActivityCompat.finishAfterTransition(this)

/**
 * Call through [ActivityCompat.getReferrer]
 */
val Activity.referrerCompat
    get() = ActivityCompat.getReferrer(this)

/**
 * Call through [ActivityCompat.setEnterSharedElementCallback]
 */
fun Activity.setEnterSharedElementCallbackCompat(sharedElementCallback: SharedElementCallback? = null) =
        ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback)

/**
 * Call through [ActivityCompat.setExitSharedElementCallback]
 */
fun Activity.setExitSharedElementCallbackCompat(sharedElementCallback: SharedElementCallback? = null) =
        ActivityCompat.setExitSharedElementCallback(this, sharedElementCallback)

/**
 * Call through [ActivityCompat.postponeEnterTransition]
 */
fun Activity.postponeEnterTransitionCompat() = ActivityCompat.postponeEnterTransition(this)

/**
 * Call through [ActivityCompat.requestPermissions]
 */
fun Activity.requestPermissionsCompat(permissions: Array<String>,
                                      @IntRange(from = 0) requestCode: Int) =
        ActivityCompat.requestPermissions(this, permissions, requestCode)

/**
 * Call through [ActivityCompat.shouldShowRequestPermissionRationale]
 */
fun Activity.shouldShowRequestPermissionRationaleCompat(permission: String) =
        ActivityCompat.shouldShowRequestPermissionRationale(this, permission)
