package info.ericlin.kompat.view

import android.content.res.ColorStateList
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.annotation.FloatRange
import android.support.annotation.IdRes
import android.support.v4.view.*
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityEvent

/**
 * Call through [ViewCompat.canScrollHorizontally]
 */
fun View.canScrollHorizontallyCompat(direction: Int) = ViewCompat.canScrollHorizontally(this, direction)

/**
 * Call through [ViewCompat.canScrollVertically]
 */
fun View.canScrollVerticallyCompat(direction: Int) = ViewCompat.canScrollVertically(this, direction)

/**
 * Call through [ViewCompat.onPopulateAccessibilityEvent]
 */
fun View.onPopulateAccessibilityEventCompat(event: AccessibilityEvent) =
        ViewCompat.onPopulateAccessibilityEvent(this, event)

/**
 * Call through [ViewCompat.onInitializeAccessibilityEvent]
 */
fun View.onInitializeAccessibilityEventCompat(event: AccessibilityEvent) =
        ViewCompat.onInitializeAccessibilityEvent(this, event)

/**
 * Call through [ViewCompat.onInitializeAccessibilityNodeInfo]
 */
fun View.onInitializeAccessibilityNodeInfoCompat(info: AccessibilityNodeInfoCompat) =
        ViewCompat.onInitializeAccessibilityNodeInfo(this, info)

/**
 * Call through [ViewCompat.setAccessibilityDelegate]
 */
fun View.setAccessibilityDelegateCompat(delegate: AccessibilityDelegateCompat?) =
        ViewCompat.setAccessibilityDelegate(this, delegate)

/**
 * Call through [ViewCompat.hasAccessibilityDelegate]
 */
val View.hasAccessibilityDelegateCompat
    get() = ViewCompat.hasAccessibilityDelegate(this)

/**
 * Call through [ViewCompat.hasTransientState]
 */
var View.hasTransientStateCompat: Boolean
    get() = ViewCompat.hasTransientState(this)
    set(value) = ViewCompat.setHasTransientState(this, value)

/**
 * Call through [ViewCompat.postInvalidateOnAnimation]
 */
fun View.postInvalidateOnAnimationCompat() = ViewCompat.postInvalidateOnAnimation(this)

/**
 * Call through [ViewCompat.postInvalidateOnAnimation]
 */
fun View.postInvalidateOnAnimationCompat(left: Int, top: Int, right: Int, bottom: Int) =
        ViewCompat.postInvalidateOnAnimation(this, left, top, right, bottom)

/**
 * Call through [ViewCompat.postOnAnimation]
 */
fun View.postOnAnimationCompat(action: Runnable) = ViewCompat.postOnAnimation(this, action)

/**
 * Call through [ViewCompat.postOnAnimationDelayed]
 */
fun View.postOnAnimationDelayedCompat(action: Runnable, delayMillis: Long) =
        ViewCompat.postOnAnimationDelayed(this, action, delayMillis)

/**
 * Call through [ViewCompat.getImportantForAccessibility] and [ViewCompat.setImportantForAccessibility]
 */
var View.importantForAccessibilityCompat: Int
    get() = ViewCompat.getImportantForAccessibility(this)
    set(value) = ViewCompat.setImportantForAccessibility(this, value)

/**
 * Call through [ViewCompat.isImportantForAccessibility]
 */
val View.isImportantForAccessibilityCompat
    get() = ViewCompat.isImportantForAccessibility(this)

/**
 * Call through [ViewCompat.performAccessibilityAction]
 */
fun View.performAccessibilityActionCompat(action: Int, arguments: Bundle) =
        ViewCompat.performAccessibilityAction(this, action, arguments)

/**
 * Call through [ViewCompat.getAccessibilityNodeProvider]
 */
val View.accessibilityNodeProviderCompat
    get() = ViewCompat.getAccessibilityNodeProvider(this)

/**
 * Call through [ViewCompat.getAlpha] and [ViewCompat.setAlpha]
 */
var View.alphaCompat: Float
    get() = ViewCompat.getAlpha(this)
    @FloatRange(from = 0.0, to = 1.0)
    set(value) = ViewCompat.setAlpha(this, value)

/**
 * Call through [ViewCompat.getLayerType]
 */
val View.layerTypeCompat
    get() = ViewCompat.getLayerType(this)

/**
 * Call through [ViewCompat.setLayerType]
 */
fun View.setLayerTypeCompat(layerType: Int, paint: Paint) = ViewCompat.setLayerType(this, layerType, paint)

/**
 * Call through [ViewCompat.getLabelFor] and [ViewCompat.setLabelFor]
 */
var View.labelForCompat: Int
    get() = ViewCompat.getLabelFor(this)
    @IdRes
    set(value) = ViewCompat.setLabelFor(this, value)

/**
 * Call through [ViewCompat.setLayerPaint]
 */
fun View.setLayerPaintCompat(paint: Paint) = ViewCompat.setLayerPaint(this, paint)

/**
 * Call through [ViewCompat.getLayoutDirection] and [ViewCompat.setLayoutDirection]
 */
var View.layoutDirectionCompat: Int
    get() = ViewCompat.getLayoutDirection(this)
    set(value) = ViewCompat.setLayoutDirection(this, value)

/**
 * Call through [ViewCompat.getParentForAccessibility]
 */
val View.parentForAccessibilityCompat
    get() = ViewCompat.getParentForAccessibility(this)

/**
 * Call through [ViewCompat.getMeasuredHeightAndState]
 */
val View.measuredHeightAndStateCompat
    get() = ViewCompat.getMeasuredHeightAndState(this)

/**
 * Call through [ViewCompat.getMeasuredState]
 */
val View.measuredStateCompat
    get() = ViewCompat.getMeasuredState(this)

/**
 * Call through [ViewCompat.getAccessibilityLiveRegion]
 */
var View.accessibilityLiveRegionCompat: Int
    get() = ViewCompat.getAccessibilityLiveRegion(this)
    set(value) = ViewCompat.setAccessibilityLiveRegion(this, value)

/**
 * Call through [ViewCompat.getPaddingStart]
 */
val View.paddingStartCompat
    get() = ViewCompat.getPaddingStart(this)

/**
 * Call through [ViewCompat.getPaddingEnd]
 */
val View.paddingEndCompat
    get() = ViewCompat.getPaddingEnd(this)

/**
 * Call through [ViewCompat.setPaddingRelative]
 */
fun View.setPaddingRelativeCompat(start: Int, top: Int, end: Int, bottom: Int) =
        ViewCompat.setPaddingRelative(this, start, top, end, bottom)

/**
 * Call through [ViewCompat.dispatchStartTemporaryDetach]
 */
fun View.dispatchStartTemporaryDetachCompat() = ViewCompat.dispatchStartTemporaryDetach(this)

/**
 * Call through [ViewCompat.dispatchFinishTemporaryDetach]
 */
fun View.dispatchFinishTemporaryDetachCompat() = ViewCompat.dispatchFinishTemporaryDetach(this)

/**
 * Call through [ViewCompat.getTranslationX] and [ViewCompat.setTranslationX]
 */
var View.translationXCompat: Float
    get() = ViewCompat.getTranslationX(this)
    set(value) = ViewCompat.setTranslationX(this, value)

/**
 * Call through [ViewCompat.getTranslationY] and [ViewCompat.setTranslationY]
 */
var View.translationYCompat: Float
    get() = ViewCompat.getTranslationY(this)
    set(value) = ViewCompat.setTranslationY(this, value)

/**
 * Call through [ViewCompat.getTranslationZ] and [ViewCompat.setTranslationZ]
 */
var View.translationZCompat: Float
    get() = ViewCompat.getTranslationZ(this)
    set(value) = ViewCompat.setTranslationZ(this, value)

/**
 * Call through [ViewCompat.getMatrix]
 */
val View.matrixCompat
    get() = ViewCompat.getMatrix(this)

/**
 * Call through [ViewCompat.getMinimumHeight]
 */
val View.minimumHeightCompat
    get() = ViewCompat.getMinimumHeight(this)

/**
 * Call through [ViewCompat.getMinimumWidth]
 */
val View.minimumWidthCompat
    get() = ViewCompat.getMinimumWidth(this)

/**
 * Call through [ViewCompat.animate]
 */
fun View.animateCompat() = ViewCompat.animate(this)

/**
 * Call through [ViewCompat.getX] and [ViewCompat.setX]
 */
var View.xCompat: Float
    get() = ViewCompat.getX(this)
    set(value) = ViewCompat.setX(this, value)

/**
 * Call through [ViewCompat.getY] and [ViewCompat.setY]
 */
var View.yCompat: Float
    get() = ViewCompat.getY(this)
    set(value) = ViewCompat.setY(this, value)

/**
 * Call through [ViewCompat.getZ] and [ViewCompat.setZ]
 */
var View.zCompat: Float
    get() = ViewCompat.getZ(this)
    set(value) = ViewCompat.setZ(this, value)

/**
 * Call through [ViewCompat.getRotation] and [ViewCompat.setRotation]
 */
var View.rotationCompat: Float
    get() = ViewCompat.getRotation(this)
    set(value) = ViewCompat.setRotation(this, value)

/**
 * Call through [ViewCompat.getRotationX] and [ViewCompat.setRotationX]
 */
var View.rotationXCompat: Float
    get() = ViewCompat.getRotationX(this)
    set(value) = ViewCompat.setRotationX(this, value)

/**
 * Call through [ViewCompat.getRotationY] and [ViewCompat.setRotationY]
 */
var View.rotationYCompat: Float
    get() = ViewCompat.getRotationY(this)
    set(value) = ViewCompat.setRotationY(this, value)

/**
 * Call through [ViewCompat.getScaleX] and [ViewCompat.setScaleX]
 */
var View.scaleXCompat: Float
    get() = ViewCompat.getScaleX(this)
    set(value) = ViewCompat.setScaleX(this, value)

/**
 * Call through [ViewCompat.getScaleY] and [ViewCompat.setScaleY]
 */
var View.scaleYCompat: Float
    get() = ViewCompat.getScaleY(this)
    set(value) = ViewCompat.setScaleY(this, value)

/**
 * Call through [ViewCompat.getPivotX] and [ViewCompat.setPivotX]
 */
var View.pivotXCompat: Float
    get() = ViewCompat.getPivotX(this)
    set(value) = ViewCompat.setPivotX(this, value)

/**
 * Call through [ViewCompat.getPivotY] and [ViewCompat.setPivotY]
 */
var View.pivotYCompat: Float
    get() = ViewCompat.getPivotY(this)
    set(value) = ViewCompat.setPivotY(this, value)

/**
 * Call through [ViewCompat.getElevation] and [ViewCompat.setElevation]
 */
var View.elevationCompat: Float
    get() = ViewCompat.getElevation(this)
    set(value) = ViewCompat.setElevation(this, value)

/**
 * Call through [ViewCompat.getTransitionName]
 */
val View.transitionNameCompat
    get() = ViewCompat.getTransitionName(this)

/**
 * Call through [ViewCompat.getWindowSystemUiVisibility]
 */
val View.windowSystemUiVisibilityCompat
    get() = ViewCompat.getWindowSystemUiVisibility(this)

/**
 * Call through [ViewCompat.requestApplyInsets]
 */
fun View.requestApplyInsetsCompat() = ViewCompat.requestApplyInsets(this)

/**
 * Call through [ViewCompat.setChildrenDrawingOrderEnabled]
 */
fun ViewGroup.setChildrenDrawingOrderEnabledCompat(enabled: Boolean) =
        ViewCompat.setChildrenDrawingOrderEnabled(this, enabled)

/**
 * Call through [ViewCompat.getFitsSystemWindows] and [ViewCompat.setFitsSystemWindows]
 */
var View.fitsSystemWindowsCompat: Boolean
    get() = ViewCompat.getFitsSystemWindows(this)
    set(value) = ViewCompat.setFitsSystemWindows(this, value)

/**
 * Call through [ViewCompat.jumpDrawablesToCurrentState]
 */
fun View.jumpDrawablesToCurrentStateCompat() = ViewCompat.jumpDrawablesToCurrentState(this)

/**
 * Call through [ViewCompat.setOnApplyWindowInsetsListener]
 */
fun View.setOnApplyWindowInsetsListenerCompat(listener: OnApplyWindowInsetsListener) =
        ViewCompat.setOnApplyWindowInsetsListener(this, listener)

/**
 * Call through [ViewCompat.onApplyWindowInsets]
 */
fun View.onApplyWindowInsetsCompat(insets: WindowInsetsCompat) =
        ViewCompat.onApplyWindowInsets(this, insets)

/**
 * Call through [ViewCompat.dispatchApplyWindowInsets]
 */
fun View.dispatchApplyWindowInsetsCompat(insets: WindowInsetsCompat) =
        ViewCompat.dispatchApplyWindowInsets(this, insets)

/**
 * Call through [ViewCompat.setSaveFromParentEnabled] and [View.isSaveFromParentEnabled]
 */
var View.isSaveFromParentEnabledCompat: Boolean
    get() = this.isSaveFromParentEnabled
    set(value) = ViewCompat.setSaveFromParentEnabled(this, value)

/**
 * Call through [ViewCompat.setActivated] and [View.isActivated]
 */
var View.isActivatedCompat: Boolean
    get() = this.isActivated
    set(value) = ViewCompat.setActivated(this, value)

/**
 * Call through [ViewCompat.hasOverlappingRendering]
 */
val View.hasOverlappingRenderingCompat
    get() = ViewCompat.hasOverlappingRendering(this)

/**
 * Call through [ViewCompat.isPaddingRelative]
 */
val View.isPaddingRelativeCompat
    get() = ViewCompat.isPaddingRelative(this)

/**
 * Call through [ViewCompat.setBackground] and [View.getBackground]
 */
var View.backgroundCompat: Drawable?
    get() = this.background
    set(value) = ViewCompat.setBackground(this, value)

/**
 * Call through [ViewCompat.getBackgroundTintList] and [ViewCompat.setBackgroundTintList]
 */
var View.backgroundTintListCompat: ColorStateList?
    get() = ViewCompat.getBackgroundTintList(this)
    set(value) = ViewCompat.setBackgroundTintList(this, value)

/**
 * Call through [ViewCompat.getBackgroundTintMode] and [ViewCompat.setBackgroundTintMode]
 */
var View.backgroundTintModeCompat: PorterDuff.Mode?
    get() = ViewCompat.getBackgroundTintMode(this)
    set(value) = ViewCompat.setBackgroundTintMode(this, value)

/**
 * Call through [ViewCompat.isNestedScrollingEnabled] and [ViewCompat.setNestedScrollingEnabled]
 */
var View.isNestedScrollingEnabledCompat: Boolean
    get() = ViewCompat.isNestedScrollingEnabled(this)
    set(value) = ViewCompat.setNestedScrollingEnabled(this, value)

/**
 * Call through [ViewCompat.startNestedScroll]
 */
fun View.startNestedScrollCompat(axes: Int) = ViewCompat.startNestedScroll(this, axes)

/**
 * Call through [ViewCompat.stopNestedScroll]
 */
fun View.stopNestedScrollCompat() = ViewCompat.stopNestedScroll(this)

/**
 * Call through [ViewCompat.hasNestedScrollingParent]
 */
fun View.hasNestedScrollingParentCompat() = ViewCompat.hasNestedScrollingParent(this)

/**
 * Call through [ViewCompat.dispatchNestedScroll]
 */
fun View.dispatchNestedScrollCompat(dxConsumed: Int,
                                    dyConsumed: Int,
                                    dxUnconsumed: Int,
                                    dyUnconsumed: Int,
                                    offsetInWindows: IntArray? = null) =
        ViewCompat.dispatchNestedScroll(this, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindows)

/**
 * Call through [ViewCompat.dispatchNestedPreScroll]
 */
fun View.dispatchNestedPreScrollCompat(dx: Int,
                                       dy: Int,
                                       consumed: IntArray? = null,
                                       offsetInWindows: IntArray? = null) =
        ViewCompat.dispatchNestedPreScroll(this, dx, dy, consumed, offsetInWindows)

/**
 * Call through [ViewCompat.dispatchNestedFling]
 */
fun View.dispatchNestedFlingCompat(velocityX: Float,
                                   velocityY: Float,
                                   consumed: Boolean) =
        ViewCompat.dispatchNestedFling(this, velocityX, velocityY, consumed)

/**
 * Call through [ViewCompat.dispatchNestedPreFling]
 */
fun View.dispatchNestedPreFlingCompat(velocityX: Float, velocityY: Float) =
        ViewCompat.dispatchNestedPreFling(this, velocityX, velocityY)

/**
 * Call through [ViewCompat.isInLayout]
 */
val View.isInLayoutCompat
    get() = ViewCompat.isInLayout(this)

/**
 * Call through [ViewCompat.isLaidOut]
 */
val View.isLaidOutCompat
    get() = ViewCompat.isLaidOut(this)

/**
 * Call through [ViewCompat.isLayoutDirectionResolved]
 */
val View.isLayoutDirectionResolvedCompat
    get() = ViewCompat.isLayoutDirectionResolved(this)

/**
 * Call through [ViewCompat.offsetLeftAndRight]
 */
fun View.offsetLeftAndRightCompat(offset: Int) = ViewCompat.offsetLeftAndRight(this, offset)

/**
 * Call through [ViewCompat.offsetTopAndBottom]
 */
fun View.offsetTopAndBottomCompat(offset: Int) = ViewCompat.offsetTopAndBottom(this, offset)

/**
 * Call through [ViewCompat.getClipBounds] and [ViewCompat.setClipBounds]
 */
var View.clipBoundsCompat: Rect?
    get() = ViewCompat.getClipBounds(this)
    set(value) = ViewCompat.setClipBounds(this, value)

/**
 * Call through [ViewCompat.isAttachedToWindow]
 */
val View.isAttachedToWindowCompat
    get() = ViewCompat.isAttachedToWindow(this)

/**
 * Call through [ViewCompat.hasOnClickListeners]
 */
fun View.hasOnClickListenersCompat() = ViewCompat.hasOnClickListeners(this)

/**
 * Call through [ViewCompat.getScrollIndicators] and [ViewCompat.setScrollIndicators]
 */
@ViewCompat.ScrollIndicators
var View.scrollIndicatorsCompat: Int
    get() = ViewCompat.getScrollIndicators(this)
    set(value) = ViewCompat.setScrollIndicators(this, value)

/**
 * Call through [ViewCompat.setScrollIndicators]
 */
fun View.setScrollIndicatorsCompat(@ViewCompat.ScrollIndicators indicators: Int,
                                   @ViewCompat.ScrollIndicators mask: Int) =
        ViewCompat.setScrollIndicators(this, indicators, mask)

/**
 * Call through [ViewCompat.setPointerIcon]
 */
fun View.setPointerIconCompat(pointerIcon: PointerIconCompat?) = ViewCompat.setPointerIcon(this, pointerIcon)