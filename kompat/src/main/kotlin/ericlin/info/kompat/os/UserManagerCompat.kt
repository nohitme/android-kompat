package ericlin.info.kompat.os

import android.content.Context
import android.support.v4.os.UserManagerCompat

/**
 * Call through [UserManagerCompat.isUserUnlocked]
 */
fun Context.isUserUnlockedCompat() = UserManagerCompat.isUserUnlocked(this)