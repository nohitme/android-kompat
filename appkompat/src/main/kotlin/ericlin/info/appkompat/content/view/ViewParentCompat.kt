package ericlin.info.appkompat.content.view

import android.support.v4.view.ViewParentCompat
import android.view.View
import android.view.ViewParent
import android.view.accessibility.AccessibilityEvent

/**
 * Call through [ViewParentCompat.requestSendAccessibilityEvent]
 */
fun ViewParent.requestSendAccessibilityEventCompat(child: View,
                                                   event: AccessibilityEvent) =
        ViewParentCompat.requestSendAccessibilityEvent(this, child, event)

/**
 * Call through [ViewParentCompat.onStartNestedScroll]
 */
fun ViewParent.onStartNestedScrollCompat(child: View,
                                         target: View,
                                         nestedScrollAxes: Int) =
        ViewParentCompat.onStartNestedScroll(this, child, target, nestedScrollAxes)

/**
 * Call through [ViewParentCompat.onNestedScrollAccepted]
 */
fun ViewParent.onNestedScrollAcceptedCompat(child: View,
                                            target: View,
                                            nestedScrollAxes: Int) =
        ViewParentCompat.onNestedScrollAccepted(this, child, target, nestedScrollAxes)

/**
 * Call through [ViewParentCompat.onStopNestedScroll]
 */
fun ViewParent.onStopNestedScrollCompat(target: View) = ViewParentCompat.onStopNestedScroll(this, target)

/**
 * Call through [ViewParentCompat.onNestedScroll]
 */
fun ViewParent.onNestedScrollCompat(target: View,
                                    dxConsumed: Int,
                                    dyConsumed: Int,
                                    dxUnconsumed: Int,
                                    dyUnconsumed: Int) =
        ViewParentCompat.onNestedScroll(this, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed)

fun ViewParent.onNestedPreScrollCompat(target: View,
                                       dx: Int,
                                       dy: Int,
                                       consumed: IntArray?) =
        ViewParentCompat.onNestedPreScroll(this, target, dx, dy, consumed)

/**
 * Call through [ViewParentCompat.onNestedFling]
 */
fun ViewParent.onNestedFlingCompat(target: View,
                                   velocityX: Float,
                                   velocityY: Float,
                                   consumed: Boolean) =
        ViewParentCompat.onNestedFling(this, target, velocityX, velocityY, consumed)

/**
 * Call through [ViewParentCompat.onNestedPreFling]
 */
fun ViewParent.onNestedPreFlingCompat(target: View,
                                      velocityX: Float,
                                      velocityY: Float) =
        ViewParentCompat.onNestedPreFling(this, target, velocityX, velocityY)

/**
 * Call through [ViewParentCompat.notifySubtreeAccessibilityStateChanged]
 */
fun ViewParent.notifySubtreeAccessibilityStateChangedCompat(child: View,
                                                            source: View,
                                                            changeType: Int) =
        ViewParentCompat.notifySubtreeAccessibilityStateChanged(this, child, source, changeType)