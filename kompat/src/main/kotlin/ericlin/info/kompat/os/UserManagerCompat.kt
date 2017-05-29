package ericlin.info.kompat.os

import android.content.Context
import android.support.v4.os.UserManagerCompat

/**
 * Call through [UserManagerCompat.isUserUnlocked]
 */
val Context.isUserUnlockedCompat
    get() = UserManagerCompat.isUserUnlocked(this)