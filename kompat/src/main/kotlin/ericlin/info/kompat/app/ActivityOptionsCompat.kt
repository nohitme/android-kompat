package ericlin.info.kompat.app

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.util.Pair
import android.view.View

/**
 * Call through [ActivityOptionsCompat.makeCustomAnimation]
 */
fun Context.makeCustomAnimationCompat(enterResId: Int = 0, exitRestId: Int = 0) =
        ActivityOptionsCompat.makeCustomAnimation(this, enterResId, exitRestId)

/**
 * Call through [ActivityOptionsCompat.makeScaleUpAnimation]
 */
fun View.makeScaleUpAnimationCompat(startX: Int, startY: Int, startWidth: Int, startHeight: Int) =
        ActivityOptionsCompat.makeScaleUpAnimation(this, startX, startY, startWidth, startHeight)

/**
 * Call through [ActivityOptionsCompat.makeClipRevealAnimation]
 */
fun View.makeClipRevealAnimationCompat(startX: Int, startY: Int, width: Int, height: Int) =
        ActivityOptionsCompat.makeClipRevealAnimation(this, startX, startY, width, height)

/**
 * Call through [ActivityOptionsCompat.makeThumbnailScaleUpAnimation]
 */
fun View.makeThumbnailScaleUpAnimationCompat(thumbnail: Bitmap, startX: Int, startY: Int) =
        ActivityOptionsCompat.makeThumbnailScaleUpAnimation(this, thumbnail, startX, startY)

/**
 * Call through [ActivityOptionsCompat.makeSceneTransitionAnimation]
 */
fun Activity.makeSceneTransitionAnimationCompat(sharedElement: View, sharedElementName: String) =
        ActivityOptionsCompat.makeSceneTransitionAnimation(this, sharedElement, sharedElementName)

/**
 * Call through [ActivityOptionsCompat.makeSceneTransitionAnimation]
 */
fun Activity.makeSceneTransitionAnimationCompat(vararg sharedElements: Pair<View, String>) =
        ActivityOptionsCompat.makeSceneTransitionAnimation(this, *sharedElements)
