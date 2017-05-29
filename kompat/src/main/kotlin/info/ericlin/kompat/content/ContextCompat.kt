package info.ericlin.kompat.content

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat

/**
 * Call through [ContextCompat.startActivities]
 */
fun Context.startActivitiesCompat(intents: Array<Intent>, options: Bundle? = null) =
        ContextCompat.startActivities(this, intents, options)

/**
 * Call through [ContextCompat.startActivity]
 */
fun Context.startActivityCompat(intent: Intent, options: Bundle? = null) =
        ContextCompat.startActivity(this, intent, options)

/**
 * Call through [ContextCompat.getDataDir]
 */
val Context.dataDirCompat
    get() = ContextCompat.getDataDir(this)

/**
 * Call through [ContextCompat.getObbDirs]
 */
val Context.obbDirsCompat
    get() = ContextCompat.getObbDirs(this)

/**
 * Call through [ContextCompat.getExternalFilesDirs]
 */
fun Context.getExternalFilesDirsCompat(type: String) = ContextCompat.getExternalFilesDirs(this, type)

/**
 * Call through [ContextCompat.getExternalCacheDirs]
 */
val Context.externalCacheDirsCompat
    get() = ContextCompat.getExternalCacheDirs(this)

/**
 * Call through [ContextCompat.getDrawable]
 */
fun Context.getDrawableCompat(@DrawableRes id: Int) = ContextCompat.getDrawable(this, id)

/**
 * Call through [ContextCompat.getColorStateList]
 */
fun Context.getColorStateListCompat(@ColorRes id: Int) = ContextCompat.getColorStateList(this, id)

/**
 * Call through [ContextCompat.getColor]
 */
fun Context.getColorCompat(@ColorRes id: Int) = ContextCompat.getColor(this, id)

/**
 * Call through [ContextCompat.checkSelfPermission]
 */
fun Context.checkSelfPermissionCompat(permission: String) = ContextCompat.checkSelfPermission(this, permission)

/**
 * Call through [ContextCompat.getNoBackupFilesDir]
 */
val Context.noBackupFilesDirCompat
    get() = ContextCompat.getNoBackupFilesDir(this)

/**
 * Call through [ContextCompat.getCodeCacheDir]
 */
val Context.codeCacheDirCompat
    get() = ContextCompat.getCodeCacheDir(this)

/**
 * Call through [ContextCompat.createDeviceProtectedStorageContext]
 */
fun Context.createDeviceProtectedStorageContextCompat() = ContextCompat.createDeviceProtectedStorageContext(this)

/**
 * Call through [ContextCompat.isDeviceProtectedStorage]
 */
val Context.isDeviceProtectedStorageCompat
    get() = ContextCompat.isDeviceProtectedStorage(this)

