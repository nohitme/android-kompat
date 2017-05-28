package ericlin.info.appkompat.view

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

fun View.canScrollHorizontallyCompat(direction: Int) = ViewCompat.canScrollHorizontally(this, direction)

fun View.canScrollVerticallyCompat(direction: Int) = ViewCompat.canScrollVertically(this, direction)

fun View.onPopulateAccessibilityEventCompat(event: AccessibilityEvent) = ViewCompat.onPopulateAccessibilityEvent(this, event)

fun View.onInitializeAccessibilityEventCompat(event: AccessibilityEvent) = ViewCompat.onInitializeAccessibilityEvent(this, event)

fun View.onInitializeAccessibilityNodeInfoCompat(info: AccessibilityNodeInfoCompat) = ViewCompat.onInitializeAccessibilityNodeInfo(this, info)

fun View.setAccessibilityDelegateCompat(delegate: AccessibilityDelegateCompat?) = ViewCompat.setAccessibilityDelegate(this, delegate)

val View.hasAccessibilityDelegateCompat get() = ViewCompat.hasAccessibilityDelegate(this)

var View.hasTransientStateCompat: Boolean
    get() = ViewCompat.hasTransientState(this)
    set(value) = ViewCompat.setHasTransientState(this, value)

fun View.postInvalidateOnAnimationCompat() = ViewCompat.postInvalidateOnAnimation(this)

fun View.postInvalidateOnAnimationCompat(left: Int, top: Int, right: Int, bottom: Int) = ViewCompat.postInvalidateOnAnimation(this, left, top, right, bottom)

fun View.postOnAnimationCompat(action: Runnable) = ViewCompat.postOnAnimation(this, action)

fun View.postOnAnimationDelayedCompat(action: Runnable, delayMillis: Long) = ViewCompat.postOnAnimationDelayed(this, action, delayMillis)

var View.importantForAccessibilityCompat: Int
    get() = ViewCompat.getImportantForAccessibility(this)
    set(value) = ViewCompat.setImportantForAccessibility(this, value)

val View.isImportantForAccessibilityCompat get() = ViewCompat.isImportantForAccessibility(this)

fun View.performAccessibilityActionCompat(action: Int, arguments: Bundle) = ViewCompat.performAccessibilityAction(this, action, arguments)

val View.accessibilityNodeProviderCompat get() = ViewCompat.getAccessibilityNodeProvider(this)

var View.alphaCompat: Float
    get() = ViewCompat.getAlpha(this)
    @FloatRange(from = 0.0, to = 1.0) set(value) = ViewCompat.setAlpha(this, value)

val View.layerTypeCompat get() = ViewCompat.getLayerType(this)

fun View.setLayerTypeCompat(layerType: Int, paint: Paint) = ViewCompat.setLayerType(this, layerType, paint)

var View.labelForCompat: Int
    get() = ViewCompat.getLabelFor(this)
    @IdRes
    set(value) = ViewCompat.setLabelFor(this, value)

fun View.setLayerPaintCompat(paint: Paint) = ViewCompat.setLayerPaint(this, paint)

var View.layoutDirectionCompat: Int
    get() = ViewCompat.getLayoutDirection(this)
    set(value) = ViewCompat.setLayoutDirection(this, value)

val View.parentForAccessibilityCompat get() = ViewCompat.getParentForAccessibility(this)

val View.measuredHeightAndStateCompat get() = ViewCompat.getMeasuredHeightAndState(this)

val View.measuredStateCompat get() = ViewCompat.getMeasuredState(this)

var View.accessibilityLiveRegionCompat: Int
    get() = ViewCompat.getAccessibilityLiveRegion(this)
    set(value) = ViewCompat.setAccessibilityLiveRegion(this, value)

val View.paddingStartCompat get() = ViewCompat.getPaddingStart(this)

val View.paddingEndCompat get() = ViewCompat.getPaddingEnd(this)

fun View.setPaddingRelativeCompat(start: Int, top: Int, end: Int, bottom: Int) = ViewCompat.setPaddingRelative(this, start, top, end, bottom)

fun View.dispatchStartTemporaryDetachCompat() = ViewCompat.dispatchStartTemporaryDetach(this)

fun View.dispatchFinishTemporaryDetachCompat() = ViewCompat.dispatchFinishTemporaryDetach(this)

var View.translationXCompat: Float
    get() = ViewCompat.getTranslationX(this)
    set(value) = ViewCompat.setTranslationX(this, value)

var View.translationYCompat: Float
    get() = ViewCompat.getTranslationY(this)
    set(value) = ViewCompat.setTranslationY(this, value)

var View.translationZCompat: Float
    get() = ViewCompat.getTranslationZ(this)
    set(value) = ViewCompat.setTranslationZ(this, value)

val View.matrixCompat get() = ViewCompat.getMatrix(this)

val View.minimumHeightCompat get() = ViewCompat.getMinimumHeight(this)

val View.minimumWidthCompat get() = ViewCompat.getMinimumWidth(this)

fun View.animateCompat() = ViewCompat.animate(this)

var View.xCompat: Float
    get() = ViewCompat.getX(this)
    set(value) = ViewCompat.setX(this, value)

var View.yCompat: Float
    get() = ViewCompat.getY(this)
    set(value) = ViewCompat.setY(this, value)

var View.zCompat: Float
    get() = ViewCompat.getZ(this)
    set(value) = ViewCompat.setZ(this, value)

var View.rotationCompat: Float
    get() = ViewCompat.getRotation(this)
    set(value) = ViewCompat.setRotation(this, value)

var View.rotationXCompat: Float
    get() = ViewCompat.getRotationX(this)
    set(value) = ViewCompat.setRotationX(this, value)

var View.rotationYCompat: Float
    get() = ViewCompat.getRotationY(this)
    set(value) = ViewCompat.setRotationY(this, value)

var View.scaleXCompat: Float
    get() = ViewCompat.getScaleX(this)
    set(value) = ViewCompat.setScaleX(this, value)

var View.scaleYCompat: Float
    get() = ViewCompat.getScaleY(this)
    set(value) = ViewCompat.setScaleY(this, value)

var View.pivotXCompat: Float
    get() = ViewCompat.getPivotX(this)
    set(value) = ViewCompat.setPivotX(this, value)

var View.pivotYCompat: Float
    get() = ViewCompat.getPivotY(this)
    set(value) = ViewCompat.setPivotY(this, value)

var View.elevationCompat: Float
    get() = ViewCompat.getElevation(this)
    set(value) = ViewCompat.setElevation(this, value)

val View.transitionNameCompat get() = ViewCompat.getTransitionName(this)

val View.windowSystemUiVisibilityCompat get() = ViewCompat.getWindowSystemUiVisibility(this)

fun View.requestApplyInsetsCompat() = ViewCompat.requestApplyInsets(this)

fun ViewGroup.setChildrenDrawingOrderEnabledCompat(enabled: Boolean) = ViewCompat.setChildrenDrawingOrderEnabled(this, enabled)

var View.fitsSystemWindowsCompat: Boolean
    get() = ViewCompat.getFitsSystemWindows(this)
    set(value) = ViewCompat.setFitsSystemWindows(this, value)

fun View.jumpDrawablesToCurrentStateCompat() = ViewCompat.jumpDrawablesToCurrentState(this)

fun View.setOnApplyWindowInsetsListenerCompat(listener: OnApplyWindowInsetsListener) = ViewCompat.setOnApplyWindowInsetsListener(this, listener)

fun View.onApplyWindowInsetsCompat(insets: WindowInsetsCompat) = ViewCompat.onApplyWindowInsets(this, insets)

fun View.dispatchApplyWindowInsetsCompat(insets: WindowInsetsCompat) = ViewCompat.dispatchApplyWindowInsets(this, insets)

var View.isSaveFromParentEnabledCompat: Boolean
    get() = this.isSaveFromParentEnabled
    set(value) = ViewCompat.setSaveFromParentEnabled(this, value)

var View.isActivatedCompat: Boolean
    get() = this.isActivated
    set(value) = ViewCompat.setActivated(this, value)

val View.hasOverlappingRenderingCompat get() = ViewCompat.hasOverlappingRendering(this)

val View.isPaddingRelativeCompat get() = ViewCompat.isPaddingRelative(this)

var View.backgroundCompat: Drawable?
    get() = this.background
    set(value) = ViewCompat.setBackground(this, value)

var View.backgroundTintListCompat: ColorStateList?
    get() = ViewCompat.getBackgroundTintList(this)
    set(value) = ViewCompat.setBackgroundTintList(this, value)

var View.backgroundTintModeCompat: PorterDuff.Mode?
    get() = ViewCompat.getBackgroundTintMode(this)
    set(value) = ViewCompat.setBackgroundTintMode(this, value)

var View.nestedScrollingEnabledCompat: Boolean
    get() = ViewCompat.isNestedScrollingEnabled(this)
    set(value) = ViewCompat.setNestedScrollingEnabled(this, value)

fun View.startNestedScrollCompat(axes: Int) = ViewCompat.startNestedScroll(this, axes)

fun View.stopNestedScrollCompat() = ViewCompat.stopNestedScroll(this)

val View.hasNestedScrollingParentCompat get() = ViewCompat.hasNestedScrollingParent(this)

fun View.dispatchNestedScrollCompat(dxConsumed: Int,
                                    dyConsumed: Int,
                                    dxUnconsumed: Int,
                                    dyUnconsumed: Int,
                                    offsetInWindows: IntArray? = null) =
        ViewCompat.dispatchNestedScroll(this, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindows)

fun View.dispatchNestedPreScrollCompat(dx: Int,
                                       dy: Int,
                                       consumed: IntArray? = null,
                                       offsetInWindows: IntArray? = null) =
        ViewCompat.dispatchNestedPreScroll(this, dx, dy, consumed, offsetInWindows)

fun View.dispatchNestedFlingCompat(velocityX: Float,
                                   velocityY: Float,
                                   consumed: Boolean) =
        ViewCompat.dispatchNestedFling(this, velocityX, velocityY, consumed)

fun View.dispatchNestedPreFlingCompat(velocityX: Float, velocityY: Float) =
        ViewCompat.dispatchNestedPreFling(this, velocityX, velocityY)

val View.isInLayoutCompat get() = ViewCompat.isInLayout(this)

val View.isLaidOutCompat get() = ViewCompat.isLaidOut(this)

val View.isLayoutDirectionResolvedCompat get() = ViewCompat.isLayoutDirectionResolved(this)

fun View.offsetLeftAndRightCompat(offset: Int) = ViewCompat.offsetLeftAndRight(this, offset)

fun View.offsetTopAndBottomCompat(offset: Int) = ViewCompat.offsetTopAndBottom(this, offset)

var View.clipBoundsCompat: Rect?
    get() = ViewCompat.getClipBounds(this)
    set(value) = ViewCompat.setClipBounds(this, value)

val View.isAttachedToWindowCompat get() = ViewCompat.isAttachedToWindow(this)

val View.hasOnClickListenersCompat get() = ViewCompat.hasOnClickListeners(this)

@ViewCompat.ScrollIndicators
var View.scrollIndicatorsCompat: Int
    get() = ViewCompat.getScrollIndicators(this)
    set(value) = ViewCompat.setScrollIndicators(this, value)

fun View.setScrollIndicatorsCompat(@ViewCompat.ScrollIndicators indicators: Int,
                                   @ViewCompat.ScrollIndicators mask: Int) =
        ViewCompat.setScrollIndicators(this, indicators, mask)

fun View.setPointerIconCompat(pointerIcon: PointerIconCompat?) = ViewCompat.setPointerIcon(this, pointerIcon)