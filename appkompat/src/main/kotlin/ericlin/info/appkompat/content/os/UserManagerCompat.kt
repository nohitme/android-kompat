package ericlin.info.appkompat.content.os

import android.content.Context
import android.support.v4.os.UserManagerCompat

/**
 * Call through [UserManagerCompat.isUserUnlocked]
 */
fun Context.isUserUnlockedCompat() = UserManagerCompat.isUserUnlocked(this)