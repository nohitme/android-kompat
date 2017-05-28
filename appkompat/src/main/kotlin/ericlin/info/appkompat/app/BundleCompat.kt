package ericlin.info.appkompat.app

import android.os.Bundle
import android.os.IBinder
import android.support.v4.app.BundleCompat


/**
 * Call through [BundleCompat.getBinder]
 */
fun Bundle.getBinderCompat(key: String) = BundleCompat.getBinder(this, key)

/**
 * Call through [BundleCompat.putBinder]
 */
fun Bundle.putBinderCompat(key: String, iBinder: IBinder) = BundleCompat.putBinder(this, key, iBinder)

