package ericlin.info.appkompat.content.os

import android.support.v4.os.EnvironmentCompat
import java.io.File

/**
 * Call through [EnvironmentCompat.getStorageState]
 */
val File.storageStateCompat get() = EnvironmentCompat.getStorageState(this)