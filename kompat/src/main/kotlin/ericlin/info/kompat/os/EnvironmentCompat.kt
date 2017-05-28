package ericlin.info.kompat.os

import android.support.v4.os.EnvironmentCompat
import java.io.File

/**
 * Call through [EnvironmentCompat.getStorageState]
 */
val File.storageStateCompat get() = EnvironmentCompat.getStorageState(this)