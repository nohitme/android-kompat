package ericlin.info.kompat.graphics

import android.graphics.Bitmap
import android.support.v4.graphics.BitmapCompat

/**
 * Call through [BitmapCompat.hasMipMap] and [BitmapCompat.setHasMipMap]
 */
var Bitmap.hasMipMapCompat: Boolean
    get() = BitmapCompat.hasMipMap(this)
    set(value) = BitmapCompat.setHasMipMap(this, value)

/**
 * Call through [BitmapCompat.getAllocationByteCount]
 */
val Bitmap.allocationByteCountCompat
    get() = BitmapCompat.getAllocationByteCount(this)
